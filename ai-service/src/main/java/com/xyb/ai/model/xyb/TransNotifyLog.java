package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class TransNotifyLog implements Serializable {
    private Long id;

    private String notifyNo;

    private Date notifyTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotifyNo() {
        return notifyNo;
    }

    public void setNotifyNo(String notifyNo) {
        this.notifyNo = notifyNo == null ? null : notifyNo.trim();
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", notifyNo=").append(notifyNo);
        sb.append(", notifyTime=").append(notifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}