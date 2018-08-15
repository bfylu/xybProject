package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AdRecord implements Serializable {
    private Long id;

    private String refNo;

    private String adOutId;

    private String bizType;

    private String bizSubtype;

    private String title;

    private String content;

    private String adUrl;

    private String adImg;

    private Integer showCount;

    private String status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getAdOutId() {
        return adOutId;
    }

    public void setAdOutId(String adOutId) {
        this.adOutId = adOutId == null ? null : adOutId.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getBizSubtype() {
        return bizSubtype;
    }

    public void setBizSubtype(String bizSubtype) {
        this.bizSubtype = bizSubtype == null ? null : bizSubtype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl == null ? null : adUrl.trim();
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg == null ? null : adImg.trim();
    }

    public Integer getShowCount() {
        return showCount;
    }

    public void setShowCount(Integer showCount) {
        this.showCount = showCount;
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
        sb.append(", refNo=").append(refNo);
        sb.append(", adOutId=").append(adOutId);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizSubtype=").append(bizSubtype);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", adUrl=").append(adUrl);
        sb.append(", adImg=").append(adImg);
        sb.append(", showCount=").append(showCount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}