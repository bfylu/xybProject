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
public class TControlParamVo {
    @ApiModelProperty("参数代码")
    private String paramCode;

    @ApiModelProperty("参数名称")
    private String paramName;

    @ApiModelProperty("参数类型")
    private String paramType;

    @ApiModelProperty("参数值")
    private String value;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("备注")
    private String description;
}
