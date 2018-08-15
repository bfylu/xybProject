package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class TChatExtendsTUserTrackDto extends UserAndActionDto {

    @ApiParam("买家ID")
    private String buyUserId;

    @ApiParam("聊天内容")
    private String content;

    @ApiParam("创建时间")
    private Date createDt;
}
