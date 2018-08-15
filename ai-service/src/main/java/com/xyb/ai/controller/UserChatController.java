package com.xyb.ai.controller;

import com.xyb.ai.dto.TUserChatDto;
import com.xyb.ai.model.ai.TUserChat;
import com.xyb.ai.service.TUserChatService;
import com.xyb.ai.vo.TUserChatVo;
import com.xyb.common.BaseController;
import com.xyb.common.PageInfo;
import com.xyb.common.json.BaseResp;
import com.xyb.common.util.JsonUtil;
import com.xyb.common.util.U;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "聊天接口")
@RestController
@RequestMapping(value = "/userChat")
public class UserChatController extends BaseController {

    @Autowired
    private TUserChatService tUserChatService;

    @PostMapping("/add")
    @ApiOperation("添加聊天记录 -> 陈旭东 (发送消息时添加数据 msgStatus = 0 ,成功回调--> update: msgStatus = 1 )")
    public BaseResp addTUserChat(TUserChatDto tUserChatDto) {
        //转换成需要显示的类型
        TUserChat tUserChat = JsonUtil.convert(tUserChatDto, TUserChat.class);
        TUserChat ok = tUserChatService.insertSelective(tUserChat);

        if (U.isBlank(ok)) {
            return BaseResp.fail("add聊天信息失败");
        }

        log.info("Return id:" + ok.getId());
        return BaseResp.success( "添加聊天记录成功", ok);
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除聊天记录 -> 陈旭东")
    public BaseResp delTUserChat(@ApiParam("id") @RequestParam Long id) {
        int ok = tUserChatService.deleteByPrimaryKey(id);
        if (ok == 0) {
            return BaseResp.fail("删除聊天信息失败");
        }

        return BaseResp.success("删除聊天信息成功");
    }

    @PostMapping("/update")
    @ApiOperation("修改聊天记录 -> 陈旭东")
    public BaseResp updateTUserChat(TUserChat tUserChat) {
        TUserChat TUserChat1 = tUserChatService.updateByPrimaryKey(tUserChat);
        if (U.isBlank(TUserChat1)) {
            return BaseResp.fail("修改聊天信息失败");
        }
        return BaseResp.success("修改聊天信息成功");
    }

    @GetMapping("/select")
    @ApiOperation("获取聊天信息 -> 陈旭东")
    public BaseResp<TUserChatVo> selecTUserChat(@ApiParam("id") @RequestParam Long id) {
        TUserChat tUserChat = tUserChatService.selectByPrimaryKey(id);
        if (U.isBlank(tUserChat)) {
            return BaseResp.fail("无聊天数据");
        }

        //转换成需要显示的类型
        TUserChatVo tUserChatVo = JsonUtil.convert(tUserChat, TUserChatVo.class);

        return BaseResp.success("获取聊天信息成功", tUserChatVo);
    }

    @GetMapping("/findByCondition")
    @ApiOperation("根据条件查找聊天信息 -> 陈旭东")
    public BaseResp<PageInfo<TUserChat>> findByCondition(TUserChat tUserChat,
                                                         @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                         @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<TUserChat> pageInfoTUserChat = tUserChatService.findByCondition(tUserChat, pageNum, pageSize);
        if (U.isBlank(pageInfoTUserChat)) {
            return BaseResp.fail("无聊天数据");
        }

        return BaseResp.success("根据条件查找聊天信息成功", pageInfoTUserChat);
    }
}
