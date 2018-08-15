package com.xyb.shop.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserCollectionDto {

    @ApiParam("用户id")
    private String openId;

    @ApiParam("店铺编码")
    private String merCode;

}
