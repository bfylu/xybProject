package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TUserChatDto {

    @ApiParam("发送者ID")
    private String buyUserId;

    @ApiParam("接受者ID")
    private String merCode;

    @ApiParam("聊天内容")
    private String content;

    @ApiParam("消息类型:1-买家发送消息;2-卖家发送消息")
    private  Integer messageTypeId;

    @ApiParam("接收状态;0- 发送中；1- 成功;")
    private Short msgStatus;

}
