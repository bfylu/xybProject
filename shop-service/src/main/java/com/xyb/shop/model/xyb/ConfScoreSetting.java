package com.xyb.shop.model.xyb;

import java.io.Serializable;

public class ConfScoreSetting implements Serializable {
    private Long id;

    private String labelShowText;

    private String propertyName;

    private String propertyValue;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabelShowText() {
        return labelShowText;
    }

    public void setLabelShowText(String labelShowText) {
        this.labelShowText = labelShowText == null ? null : labelShowText.trim();
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
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
        sb.append(", labelShowText=").append(labelShowText);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", propertyValue=").append(propertyValue);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}