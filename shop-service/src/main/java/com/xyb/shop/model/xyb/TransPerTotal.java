package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransPerTotal implements Serializable {
    private Long id;

    private String merCode;

    private String subMerCode;

    private String username;

    private String bizType;

    private String bizSubtype;

    private String payType;

    private BigDecimal turnover;

    private BigDecimal acquireAmount;

    private BigDecimal refundAmount;

    private Integer payCount;

    private Integer refundCount;

    private Date totalDate;

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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public BigDecimal getAcquireAmount() {
        return acquireAmount;
    }

    public void setAcquireAmount(BigDecimal acquireAmount) {
        this.acquireAmount = acquireAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
    }

    public Date getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(Date totalDate) {
        this.totalDate = totalDate;
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
        sb.append(", payType=").append(payType);
        sb.append(", turnover=").append(turnover);
        sb.append(", acquireAmount=").append(acquireAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", payCount=").append(payCount);
        sb.append(", refundCount=").append(refundCount);
        sb.append(", totalDate=").append(totalDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}