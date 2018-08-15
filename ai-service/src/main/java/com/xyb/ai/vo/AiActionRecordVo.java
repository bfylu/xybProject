package com.xyb.ai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class AiActionRecordVo {

    @ApiModelProperty("用户编号")
    private String userId;

    @ApiModelProperty("用户头像")
    private String userJmgUrl;

    @ApiModelProperty("用户性别, 0-未知；1-男；2-女")
    private Short sex;

    @ApiModelProperty("内容")
    private String content;
    
}
