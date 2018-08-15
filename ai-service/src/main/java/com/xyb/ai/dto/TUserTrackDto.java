package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
public class TUserTrackDto {

    @ApiParam("用户Id")
    private String userId;

    @ApiParam("用户详细地址")
    private String curAddress;

    @ApiParam("经度")
    private BigDecimal longitude;

    @ApiParam("纬度")
    private BigDecimal latitude;

    @ApiParam("市")
    private String city;

    @ApiParam("区")
    private String area;
}
