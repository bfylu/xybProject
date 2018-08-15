package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AppResource implements Serializable {
    private Long id;

    private Integer platform;

    private Integer terminalType;

    private Integer resType;

    private Integer appVerCode;

    private String appVerName;

    private Integer resVerCode;

    private String resVerName;

    private String downloadUrl;

    private String remark;

    private Date releaseTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getAppVerCode() {
        return appVerCode;
    }

    public void setAppVerCode(Integer appVerCode) {
        this.appVerCode = appVerCode;
    }

    public String getAppVerName() {
        return appVerName;
    }

    public void setAppVerName(String appVerName) {
        this.appVerName = appVerName == null ? null : appVerName.trim();
    }

    public Integer getResVerCode() {
        return resVerCode;
    }

    public void setResVerCode(Integer resVerCode) {
        this.resVerCode = resVerCode;
    }

    public String getResVerName() {
        return resVerName;
    }

    public void setResVerName(String resVerName) {
        this.resVerName = resVerName == null ? null : resVerName.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform=").append(platform);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", resType=").append(resType);
        sb.append(", appVerCode=").append(appVerCode);
        sb.append(", appVerName=").append(appVerName);
        sb.append(", resVerCode=").append(resVerCode);
        sb.append(", resVerName=").append(resVerName);
        sb.append(", downloadUrl=").append(downloadUrl);
        sb.append(", remark=").append(remark);
        sb.append(", releaseTime=").append(releaseTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}