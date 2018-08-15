package com.xyb.ai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description = "返回响应数据")
public class TUserChatVo {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("发送者ID")
    private Integer fromUserId;

    @ApiModelProperty("接受者ID")
    private Integer toUserId;

    @ApiModelProperty("聊天内容")
    private String content;

    @ApiModelProperty("聊天时间")
    private Date chatTime;

    @ApiModelProperty("消息类型ID")
    private Integer messageTypeId;

    @ApiModelProperty("接收状态")
    private Short msgStatus;

    @ApiModelProperty("创建时间")
    private Date createDt;
}
