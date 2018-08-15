package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class OrderViewCount implements Serializable {
    private Long id;

    private String openId;

    private Integer waitPayCount;

    private Integer backCount;

    private Integer recipienCount;

    private Integer finishCount;

    private Integer afterSaleCount;

    private Date creatTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getWaitPayCount() {
        return waitPayCount;
    }

    public void setWaitPayCount(Integer waitPayCount) {
        this.waitPayCount = waitPayCount;
    }

    public Integer getBackCount() {
        return backCount;
    }

    public void setBackCount(Integer backCount) {
        this.backCount = backCount;
    }

    public Integer getRecipienCount() {
        return recipienCount;
    }

    public void setRecipienCount(Integer recipienCount) {
        this.recipienCount = recipienCount;
    }

    public Integer getFinishCount() {
        return finishCount;
    }

    public void setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
    }

    public Integer getAfterSaleCount() {
        return afterSaleCount;
    }

    public void setAfterSaleCount(Integer afterSaleCount) {
        this.afterSaleCount = afterSaleCount;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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
        sb.append(", openId=").append(openId);
        sb.append(", waitPayCount=").append(waitPayCount);
        sb.append(", backCount=").append(backCount);
        sb.append(", recipienCount=").append(recipienCount);
        sb.append(", finishCount=").append(finishCount);
        sb.append(", afterSaleCount=").append(afterSaleCount);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}