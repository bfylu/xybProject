package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppletsOrders implements Serializable {
    private Long orderId;

    private String orderNo;

    private String provinceCode;

    private String cityCode;

    private String areaCode;

    private String merCode;

    private Long goodsId;

    private String goodsName;

    private String goodsSnapshotIds;

    private Integer orderStatus;

    private BigDecimal goodsPrice;

    private String goodsPic;

    private Integer goodsCount;

    private BigDecimal totalMoney;

    private BigDecimal deliverMoney;

    private Integer payType;

    private Integer isPay;

    private String openId;

    private Integer addressId;

    private Integer isInvoice;

    private String invoiceClient;

    private String orderRemarks;

    private String outTradeNo;

    private Integer orderSrc;

    private Integer orderFlag;

    private String transactionId;

    private Integer payfRom;

    private BigDecimal realOtalOney;

    private BigDecimal payTotalMoney;

    private Date pryTime;

    private Date orderCompletionTime;

    private Date ordersCancelTime;

    private Date orderRefundTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsSnapshotIds() {
        return goodsSnapshotIds;
    }

    public void setGoodsSnapshotIds(String goodsSnapshotIds) {
        this.goodsSnapshotIds = goodsSnapshotIds == null ? null : goodsSnapshotIds.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getDeliverMoney() {
        return deliverMoney;
    }

    public void setDeliverMoney(BigDecimal deliverMoney) {
        this.deliverMoney = deliverMoney;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceClient() {
        return invoiceClient;
    }

    public void setInvoiceClient(String invoiceClient) {
        this.invoiceClient = invoiceClient == null ? null : invoiceClient.trim();
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks == null ? null : orderRemarks.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Integer getOrderSrc() {
        return orderSrc;
    }

    public void setOrderSrc(Integer orderSrc) {
        this.orderSrc = orderSrc;
    }

    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getPayfRom() {
        return payfRom;
    }

    public void setPayfRom(Integer payfRom) {
        this.payfRom = payfRom;
    }

    public BigDecimal getRealOtalOney() {
        return realOtalOney;
    }

    public void setRealOtalOney(BigDecimal realOtalOney) {
        this.realOtalOney = realOtalOney;
    }

    public BigDecimal getPayTotalMoney() {
        return payTotalMoney;
    }

    public void setPayTotalMoney(BigDecimal payTotalMoney) {
        this.payTotalMoney = payTotalMoney;
    }

    public Date getPryTime() {
        return pryTime;
    }

    public void setPryTime(Date pryTime) {
        this.pryTime = pryTime;
    }

    public Date getOrderCompletionTime() {
        return orderCompletionTime;
    }

    public void setOrderCompletionTime(Date orderCompletionTime) {
        this.orderCompletionTime = orderCompletionTime;
    }

    public Date getOrdersCancelTime() {
        return ordersCancelTime;
    }

    public void setOrdersCancelTime(Date ordersCancelTime) {
        this.ordersCancelTime = ordersCancelTime;
    }

    public Date getOrderRefundTime() {
        return orderRefundTime;
    }

    public void setOrderRefundTime(Date orderRefundTime) {
        this.orderRefundTime = orderRefundTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", merCode=").append(merCode);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSnapshotIds=").append(goodsSnapshotIds);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", deliverMoney=").append(deliverMoney);
        sb.append(", payType=").append(payType);
        sb.append(", isPay=").append(isPay);
        sb.append(", openId=").append(openId);
        sb.append(", addressId=").append(addressId);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", invoiceClient=").append(invoiceClient);
        sb.append(", orderRemarks=").append(orderRemarks);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", orderSrc=").append(orderSrc);
        sb.append(", orderFlag=").append(orderFlag);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", payfRom=").append(payfRom);
        sb.append(", realOtalOney=").append(realOtalOney);
        sb.append(", payTotalMoney=").append(payTotalMoney);
        sb.append(", pryTime=").append(pryTime);
        sb.append(", orderCompletionTime=").append(orderCompletionTime);
        sb.append(", ordersCancelTime=").append(ordersCancelTime);
        sb.append(", orderRefundTime=").append(orderRefundTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}