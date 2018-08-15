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
@ApiModel(description= "返回响应数据")
public class AiVisitorDynamicVo {

    @ApiModelProperty("用户头像")
    private String userJmgUrl;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("统计次数")
    private Integer actionCount;

    @ApiModelProperty("日期")
    private String date;

    @ApiModelProperty("详细时间")
    private Date updateDt;

    @ApiModelProperty("时间戳")
    private Long timeStamp;
}
