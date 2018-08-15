package com.xyb.ai.model.xyb;

import java.io.Serializable;

public class AdClickTotal implements Serializable {
    private Long id;

    private String adRefNo;

    private Integer count;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdRefNo() {
        return adRefNo;
    }

    public void setAdRefNo(String adRefNo) {
        this.adRefNo = adRefNo == null ? null : adRefNo.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adRefNo=").append(adRefNo);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}