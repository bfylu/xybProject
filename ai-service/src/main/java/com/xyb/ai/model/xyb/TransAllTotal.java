package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransAllTotal implements Serializable {
    private Integer id;

    private String srcDb;

    private String srcTable;

    private String category;

    private String merCode;

    private String subMerCode;

    private String username;

    private String productCode;

    private String functionCode;

    private String bizType;

    private String bizSubtype;

    private String orderNo;

    private String tradeNo;

    private String origOrderNo;

    private String orderType;

    private BigDecimal orderAmount;

    private BigDecimal freeAmount;

    private BigDecimal freeMethod;

    private String payMethod;

    private String payType;

    private String orderStatus;

    private Date orderTime;

    private String channelCode;

    private String chanProdCode;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrcDb() {
        return srcDb;
    }

    public void setSrcDb(String srcDb) {
        this.srcDb = srcDb == null ? null : srcDb.trim();
    }

    public String getSrcTable() {
        return srcTable;
    }

    public void setSrcTable(String srcTable) {
        this.srcTable = srcTable == null ? null : srcTable.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getOrigOrderNo() {
        return origOrderNo;
    }

    public void setOrigOrderNo(String origOrderNo) {
        this.origOrderNo = origOrderNo == null ? null : origOrderNo.trim();
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

    public BigDecimal getFreeMethod() {
        return freeMethod;
    }

    public void setFreeMethod(BigDecimal freeMethod) {
        this.freeMethod = freeMethod;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChanProdCode() {
        return chanProdCode;
    }

    public void setChanProdCode(String chanProdCode) {
        this.chanProdCode = chanProdCode == null ? null : chanProdCode.trim();
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
        sb.append(", srcDb=").append(srcDb);
        sb.append(", srcTable=").append(srcTable);
        sb.append(", category=").append(category);
        sb.append(", merCode=").append(merCode);
        sb.append(", subMerCode=").append(subMerCode);
        sb.append(", username=").append(username);
        sb.append(", productCode=").append(productCode);
        sb.append(", functionCode=").append(functionCode);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizSubtype=").append(bizSubtype);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", origOrderNo=").append(origOrderNo);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", freeAmount=").append(freeAmount);
        sb.append(", freeMethod=").append(freeMethod);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payType=").append(payType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", chanProdCode=").append(chanProdCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}