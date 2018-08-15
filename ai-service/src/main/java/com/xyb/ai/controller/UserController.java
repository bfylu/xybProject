package com.xyb.ai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xyb.ai.dto.TUserDto;
import com.xyb.ai.model.ai.TUser;
import com.xyb.ai.service.TUserService;
import com.xyb.ai.vo.TUserVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.A;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Api(tags = "范例接口")
@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    private TUserService tUserService;

//    @Autowired
//    RestTemplateBuilder restTemplateBuilder;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/callUrlFuntion")
    @ApiOperation("远程调用接口 -> 陈旭东")
    @HystrixCommand(fallbackMethod = "calUrlError")
    public BaseResp callUrlFuntion(String userId) {
//        RestTemplate client = restTemplateBuilder.build();

//        String ddd = "http://localhost:8080/user/getUserByPage?pageNum=1&pageSize=4";
//        BaseResp tUser = client.getForObject(ddd, BaseResp.class);

//        String url = "http://localhost:8080/user/select?userId={userId}";
        String url = "http://ai-service/user/select?userId={userId}";
        BaseResp tUser = restTemplate.getForObject(url, BaseResp.class, userId);

        return tUser;
    }

    public BaseResp calUrlError(String userId) {
        return null;
    }

    public BaseResp addUserError(TUserDto tUserDto) {
        return BaseResp.fail("add用户信息失败！！！");
    }

    @PostMapping("/add")
    @ApiOperation("添加用户记录 -> 陈旭东")
    @HystrixCommand(fallbackMethod = "addUserError")
    public BaseResp addTUser(TUserDto tUserDto) {
        //转换成需要显示的类型
        TUser tUser = JsonUtil.convert(tUserDto, TUser.class);
        TUser ok = tUserService.insertSelective(tUser);

        if (U.isBlank(ok)) {
            return BaseResp.fail("add用户信息失败");
        }

        log.info("Return UserId:" + ok.getUserId());
        return BaseResp.success("添加用户记录成功", "");
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除用户记录 -> 陈旭东")
    public BaseResp delTUser(@ApiParam("用户id") @RequestParam Integer userId) {
        int ok = tUserService.deleteByPrimaryKey(userId);
        if (ok == 0) {
            return BaseResp.fail("删除用户信息失败");
        }

        return BaseResp.success("删除用户信息成功", "");
    }

    @PostMapping("/update")
    @ApiOperation("修改用户记录 -> 陈旭东")
    public BaseResp updateTUser(TUser tUser) {
        TUser tUser1 = tUserService.updateByPrimaryKey(tUser);
        if (U.isBlank(tUser1)) {
            return BaseResp.fail("修改用户信息失败");
        }
        return BaseResp.success("修改用户信息成功", "");
    }

    @GetMapping("/select")
    @ApiOperation("获取用户信息 -> 陈旭东")
    public BaseResp<TUserVo> selectUser(@ApiParam("用户id") @RequestParam Integer userId) {
        TUser tUser = tUserService.selectByPrimaryKey(userId);
        if (U.isBlank(tUser)) {
            return BaseResp.fail("无用户数据");
        }

        //转换成需要显示的类型
        TUserVo TUserVo = JsonUtil.convert(tUser, TUserVo.class);

        return BaseResp.success("获取用户信息成功", TUserVo);
    }

    @GetMapping("/all")
    @ApiOperation("获取所有用户信息 -> 陈旭东")
    public BaseResp<List<TUser>> allTUser() {
        List<TUser> listTUser = tUserService.findAllTUser();
        if (A.isEmpty(listTUser)) {
            return BaseResp.fail("无用户数据");
        }

        return BaseResp.success("获取所有用户信息成功", listTUser);
    }

    @GetMapping("/findByCondition")
    @ApiOperation("根据条件查找用户信息 -> 陈旭东")
    public BaseResp<PageInfo<TUser>> findByCondition(TUser tUser,
                                                     @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                     @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<TUser> pageInfoTUser = tUserService.findByCondition(tUser, pageNum, pageSize);
        if (U.isBlank(pageInfoTUser)) {
            return BaseResp.fail("无用户数据");
        }

        return BaseResp.success("根据条件查找用户信息成功", pageInfoTUser);
    }

    @GetMapping("/getUserByPage")
    @ApiOperation("分页用户信息 -> 陈旭东")
    public BaseResp<PageInfo<TUserVo>> getTUserByPage(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        PageInfo<TUser> pageInfo = tUserService.findByPage(pageNum, pageSize);

        //        Integer.valueOf("dfdfdf");

        //取出需要转换的页内容
        List<TUser> listTUser = pageInfo.getList();

        //屏蔽一些字段，只显示TuserVo中的字段
        List<TUserVo> listTUserVo = JsonUtil.convertList(listTUser, TUserVo.class);

        //把原来的分页数据拷贝过来，如：当前页,每页的数量,总记录数,总页数,是否为第一页,是否为最后一页
        PageInfo<TUserVo> pageInfoVo = JsonUtil.convert(pageInfo, TUserVo.class);
        //放入转换后的内容
        pageInfoVo.setList(listTUserVo);

        return BaseResp.success("分页用户信息成功", pageInfoVo);
    }

    @PostMapping("/getUsers")
    @ApiOperation("getUsers -> 陈旭东")
    public BaseResp<TUser> getUsers(@RequestBody TUser tUser) {

        return BaseResp.success("获取用户信息成功", tUser);
    }
}
