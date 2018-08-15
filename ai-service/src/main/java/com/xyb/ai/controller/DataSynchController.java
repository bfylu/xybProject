package com.xyb.ai.controller;

import com.xyb.ai.model.ai.TMerchant;
import com.xyb.ai.service.MerDataSynchService;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "数据同步接口")
@RestController
@RequestMapping(value = "/DataSynch")
public class DataSynchController {

    @Autowired
    private MerDataSynchService merDataSynchService;

    @ApiOperation("同步商户数据 -> 张楠")
    @PostMapping("/SynchMerData")
    public BaseResp insertMerData(TMerchant tMerchant,String merCode) {
        if (U.isBlank(merCode)){
            return BaseResp.fail("商户编号不能为空");
        }
        if (U.isBlank(tMerchant)){
            return BaseResp.fail("商户数据不能为空");
        }
        tMerchant.setUserId(merCode);
        boolean b = merDataSynchService.SynchMerData(tMerchant);
        if (!b){
            BaseResp.fail("数据已存在");
        }
        return BaseResp.success("成功");

    }

}
