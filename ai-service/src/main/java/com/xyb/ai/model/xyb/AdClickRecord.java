package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AdClickRecord implements Serializable {
    private Long id;

    private String adRefNo;

    private String source;

    private String position;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
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