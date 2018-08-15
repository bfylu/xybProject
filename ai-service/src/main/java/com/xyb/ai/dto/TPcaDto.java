package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TPcaDto {
    @ApiParam("pcaCode")
    private String pcaCode;

    @ApiParam("地址名称")
    private String pcaName;
}
