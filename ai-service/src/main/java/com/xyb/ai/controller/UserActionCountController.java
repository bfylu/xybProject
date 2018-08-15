package com.xyb.ai.controller;

import com.xyb.ai.dto.UserAndActionCountDto;
import com.xyb.ai.model.ai.TUserActionCount;
import com.xyb.ai.service.TUserActionCountService;
import com.xyb.ai.vo.AiVisitorDynamicVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户行为统计接口")
@RestController
@RequestMapping(value = "/userActionCount")
public class UserActionCountController extends BaseController {

    @Autowired
    private TUserActionCountService tUserActionCountService;

    @ApiOperation("获取访客动态 -> 张楠")
    @GetMapping("/getVisitorDynamic")
    public BaseResp getVisitorDynamic(TUserActionCount tUserActionCount,
                                      @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                      @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        if (U.isBlank(tUserActionCount.getUserId()) || U.isBlank(tUserActionCount.getMerCode())) {
            return BaseResp.fail("userId或merCode不能为空");
        }

        PageInfo<UserAndActionCountDto> pageInfo = tUserActionCountService.getVisitorDynamic(tUserActionCount, pageNum, pageSize);
        if (null==pageInfo){
            return BaseResp.success("");
        }
        List<UserAndActionCountDto> list = pageInfo.getList();
        List<AiVisitorDynamicVo> aiVisitorDynamicVos = JsonUtil.convertList(list, AiVisitorDynamicVo.class);
        PageInfo info = JsonUtil.convert(pageInfo, AiVisitorDynamicVo.class);
        info.setList(aiVisitorDynamicVos);
        return BaseResp.success("成功", info);
    }
}
