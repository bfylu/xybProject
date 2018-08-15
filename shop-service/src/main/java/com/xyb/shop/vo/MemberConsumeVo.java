package com.xyb.shop.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/7/18 12:05
 * @email bfyjian@gmail.com
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel("返回响应订单数据")
public class MemberConsumeVo {

    @ApiModelProperty("订单编号")
    private String orderNo;
    @ApiModelProperty("订单创建时间")
    private Date createTime;
    @ApiModelProperty("商品名称")
    private String goodsName;
    @ApiModelProperty("收货人姓名")
    private String userName;
    @ApiModelProperty("收货人手机")
    private String userPhone;
    @ApiModelProperty("商户名称")
    private String shopName;
    @ApiModelProperty("商户编号")
    private String sellerMerCode;
    @ApiModelProperty("消费金额")
    private BigDecimal orderAmount;
    @ApiModelProperty("当前'状态；\\n0 - 订单提交\\n1 - 已付款\\n2 - 已完成\\n3 - 撤销中\\n4 - 已取消\\n5 - 退款中\\n6 - 已退款\\n7 - 订单关闭\\n8 - 订单删除")
    private Integer orderStatus;
}
