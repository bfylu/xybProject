package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AdStatsClick implements Serializable {
    private Long id;

    private String adRefNo;

    private Integer statsType;

    private Integer count;

    private Date statsDate;

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

    public Integer getStatsType() {
        return statsType;
    }

    public void setStatsType(Integer statsType) {
        this.statsType = statsType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getStatsDate() {
        return statsDate;
    }

    public void setStatsDate(Date statsDate) {
        this.statsDate = statsDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adRefNo=").append(adRefNo);
        sb.append(", statsType=").append(statsType);
        sb.append(", count=").append(count);
        sb.append(", statsDate=").append(statsDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}