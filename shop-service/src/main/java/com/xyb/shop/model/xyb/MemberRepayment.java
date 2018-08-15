package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberRepayment implements Serializable {
    private Long id;

    private String username;

    private String memberNo;

    private String refBillNo;

    private Integer bizType;

    private String installmentOrderNo;

    private String tradeOrderNo;

    private BigDecimal repaymentAmount;

    private Date repaymentDate;

    private String isFinish;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    public String getRefBillNo() {
        return refBillNo;
    }

    public void setRefBillNo(String refBillNo) {
        this.refBillNo = refBillNo == null ? null : refBillNo.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getInstallmentOrderNo() {
        return installmentOrderNo;
    }

    public void setInstallmentOrderNo(String installmentOrderNo) {
        this.installmentOrderNo = installmentOrderNo == null ? null : installmentOrderNo.trim();
    }

    public String getTradeOrderNo() {
        return tradeOrderNo;
    }

    public void setTradeOrderNo(String tradeOrderNo) {
        this.tradeOrderNo = tradeOrderNo == null ? null : tradeOrderNo.trim();
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", refBillNo=").append(refBillNo);
        sb.append(", bizType=").append(bizType);
        sb.append(", installmentOrderNo=").append(installmentOrderNo);
        sb.append(", tradeOrderNo=").append(tradeOrderNo);
        sb.append(", repaymentAmount=").append(repaymentAmount);
        sb.append(", repaymentDate=").append(repaymentDate);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}