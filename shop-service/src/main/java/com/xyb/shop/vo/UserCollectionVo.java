package com.xyb.shop.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class UserCollectionVo {

    @ApiModelProperty("用户openId")
    private String openId;

    @ApiModelProperty("店铺编码")
    private String merCode;

    @ApiModelProperty("商品引用号")
    private String refNos;

    @ApiModelProperty("是否关注Y/N")
    private String isCollection;
    //--
    @ApiModelProperty("店铺头像")
    private String  shopLogo;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("店铺编号")
    private String shopNo;

    @ApiModelProperty("店铺总销量")
    private long shopTotalSale;

    @ApiModelProperty("店铺热门商品")
    private String shopHotGoodsList;




}
