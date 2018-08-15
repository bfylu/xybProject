package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Member implements Serializable {
    private Long id;

    private String memberNo;

    private String username;

    private BigDecimal initCreditAmount;

    private BigDecimal creditAmount;

    private BigDecimal availableAmount;

    private BigDecimal usedAmount;

    private Integer authorizeState;

    private Integer createBillDay;

    private Integer repaymentDay;

    private String bankCardRefNo;

    private String remark;

    private String extInfo;

    private Date createTime;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getInitCreditAmount() {
        return initCreditAmount;
    }

    public void setInitCreditAmount(BigDecimal initCreditAmount) {
        this.initCreditAmount = initCreditAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public Integer getAuthorizeState() {
        return authorizeState;
    }

    public void setAuthorizeState(Integer authorizeState) {
        this.authorizeState = authorizeState;
    }

    public Integer getCreateBillDay() {
        return createBillDay;
    }

    public void setCreateBillDay(Integer createBillDay) {
        this.createBillDay = createBillDay;
    }

    public Integer getRepaymentDay() {
        return repaymentDay;
    }

    public void setRepaymentDay(Integer repaymentDay) {
        this.repaymentDay = repaymentDay;
    }

    public String getBankCardRefNo() {
        return bankCardRefNo;
    }

    public void setBankCardRefNo(String bankCardRefNo) {
        this.bankCardRefNo = bankCardRefNo == null ? null : bankCardRefNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberNo=").append(memberNo);
        sb.append(", username=").append(username);
        sb.append(", initCreditAmount=").append(initCreditAmount);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", availableAmount=").append(availableAmount);
        sb.append(", usedAmount=").append(usedAmount);
        sb.append(", authorizeState=").append(authorizeState);
        sb.append(", createBillDay=").append(createBillDay);
        sb.append(", repaymentDay=").append(repaymentDay);
        sb.append(", bankCardRefNo=").append(bankCardRefNo);
        sb.append(", remark=").append(remark);
        sb.append(", extInfo=").append(extInfo);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}