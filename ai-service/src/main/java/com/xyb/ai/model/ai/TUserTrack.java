package com.xyb.ai.model.ai;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TUserTrack implements Serializable {
    private Long id;

    private String userId;

    private String userJmgUrl;

    private String nick;

    private Short sex;

    private String phone;

    private String curAddress;

    private String pcaCode;

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

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCurAddress() {
        return curAddress;
    }

    public void setCurAddress(String curAddress) {
        this.curAddress = curAddress == null ? null : curAddress.trim();
    }

    public String getPcaCode() {
        return pcaCode;
    }

    public void setPcaCode(String pcaCode) {
        this.pcaCode = pcaCode == null ? null : pcaCode.trim();
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
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", curAddress=").append(curAddress);
        sb.append(", pcaCode=").append(pcaCode);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", status=").append(status);
        sb.append(", createDt=").append(createDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}