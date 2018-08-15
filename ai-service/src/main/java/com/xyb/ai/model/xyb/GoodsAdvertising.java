package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class GoodsAdvertising implements Serializable {
    private Long id;

    private String merCode;

    private Integer groupId;

    private String pic;

    private String picUrl;

    private Integer sort;

    private Date specifiedTime;

    private Integer lengthOfTime;

    private Integer isValid;

    private Date createTime;

    private Date updateTime;

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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getSpecifiedTime() {
        return specifiedTime;
    }

    public void setSpecifiedTime(Date specifiedTime) {
        this.specifiedTime = specifiedTime;
    }

    public Integer getLengthOfTime() {
        return lengthOfTime;
    }

    public void setLengthOfTime(Integer lengthOfTime) {
        this.lengthOfTime = lengthOfTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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
        sb.append(", merCode=").append(merCode);
        sb.append(", groupId=").append(groupId);
        sb.append(", pic=").append(pic);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", sort=").append(sort);
        sb.append(", specifiedTime=").append(specifiedTime);
        sb.append(", lengthOfTime=").append(lengthOfTime);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}