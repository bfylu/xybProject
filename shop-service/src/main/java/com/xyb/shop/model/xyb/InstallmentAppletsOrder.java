package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InstallmentAppletsOrder implements Serializable {
    private Long id;

    private String issueNo;

    private String username;

    private String merCode;

    private String agentInfo;

    private String subMerCode;

    private Integer bizType;

    private Integer bizSubtype;

    private String outCode;

    private String orderNo;

    private BigDecimal orderAmount;

    private Integer chargeMethod;

    private BigDecimal chargeAmountTotal;

    private Date orderTime;

    private String orderDesc;

    private Integer orderStatus;

    private Integer orderFlag;

    private String typeCode;

    private Integer installmentType;

    private BigDecimal installmentRate;

    private Integer installmentMonth;

    private BigDecimal installmentAmount;

    private BigDecimal repayAmountTotal;

    private BigDecimal downPayment;

    private String sellerInfo;

    private String sellerUsername;

    private String operatorInfo;

    private String buyerInfo;

    private String buyerUsername;

    private String goodsInfo;

    private String goodsSnapshotIds;

    private String goodsSnapshotRefNo;

    private String consumeVoucherPic;

    private String bankCardRefNo;

    private String bankCardInfo;

    private String checkStatus;

    private Integer dataStatus;

    private Integer verifyStatus;

    private String verifyInfo;

    private Date verifyTime;

    private String proRefNo;

    private String relationPersonIds;

    private String relationPersonRefNo;

    private String isRemittance;

    private Date remittanceTime;

    private String extInfo;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String antiFraudInfo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo == null ? null : issueNo.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(String agentInfo) {
        this.agentInfo = agentInfo == null ? null : agentInfo.trim();
    }

    public String getSubMerCode() {
        return subMerCode;
    }

    public void setSubMerCode(String subMerCode) {
        this.subMerCode = subMerCode == null ? null : subMerCode.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getBizSubtype() {
        return bizSubtype;
    }

    public void setBizSubtype(Integer bizSubtype) {
        this.bizSubtype = bizSubtype;
    }

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode == null ? null : outCode.trim();
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

    public Integer getChargeMethod() {
        return chargeMethod;
    }

    public void setChargeMethod(Integer chargeMethod) {
        this.chargeMethod = chargeMethod;
    }

    public BigDecimal getChargeAmountTotal() {
        return chargeAmountTotal;
    }

    public void setChargeAmountTotal(BigDecimal chargeAmountTotal) {
        this.chargeAmountTotal = chargeAmountTotal;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
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

    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public Integer getInstallmentType() {
        return installmentType;
    }

    public void setInstallmentType(Integer installmentType) {
        this.installmentType = installmentType;
    }

    public BigDecimal getInstallmentRate() {
        return installmentRate;
    }

    public void setInstallmentRate(BigDecimal installmentRate) {
        this.installmentRate = installmentRate;
    }

    public Integer getInstallmentMonth() {
        return installmentMonth;
    }

    public void setInstallmentMonth(Integer installmentMonth) {
        this.installmentMonth = installmentMonth;
    }

    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(BigDecimal installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public BigDecimal getRepayAmountTotal() {
        return repayAmountTotal;
    }

    public void setRepayAmountTotal(BigDecimal repayAmountTotal) {
        this.repayAmountTotal = repayAmountTotal;
    }

    public BigDecimal getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(BigDecimal downPayment) {
        this.downPayment = downPayment;
    }

    public String getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo == null ? null : sellerInfo.trim();
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername == null ? null : sellerUsername.trim();
    }

    public String getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(String operatorInfo) {
        this.operatorInfo = operatorInfo == null ? null : operatorInfo.trim();
    }

    public String getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(String buyerInfo) {
        this.buyerInfo = buyerInfo == null ? null : buyerInfo.trim();
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername == null ? null : buyerUsername.trim();
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    public String getGoodsSnapshotIds() {
        return goodsSnapshotIds;
    }

    public void setGoodsSnapshotIds(String goodsSnapshotIds) {
        this.goodsSnapshotIds = goodsSnapshotIds == null ? null : goodsSnapshotIds.trim();
    }

    public String getGoodsSnapshotRefNo() {
        return goodsSnapshotRefNo;
    }

    public void setGoodsSnapshotRefNo(String goodsSnapshotRefNo) {
        this.goodsSnapshotRefNo = goodsSnapshotRefNo == null ? null : goodsSnapshotRefNo.trim();
    }

    public String getConsumeVoucherPic() {
        return consumeVoucherPic;
    }

    public void setConsumeVoucherPic(String consumeVoucherPic) {
        this.consumeVoucherPic = consumeVoucherPic == null ? null : consumeVoucherPic.trim();
    }

    public String getBankCardRefNo() {
        return bankCardRefNo;
    }

    public void setBankCardRefNo(String bankCardRefNo) {
        this.bankCardRefNo = bankCardRefNo == null ? null : bankCardRefNo.trim();
    }

    public String getBankCardInfo() {
        return bankCardInfo;
    }

    public void setBankCardInfo(String bankCardInfo) {
        this.bankCardInfo = bankCardInfo == null ? null : bankCardInfo.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getVerifyInfo() {
        return verifyInfo;
    }

    public void setVerifyInfo(String verifyInfo) {
        this.verifyInfo = verifyInfo == null ? null : verifyInfo.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getProRefNo() {
        return proRefNo;
    }

    public void setProRefNo(String proRefNo) {
        this.proRefNo = proRefNo == null ? null : proRefNo.trim();
    }

    public String getRelationPersonIds() {
        return relationPersonIds;
    }

    public void setRelationPersonIds(String relationPersonIds) {
        this.relationPersonIds = relationPersonIds == null ? null : relationPersonIds.trim();
    }

    public String getRelationPersonRefNo() {
        return relationPersonRefNo;
    }

    public void setRelationPersonRefNo(String relationPersonRefNo) {
        this.relationPersonRefNo = relationPersonRefNo == null ? null : relationPersonRefNo.trim();
    }

    public String getIsRemittance() {
        return isRemittance;
    }

    public void setIsRemittance(String isRemittance) {
        this.isRemittance = isRemittance == null ? null : isRemittance.trim();
    }

    public Date getRemittanceTime() {
        return remittanceTime;
    }

    public void setRemittanceTime(Date remittanceTime) {
        this.remittanceTime = remittanceTime;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getAntiFraudInfo() {
        return antiFraudInfo;
    }

    public void setAntiFraudInfo(String antiFraudInfo) {
        this.antiFraudInfo = antiFraudInfo == null ? null : antiFraudInfo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", issueNo=").append(issueNo);
        sb.append(", username=").append(username);
        sb.append(", merCode=").append(merCode);
        sb.append(", agentInfo=").append(agentInfo);
        sb.append(", subMerCode=").append(subMerCode);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizSubtype=").append(bizSubtype);
        sb.append(", outCode=").append(outCode);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", chargeMethod=").append(chargeMethod);
        sb.append(", chargeAmountTotal=").append(chargeAmountTotal);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderDesc=").append(orderDesc);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderFlag=").append(orderFlag);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", installmentType=").append(installmentType);
        sb.append(", installmentRate=").append(installmentRate);
        sb.append(", installmentMonth=").append(installmentMonth);
        sb.append(", installmentAmount=").append(installmentAmount);
        sb.append(", repayAmountTotal=").append(repayAmountTotal);
        sb.append(", downPayment=").append(downPayment);
        sb.append(", sellerInfo=").append(sellerInfo);
        sb.append(", sellerUsername=").append(sellerUsername);
        sb.append(", operatorInfo=").append(operatorInfo);
        sb.append(", buyerInfo=").append(buyerInfo);
        sb.append(", buyerUsername=").append(buyerUsername);
        sb.append(", goodsInfo=").append(goodsInfo);
        sb.append(", goodsSnapshotIds=").append(goodsSnapshotIds);
        sb.append(", goodsSnapshotRefNo=").append(goodsSnapshotRefNo);
        sb.append(", consumeVoucherPic=").append(consumeVoucherPic);
        sb.append(", bankCardRefNo=").append(bankCardRefNo);
        sb.append(", bankCardInfo=").append(bankCardInfo);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", dataStatus=").append(dataStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", verifyInfo=").append(verifyInfo);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", proRefNo=").append(proRefNo);
        sb.append(", relationPersonIds=").append(relationPersonIds);
        sb.append(", relationPersonRefNo=").append(relationPersonRefNo);
        sb.append(", isRemittance=").append(isRemittance);
        sb.append(", remittanceTime=").append(remittanceTime);
        sb.append(", extInfo=").append(extInfo);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", antiFraudInfo=").append(antiFraudInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}