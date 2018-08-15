package com.xyb.ai.controller;

import com.xyb.ai.dto.TChatExtendsTUserTrackDto;
import com.xyb.ai.service.TUserChatService;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "AI聊天名单接口")
@RestController
@RequestMapping(value = "/aiChatRoster")
public class AIChatRosterController extends BaseController {

    @Autowired
    private TUserChatService tUserChatService;

    @ApiOperation("获取商户聊天列表 -> 张楠")
    @GetMapping("/getMerChatList")
    public BaseResp getMerChatList(@ApiParam("商户编号") @RequestParam("merCode") String merCode,
                                   @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                   @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        if (U.isBlank(merCode)) {
            return BaseResp.fail("商户编号不能为空");
        }
        PageInfo<TChatExtendsTUserTrackDto> merChatList = tUserChatService.getMerChatList(merCode, pageNum, pageSize);
        if (null == merChatList) {
            return BaseResp.success("");
        }

        return BaseResp.success("成功", merChatList);
    }
}
