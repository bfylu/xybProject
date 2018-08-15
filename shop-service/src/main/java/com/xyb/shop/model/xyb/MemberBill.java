package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberBill implements Serializable {
    private Long id;

    private String billNo;

    private String memberNo;

    private Date billDate;

    private Date beginDate;

    private Date endDate;

    private BigDecimal billAmount;

    private BigDecimal totalChargeAmount;

    private Integer overdueDay;

    private BigDecimal overdueChargeAmount;

    private BigDecimal repaymentTotalAmount;

    private String hasInstallment;

    private BigDecimal installmentTotalAmount;

    private Integer billStatus;

    private Date repaymentData;

    private Integer repaymentStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public BigDecimal getTotalChargeAmount() {
        return totalChargeAmount;
    }

    public void setTotalChargeAmount(BigDecimal totalChargeAmount) {
        this.totalChargeAmount = totalChargeAmount;
    }

    public Integer getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }

    public BigDecimal getOverdueChargeAmount() {
        return overdueChargeAmount;
    }

    public void setOverdueChargeAmount(BigDecimal overdueChargeAmount) {
        this.overdueChargeAmount = overdueChargeAmount;
    }

    public BigDecimal getRepaymentTotalAmount() {
        return repaymentTotalAmount;
    }

    public void setRepaymentTotalAmount(BigDecimal repaymentTotalAmount) {
        this.repaymentTotalAmount = repaymentTotalAmount;
    }

    public String getHasInstallment() {
        return hasInstallment;
    }

    public void setHasInstallment(String hasInstallment) {
        this.hasInstallment = hasInstallment == null ? null : hasInstallment.trim();
    }

    public BigDecimal getInstallmentTotalAmount() {
        return installmentTotalAmount;
    }

    public void setInstallmentTotalAmount(BigDecimal installmentTotalAmount) {
        this.installmentTotalAmount = installmentTotalAmount;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public Date getRepaymentData() {
        return repaymentData;
    }

    public void setRepaymentData(Date repaymentData) {
        this.repaymentData = repaymentData;
    }

    public Integer getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(Integer repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", billNo=").append(billNo);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", billDate=").append(billDate);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", billAmount=").append(billAmount);
        sb.append(", totalChargeAmount=").append(totalChargeAmount);
        sb.append(", overdueDay=").append(overdueDay);
        sb.append(", overdueChargeAmount=").append(overdueChargeAmount);
        sb.append(", repaymentTotalAmount=").append(repaymentTotalAmount);
        sb.append(", hasInstallment=").append(hasInstallment);
        sb.append(", installmentTotalAmount=").append(installmentTotalAmount);
        sb.append(", billStatus=").append(billStatus);
        sb.append(", repaymentData=").append(repaymentData);
        sb.append(", repaymentStatus=").append(repaymentStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}