package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberCreditChange implements Serializable {
    private Long id;

    private String memberNo;

    private String billNo;

    private String orderNo;

    private Integer bizType;

    private Integer bizSubtype;

    private Integer turnoverType;

    private BigDecimal changeAmount;

    private BigDecimal balanceAmount;

    private BigDecimal creditAmount;

    private String remark;

    private Date changeTime;

    private Integer settlementStatus;

    private Date settlementTime;

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

    public Integer getTurnoverType() {
        return turnoverType;
    }

    public void setTurnoverType(Integer turnoverType) {
        this.turnoverType = turnoverType;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", billNo=").append(billNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizSubtype=").append(bizSubtype);
        sb.append(", turnoverType=").append(turnoverType);
        sb.append(", changeAmount=").append(changeAmount);
        sb.append(", balanceAmount=").append(balanceAmount);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", remark=").append(remark);
        sb.append(", changeTime=").append(changeTime);
        sb.append(", settlementStatus=").append(settlementStatus);
        sb.append(", settlementTime=").append(settlementTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}