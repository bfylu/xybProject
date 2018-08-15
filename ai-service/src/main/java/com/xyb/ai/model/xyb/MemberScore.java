package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class MemberScore implements Serializable {
    private Long id;

    private String unionid;

    private Integer scoreTotalNumber;

    private Integer scoreStatus;

    private Integer status;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public Integer getScoreTotalNumber() {
        return scoreTotalNumber;
    }

    public void setScoreTotalNumber(Integer scoreTotalNumber) {
        this.scoreTotalNumber = scoreTotalNumber;
    }

    public Integer getScoreStatus() {
        return scoreStatus;
    }

    public void setScoreStatus(Integer scoreStatus) {
        this.scoreStatus = scoreStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", unionid=").append(unionid);
        sb.append(", scoreTotalNumber=").append(scoreTotalNumber);
        sb.append(", scoreStatus=").append(scoreStatus);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}