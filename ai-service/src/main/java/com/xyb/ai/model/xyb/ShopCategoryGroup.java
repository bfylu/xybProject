package com.xyb.ai.model.xyb;

import java.io.Serializable;

public class ShopCategoryGroup implements Serializable {
    private Long id;

    private String groupName;

    private String icon;

    private String catIds;

    private Integer showMethod;

    private Integer seqIndex;

    private String showLink;

    private Long catId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCatIds() {
        return catIds;
    }

    public void setCatIds(String catIds) {
        this.catIds = catIds == null ? null : catIds.trim();
    }

    public Integer getShowMethod() {
        return showMethod;
    }

    public void setShowMethod(Integer showMethod) {
        this.showMethod = showMethod;
    }

    public Integer getSeqIndex() {
        return seqIndex;
    }

    public void setSeqIndex(Integer seqIndex) {
        this.seqIndex = seqIndex;
    }

    public String getShowLink() {
        return showLink;
    }

    public void setShowLink(String showLink) {
        this.showLink = showLink == null ? null : showLink.trim();
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupName=").append(groupName);
        sb.append(", icon=").append(icon);
        sb.append(", catIds=").append(catIds);
        sb.append(", showMethod=").append(showMethod);
        sb.append(", seqIndex=").append(seqIndex);
        sb.append(", showLink=").append(showLink);
        sb.append(", catId=").append(catId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}