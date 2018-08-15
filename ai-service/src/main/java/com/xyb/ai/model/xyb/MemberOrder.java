package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberOrder implements Serializable {
    private Long id;

    private String memberNo;

    private String buyerUsername;

    private String sellerMerCode;

    private String billNo;

    private String orderNo;

    private BigDecimal orderAmount;

    private BigDecimal consumptionIntegral;

    private BigDecimal convertibilityRate;

    private String orderDesc;

    private Integer orderStatus;

    private Integer takeMethod;

    private String paymentOrderNo;

    private BigDecimal paymentAmount;

    private String installmentOrderNo;

    private BigDecimal installmentAmount;

    private String goodsSnapshotIds;

    private String isFinish;

    private String remark;

    private String consigneeName;

    private String consigneePhone;

    private String consigneeTel;

    private Integer orderType;

    private String provinceCode;

    private String cityCode;

    private String areaCode;

    private String address;

    private Integer postCode;

    private Integer isInvoice;

    private String invoiceClient;

    private Integer isdel;

    private Date orderTime;

    private Date expireTime;

    private Date paymentTime;

    private Date refundTime;

    private Date cancelRefundTime;

    private Date completeRefundTime;

    private Date cancelOrderTime;

    private Date closeOrderTime;

    private Date deleteOrderTime;

    private Date deliverGoodsTime;

    private Date finishTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername == null ? null : buyerUsername.trim();
    }

    public String getSellerMerCode() {
        return sellerMerCode;
    }

    public void setSellerMerCode(String sellerMerCode) {
        this.sellerMerCode = sellerMerCode == null ? null : sellerMerCode.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getConsumptionIntegral() {
        return consumptionIntegral;
    }

    public void setConsumptionIntegral(BigDecimal consumptionIntegral) {
        this.consumptionIntegral = consumptionIntegral;
    }

    public BigDecimal getConvertibilityRate() {
        return convertibilityRate;
    }

    public void setConvertibilityRate(BigDecimal convertibilityRate) {
        this.convertibilityRate = convertibilityRate;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getTakeMethod() {
        return takeMethod;
    }

    public void setTakeMethod(Integer takeMethod) {
        this.takeMethod = takeMethod;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo == null ? null : paymentOrderNo.trim();
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getInstallmentOrderNo() {
        return installmentOrderNo;
    }

    public void setInstallmentOrderNo(String installmentOrderNo) {
        this.installmentOrderNo = installmentOrderNo == null ? null : installmentOrderNo.trim();
    }

    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(BigDecimal installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getGoodsSnapshotIds() {
        return goodsSnapshotIds;
    }

    public void setGoodsSnapshotIds(String goodsSnapshotIds) {
        this.goodsSnapshotIds = goodsSnapshotIds == null ? null : goodsSnapshotIds.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone == null ? null : consigneePhone.trim();
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel == null ? null : consigneeTel.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
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

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Date getCancelRefundTime() {
        return cancelRefundTime;
    }

    public void setCancelRefundTime(Date cancelRefundTime) {
        this.cancelRefundTime = cancelRefundTime;
    }

    public Date getCompleteRefundTime() {
        return completeRefundTime;
    }

    public void setCompleteRefundTime(Date completeRefundTime) {
        this.completeRefundTime = completeRefundTime;
    }

    public Date getCancelOrderTime() {
        return cancelOrderTime;
    }

    public void setCancelOrderTime(Date cancelOrderTime) {
        this.cancelOrderTime = cancelOrderTime;
    }

    public Date getCloseOrderTime() {
        return closeOrderTime;
    }

    public void setCloseOrderTime(Date closeOrderTime) {
        this.closeOrderTime = closeOrderTime;
    }

    public Date getDeleteOrderTime() {
        return deleteOrderTime;
    }

    public void setDeleteOrderTime(Date deleteOrderTime) {
        this.deleteOrderTime = deleteOrderTime;
    }

    public Date getDeliverGoodsTime() {
        return deliverGoodsTime;
    }

    public void setDeliverGoodsTime(Date deliverGoodsTime) {
        this.deliverGoodsTime = deliverGoodsTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
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
        sb.append(", id=").append(id);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", buyerUsername=").append(buyerUsername);
        sb.append(", sellerMerCode=").append(sellerMerCode);
        sb.append(", billNo=").append(billNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", consumptionIntegral=").append(consumptionIntegral);
        sb.append(", convertibilityRate=").append(convertibilityRate);
        sb.append(", orderDesc=").append(orderDesc);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", takeMethod=").append(takeMethod);
        sb.append(", paymentOrderNo=").append(paymentOrderNo);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", installmentOrderNo=").append(installmentOrderNo);
        sb.append(", installmentAmount=").append(installmentAmount);
        sb.append(", goodsSnapshotIds=").append(goodsSnapshotIds);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", remark=").append(remark);
        sb.append(", consigneeName=").append(consigneeName);
        sb.append(", consigneePhone=").append(consigneePhone);
        sb.append(", consigneeTel=").append(consigneeTel);
        sb.append(", orderType=").append(orderType);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", invoiceClient=").append(invoiceClient);
        sb.append(", isdel=").append(isdel);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", cancelRefundTime=").append(cancelRefundTime);
        sb.append(", completeRefundTime=").append(completeRefundTime);
        sb.append(", cancelOrderTime=").append(cancelOrderTime);
        sb.append(", closeOrderTime=").append(closeOrderTime);
        sb.append(", deleteOrderTime=").append(deleteOrderTime);
        sb.append(", deliverGoodsTime=").append(deliverGoodsTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}