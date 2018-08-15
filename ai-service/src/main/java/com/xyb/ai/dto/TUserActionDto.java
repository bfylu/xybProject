package com.xyb.ai.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TUserActionDto {

    @ApiParam("用户Id")
    private String userId;

    @ApiParam("商品引用号")
    private String refNo;

    @ApiParam("用户行为状态:0-浏览;1-未支付;2-支付成功;3-取消订单；4-访问店铺；5-分享商品；6-分享小程序店铺；")
    private Short actionState;

    @ApiParam("商户编码")
    private String merCode;





}
