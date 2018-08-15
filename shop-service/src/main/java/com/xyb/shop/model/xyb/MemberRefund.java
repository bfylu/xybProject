package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MemberRefund implements Serializable {
    private Long id;

    private String username;

    private String memberNo;

    private String refundOrderNo;

    private String consumeOrderNo;

    private Integer bizType;

    private Date applyTime;

    private BigDecimal refundAmount;

    private String refundVoucherPic;

    private String auditBatchNo;

    private Date auditTime;

    private String auditDesc;

    private String refundDesc;

    private Integer status;

    private Date refundTime;

    private String remark;

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

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo == null ? null : refundOrderNo.trim();
    }

    public String getConsumeOrderNo() {
        return consumeOrderNo;
    }

    public void setConsumeOrderNo(String consumeOrderNo) {
        this.consumeOrderNo = consumeOrderNo == null ? null : consumeOrderNo.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundVoucherPic() {
        return refundVoucherPic;
    }

    public void setRefundVoucherPic(String refundVoucherPic) {
        this.refundVoucherPic = refundVoucherPic == null ? null : refundVoucherPic.trim();
    }

    public String getAuditBatchNo() {
        return auditBatchNo;
    }

    public void setAuditBatchNo(String auditBatchNo) {
        this.auditBatchNo = auditBatchNo == null ? null : auditBatchNo.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc == null ? null : auditDesc.trim();
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc == null ? null : refundDesc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", refundOrderNo=").append(refundOrderNo);
        sb.append(", consumeOrderNo=").append(consumeOrderNo);
        sb.append(", bizType=").append(bizType);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundVoucherPic=").append(refundVoucherPic);
        sb.append(", auditBatchNo=").append(auditBatchNo);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditDesc=").append(auditDesc);
        sb.append(", refundDesc=").append(refundDesc);
        sb.append(", status=").append(status);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}