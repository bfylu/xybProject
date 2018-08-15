package com.xyb.ai.controller;

import com.xyb.ai.dto.UserAndActionDto;
import com.xyb.ai.service.TUserPositionService;
import com.xyb.ai.vo.AiCustomerInfoVo;
import com.xyb.common.BaseController;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "AI客户信息接口")
@RestController
@RequestMapping(value = "/aiCustomerInfo")
public class AICustomerInfoController extends BaseController {

    @Autowired
    private TUserPositionService tUserPositionService;

    @ApiOperation("获取客户详情 -> 张楠")
    @GetMapping("/getCustomerInfo")
    public BaseResp getCustomerInfo(@ApiParam("用户编号userId") @RequestParam("userId") String id,
                                    @ApiParam("商户merCode") @RequestParam("merCode") String merCode) {

        if (U.isBlank(id) || U.isBlank(merCode)) {
            return BaseResp.fail("字段不能为空");
        }

        UserAndActionDto customerInfo = tUserPositionService.getCustomerInfo(id, merCode);
        if (null==customerInfo){
            return BaseResp.fail("用户未找到");
        }
        AiCustomerInfoVo info = JsonUtil.convert(customerInfo, AiCustomerInfoVo.class);
        return BaseResp.success("成功", info);
    }
}
