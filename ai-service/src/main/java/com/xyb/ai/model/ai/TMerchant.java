package com.xyb.ai.model.ai;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TMerchant implements Serializable {
    private Long id;

    private String userId;

    private String userJmgUrl;

    private String nick;

    private String merchantAddress;

    private String merchantName;

    private String merchantUrl;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Short status;

    private Date createDt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserJmgUrl() {
        return userJmgUrl;
    }

    public void setUserJmgUrl(String userJmgUrl) {
        this.userJmgUrl = userJmgUrl == null ? null : userJmgUrl.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress == null ? null : merchantAddress.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl == null ? null : merchantUrl.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userJmgUrl=").append(userJmgUrl);
        sb.append(", nick=").append(nick);
        sb.append(", merchantAddress=").append(merchantAddress);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantUrl=").append(merchantUrl);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", status=").append(status);
        sb.append(", createDt=").append(createDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}