package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderRepayment implements Serializable {
    private Long id;

    private String repaymentNo;

    private String billNo;

    private BigDecimal billAmount;

    private BigDecimal repaymentTotalAmount;

    private Date billDate;

    private Date repaymentTime;

    private BigDecimal repaymentAmount;

    private Integer repaymentStatus;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRepaymentNo() {
        return repaymentNo;
    }

    public void setRepaymentNo(String repaymentNo) {
        this.repaymentNo = repaymentNo == null ? null : repaymentNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public BigDecimal getRepaymentTotalAmount() {
        return repaymentTotalAmount;
    }

    public void setRepaymentTotalAmount(BigDecimal repaymentTotalAmount) {
        this.repaymentTotalAmount = repaymentTotalAmount;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Integer getRepaymentStatus() {
        return repaymentStatus;
    }

    public void setRepaymentStatus(Integer repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
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
        sb.append(", repaymentNo=").append(repaymentNo);
        sb.append(", billNo=").append(billNo);
        sb.append(", billAmount=").append(billAmount);
        sb.append(", repaymentTotalAmount=").append(repaymentTotalAmount);
        sb.append(", billDate=").append(billDate);
        sb.append(", repaymentTime=").append(repaymentTime);
        sb.append(", repaymentAmount=").append(repaymentAmount);
        sb.append(", repaymentStatus=").append(repaymentStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}