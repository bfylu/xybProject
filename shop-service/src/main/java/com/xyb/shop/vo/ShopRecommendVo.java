package com.xyb.shop.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * <p>商户推荐信息</p>
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/17 16:12
 * @email bfyjian@gmail.com
 */

@Setter
@Getter
@NoArgsConstructor
@ApiModel(description= "返回响应数据")
public class ShopRecommendVo {

    @ApiModelProperty("商户编号")
    private String merCode;
    @ApiModelProperty("商户名称")
    private String username;
    @ApiModelProperty("店铺名称")
    private String shopName;
    @ApiModelProperty("商品数量")
    private Long countGoods;
    @ApiModelProperty("当前销量")
    private Long countGoodsSale;
    @ApiModelProperty("注册日期")
    private Date openTime;

}
