package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TControlParamDto {
    @ApiParam("参数代码")
    private String paramCode;

    @ApiParam("参数名称")
    private String paramName;

    @ApiParam("参数类型")
    private String paramType;

    @ApiParam("参数值")
    private String value;

    @ApiParam("单位")
    private String unit;
}
