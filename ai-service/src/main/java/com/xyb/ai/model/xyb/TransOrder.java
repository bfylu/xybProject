package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransOrder implements Serializable {
    private Long id;

    private String merCode;

    private String subMerCode;

    private String username;

    private String bizType;

    private String bizSubtype;

    private String orderNo;

    private String outOrderNo;

    private String orderType;

    private BigDecimal orderAmount;

    private BigDecimal freeAmount;

    private String freeMethod;

    private Date orderTime;

    private Date orderExpire;

    private String orderDesc;

    private String orderStatus;

    private String goodsSnapshotIds;

    private String optSys;

    private BigDecimal chargeAmount;

    private String origOrderNo;

    private Date origOrderTime;

    private String payType;

    private String payMethod;

    private String payerType;

    private String payerId;

    private String payeeType;

    private String payeeId;

    private String terminalType;

    private String terminalNo;

    private String payStatus;

    private String refundStatus;

    private String cancelStatus;

    private String ext1;

    private String ext2;

    private String ext3;

    private String isUserTotal;

    private String reserve;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getSubMerCode() {
        return subMerCode;
    }

    public void setSubMerCode(String subMerCode) {
        this.subMerCode = subMerCode == null ? null : subMerCode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getBizSubtype() {
        return bizSubtype;
    }

    public void setBizSubtype(String bizSubtype) {
        this.bizSubtype = bizSubtype == null ? null : bizSubtype.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(BigDecimal freeAmount) {
        this.freeAmount = freeAmount;
    }

    public String getFreeMethod() {
        return freeMethod;
    }

    public void setFreeMethod(String freeMethod) {
        this.freeMethod = freeMethod == null ? null : freeMethod.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderExpire() {
        return orderExpire;
    }

    public void setOrderExpire(Date orderExpire) {
        this.orderExpire = orderExpire;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getGoodsSnapshotIds() {
        return goodsSnapshotIds;
    }

    public void setGoodsSnapshotIds(String goodsSnapshotIds) {
        this.goodsSnapshotIds = goodsSnapshotIds == null ? null : goodsSnapshotIds.trim();
    }

    public String getOptSys() {
        return optSys;
    }

    public void setOptSys(String optSys) {
        this.optSys = optSys == null ? null : optSys.trim();
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getOrigOrderNo() {
        return origOrderNo;
    }

    public void setOrigOrderNo(String origOrderNo) {
        this.origOrderNo = origOrderNo == null ? null : origOrderNo.trim();
    }

    public Date getOrigOrderTime() {
        return origOrderTime;
    }

    public void setOrigOrderTime(Date origOrderTime) {
        this.origOrderTime = origOrderTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(String payerType) {
        this.payerType = payerType == null ? null : payerType.trim();
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId == null ? null : payerId.trim();
    }

    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType == null ? null : payeeType.trim();
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId == null ? null : payeeId.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public String getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(String cancelStatus) {
        this.cancelStatus = cancelStatus == null ? null : cancelStatus.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getIsUserTotal() {
        return isUserTotal;
    }

    public void setIsUserTotal(String isUserTotal) {
        this.isUserTotal = isUserTotal == null ? null : isUserTotal.trim();
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve == null ? null : reserve.trim();
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
        sb.append(", merCode=").append(merCode);
        sb.append(", subMerCode=").append(subMerCode);
        sb.append(", username=").append(username);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizSubtype=").append(bizSubtype);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", freeAmount=").append(freeAmount);
        sb.append(", freeMethod=").append(freeMethod);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderExpire=").append(orderExpire);
        sb.append(", orderDesc=").append(orderDesc);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", goodsSnapshotIds=").append(goodsSnapshotIds);
        sb.append(", optSys=").append(optSys);
        sb.append(", chargeAmount=").append(chargeAmount);
        sb.append(", origOrderNo=").append(origOrderNo);
        sb.append(", origOrderTime=").append(origOrderTime);
        sb.append(", payType=").append(payType);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payerType=").append(payerType);
        sb.append(", payerId=").append(payerId);
        sb.append(", payeeType=").append(payeeType);
        sb.append(", payeeId=").append(payeeId);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", terminalNo=").append(terminalNo);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", cancelStatus=").append(cancelStatus);
        sb.append(", ext1=").append(ext1);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append(", isUserTotal=").append(isUserTotal);
        sb.append(", reserve=").append(reserve);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}