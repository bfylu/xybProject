package com.xyb.shop.controller;

import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.shop.dto.MemberConsumeDto;
import com.xyb.shop.model.xyb.MemberConsume;
import com.xyb.shop.service.MemberConsumeService;
import com.xyb.shop.vo.MemberConsumeVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>订单管理</p>
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/18 12:00
 * @email bfyjian@gmail.com
 */
@RestController
@Api(tags = "订单管理")
@RequestMapping(value = "admin/order")
public class MemberConsumeController extends BaseController {

    @Autowired
    private MemberConsumeService memberConsumeService;

    @ApiOperation("按条件查询订单数据 ---> 卢健")
    @PostMapping("/getOrders")
    public BaseResp<PageInfo<MemberConsumeVo>> getOrders(MemberConsumeDto memberConsumeDto,
                                                         @ApiParam("sessionToken") @RequestParam(value = "sessionToken", required = false ) String sessionToken,
                                                         @ApiParam("第几页") @RequestParam(value = "page", defaultValue = "1") int page,
                                                         @ApiParam("当前页的数据条数") @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<MemberConsume> pageInfo = memberConsumeService.queryOrder(memberConsumeDto, page, pageSize);
        //取出需要转换的页内容
        List<MemberConsume> memberConsumeList = pageInfo.getList();
        //屏蔽一些字段，只显示TuserVo中的字段
        List<MemberConsumeVo> memberConsumeVoList = JsonUtil.convertList(memberConsumeList, MemberConsumeVo.class);
        for (MemberConsumeVo memberConsumeVo : memberConsumeVoList) {

        }

        //把原来的分页数据拷贝过来，如：当前页,每页的数量,总记录数,总页数,是否为第一页,是否为最后一页
        PageInfo<MemberConsumeVo> pageInfoVo = JsonUtil.convert(pageInfo, MemberConsumeVo.class);
        //放入转换后的内容
        pageInfoVo.setList(memberConsumeVoList);
        return BaseResp.success("获取所有商户信息成功", pageInfoVo);
    }

}
