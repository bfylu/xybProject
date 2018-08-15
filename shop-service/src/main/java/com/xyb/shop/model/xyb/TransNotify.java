package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class TransNotify implements Serializable {
    private Long id;

    private String notifyNo;

    private String orderNo;

    private String respCode;

    private String respDesc;

    private String notifyUrl;

    private String notifyContentType;

    private String notifyStatus;

    private Integer totalCall;

    private Date lastNotifyTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotifyNo() {
        return notifyNo;
    }

    public void setNotifyNo(String notifyNo) {
        this.notifyNo = notifyNo == null ? null : notifyNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc == null ? null : respDesc.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getNotifyContentType() {
        return notifyContentType;
    }

    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType == null ? null : notifyContentType.trim();
    }

    public String getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus == null ? null : notifyStatus.trim();
    }

    public Integer getTotalCall() {
        return totalCall;
    }

    public void setTotalCall(Integer totalCall) {
        this.totalCall = totalCall;
    }

    public Date getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Date lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
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
        sb.append(", notifyNo=").append(notifyNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", respCode=").append(respCode);
        sb.append(", respDesc=").append(respDesc);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", notifyContentType=").append(notifyContentType);
        sb.append(", notifyStatus=").append(notifyStatus);
        sb.append(", totalCall=").append(totalCall);
        sb.append(", lastNotifyTime=").append(lastNotifyTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}