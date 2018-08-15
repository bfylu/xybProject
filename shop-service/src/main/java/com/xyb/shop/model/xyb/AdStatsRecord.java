package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AdStatsRecord implements Serializable {
    private Long id;

    private String adRefNo;

    private Integer source;

    private Integer position;

    private String clienIp;

    private Date clickTime;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getClienIp() {
        return clienIp;
    }

    public void setClienIp(String clienIp) {
        this.clienIp = clienIp == null ? null : clienIp.trim();
    }

    public Date getClickTime() {
        return clickTime;
    }

    public void setClickTime(Date clickTime) {
        this.clickTime = clickTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adRefNo=").append(adRefNo);
        sb.append(", source=").append(source);
        sb.append(", position=").append(position);
        sb.append(", clienIp=").append(clienIp);
        sb.append(", clickTime=").append(clickTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}