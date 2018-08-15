package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AppLoginKey implements Serializable {
    private Long id;

    private String merCode;

    private String username;

    private String sessionToken;

    private String loginToken;

    private String phoneNumber1;

    private String phoneNumber2;

    private String appKey;

    private String systemType;

    private String systemVersionName;

    private Integer systemVersionCode;

    private String terminalType;

    private String terminalNo;

    private String imei;

    private Date expireTime;

    private Date lastLoginTime;

    private String ext1;

    private String ext2;

    private String ext3;

    private String status;

    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken == null ? null : sessionToken.trim();
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken == null ? null : loginToken.trim();
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1 == null ? null : phoneNumber1.trim();
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2 == null ? null : phoneNumber2.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public String getSystemVersionName() {
        return systemVersionName;
    }

    public void setSystemVersionName(String systemVersionName) {
        this.systemVersionName = systemVersionName == null ? null : systemVersionName.trim();
    }

    public Integer getSystemVersionCode() {
        return systemVersionCode;
    }

    public void setSystemVersionCode(Integer systemVersionCode) {
        this.systemVersionCode = systemVersionCode;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", merCode=").append(merCode);
        sb.append(", username=").append(username);
        sb.append(", sessionToken=").append(sessionToken);
        sb.append(", loginToken=").append(loginToken);
        sb.append(", phoneNumber1=").append(phoneNumber1);
        sb.append(", phoneNumber2=").append(phoneNumber2);
        sb.append(", appKey=").append(appKey);
        sb.append(", systemType=").append(systemType);
        sb.append(", systemVersionName=").append(systemVersionName);
        sb.append(", systemVersionCode=").append(systemVersionCode);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", terminalNo=").append(terminalNo);
        sb.append(", imei=").append(imei);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", ext1=").append(ext1);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}