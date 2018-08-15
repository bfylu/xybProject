package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class MemberScoreChange implements Serializable {
    private Long id;

    private String scoreNo;

    private String oldScoreNo;

    private String openId;

    private Integer openidSource;

    private String unionid;

    private String orderNo;

    private Integer bizType;

    private Integer scoreStates;

    private Integer turnoverType;

    private Integer scoreSource;

    private Integer changeScore;

    private Integer balanceScore;

    private String scoreUseDesc;

    private String remark;

    private Date startTime;

    private Date expiredTime;

    private Date createTime;

    private Date createDate;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScoreNo() {
        return scoreNo;
    }

    public void setScoreNo(String scoreNo) {
        this.scoreNo = scoreNo == null ? null : scoreNo.trim();
    }

    public String getOldScoreNo() {
        return oldScoreNo;
    }

    public void setOldScoreNo(String oldScoreNo) {
        this.oldScoreNo = oldScoreNo == null ? null : oldScoreNo.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getOpenidSource() {
        return openidSource;
    }

    public void setOpenidSource(Integer openidSource) {
        this.openidSource = openidSource;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getScoreStates() {
        return scoreStates;
    }

    public void setScoreStates(Integer scoreStates) {
        this.scoreStates = scoreStates;
    }

    public Integer getTurnoverType() {
        return turnoverType;
    }

    public void setTurnoverType(Integer turnoverType) {
        this.turnoverType = turnoverType;
    }

    public Integer getScoreSource() {
        return scoreSource;
    }

    public void setScoreSource(Integer scoreSource) {
        this.scoreSource = scoreSource;
    }

    public Integer getChangeScore() {
        return changeScore;
    }

    public void setChangeScore(Integer changeScore) {
        this.changeScore = changeScore;
    }

    public Integer getBalanceScore() {
        return balanceScore;
    }

    public void setBalanceScore(Integer balanceScore) {
        this.balanceScore = balanceScore;
    }

    public String getScoreUseDesc() {
        return scoreUseDesc;
    }

    public void setScoreUseDesc(String scoreUseDesc) {
        this.scoreUseDesc = scoreUseDesc == null ? null : scoreUseDesc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        sb.append(", scoreNo=").append(scoreNo);
        sb.append(", oldScoreNo=").append(oldScoreNo);
        sb.append(", openId=").append(openId);
        sb.append(", openidSource=").append(openidSource);
        sb.append(", unionid=").append(unionid);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", bizType=").append(bizType);
        sb.append(", scoreStates=").append(scoreStates);
        sb.append(", turnoverType=").append(turnoverType);
        sb.append(", scoreSource=").append(scoreSource);
        sb.append(", changeScore=").append(changeScore);
        sb.append(", balanceScore=").append(balanceScore);
        sb.append(", scoreUseDesc=").append(scoreUseDesc);
        sb.append(", remark=").append(remark);
        sb.append(", startTime=").append(startTime);
        sb.append(", expiredTime=").append(expiredTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}