package com.xyb.shop.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description = "商铺对象")
public class ShopVo {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("商户编号")
    private String merCode;

    @ApiModelProperty("所属行业")
    private String businessCode;

    @ApiModelProperty("商铺名")
    private String shopName;

    @ApiModelProperty("商铺Logo")
    private String shopLogo;

    @ApiModelProperty("商铺Logo")
    private String shopPhoto;

    @ApiModelProperty("门店电话")
    private String shopPhone;

    @ApiModelProperty("商铺地址")
    private String shopAddress;

    @ApiModelProperty("商铺经度")
    private Double longitude;

    @ApiModelProperty("商铺纬度")
    private Double latitude;

    @ApiModelProperty("商家是否开通小程序,0-关闭,1开通")
    private Integer storeStats;

}
