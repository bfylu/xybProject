package com.xyb.ai.controller;

import com.xyb.ai.dto.TUserActionDto;
import com.xyb.ai.model.ai.TUserAction;
import com.xyb.ai.service.TUserActionService;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户行为操作接口")
@RestController
@RequestMapping(value = "/userAction")
public class UserActionController extends BaseResp {

    @Autowired
    private TUserActionService tUserActionService;

    @PostMapping("/add")
    @ApiOperation("添加用户行为记录接口 -> 李振伟")
    BaseResp addTUserAction(TUserActionDto tUserActionDto) {
        TUserAction tUserAction = JsonUtil.convert(tUserActionDto, TUserAction.class);
        boolean ok = tUserActionService.insertSelective(tUserAction);
        if (!ok) {
            return BaseResp.success("添加用户行为记录失败");
        }
        return BaseResp.success("添加用户行为记录成功");
    }

}

