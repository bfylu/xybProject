package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class TUserPositionDto {
    @ApiParam("用户Id")
    private String userId;

    @ApiParam("头像")
    private String userJmgUrl;

    @ApiParam("昵称")
    private String nick;

    @ApiParam("性别,0-未知；1-男；2-女")
    private Short sex;

    @ApiParam("手机号")
    private String phone;

    @ApiParam("经度")
    private BigDecimal longitude;

    @ApiParam("纬度")
    private BigDecimal latitude;

    @ApiParam("创建时间")
    private Date createDt;

    @ApiParam("更新时间")
    private Date updateDt;


}
