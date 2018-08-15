package com.xyb.shop.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>订单查询的条件</p>
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/18 11:24
 * @email bfyjian@gmail.com
 */
@Setter
@Getter
@NoArgsConstructor
public class MemberConsumeDto {

    @ApiParam("订单编号")
    private String orderNo;
    @ApiParam("买家用户名")
    private String buyerUsername;
    @ApiParam("收货人手机")
    private String userPhone;
    @ApiParam("商户名称")
    private String s;
    @ApiParam("卖家商户号")
    private String sellerMerCode;


}
