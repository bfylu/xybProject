package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberCreditApply implements Serializable {
    private Long id;

    private String memberNo;

    private String username;

    private BigDecimal applyCreditAmount;

    private String auditBatchNo;

    private Date lastAuditTime;

    private Integer status;

    private String remark;

    private Date applyTime;

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

    public BigDecimal getApplyCreditAmount() {
        return applyCreditAmount;
    }

    public void setApplyCreditAmount(BigDecimal applyCreditAmount) {
        this.applyCreditAmount = applyCreditAmount;
    }

    public String getAuditBatchNo() {
        return auditBatchNo;
    }

    public void setAuditBatchNo(String auditBatchNo) {
        this.auditBatchNo = auditBatchNo == null ? null : auditBatchNo.trim();
    }

    public Date getLastAuditTime() {
        return lastAuditTime;
    }

    public void setLastAuditTime(Date lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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
        sb.append(", applyCreditAmount=").append(applyCreditAmount);
        sb.append(", auditBatchNo=").append(auditBatchNo);
        sb.append(", lastAuditTime=").append(lastAuditTime);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}