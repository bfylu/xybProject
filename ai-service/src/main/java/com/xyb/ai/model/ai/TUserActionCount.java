package com.xyb.ai.model.ai;

import java.io.Serializable;
import java.util.Date;

public class TUserActionCount implements Serializable {
    private Long id;

    private String userId;

    private String merCode;

    private String refNo;

    private String goodsName;

    private Short actionState;

    private Integer actionCount;

    private Date createDt;

    private Date updateDt;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Short getActionState() {
        return actionState;
    }

    public void setActionState(Short actionState) {
        this.actionState = actionState;
    }

    public Integer getActionCount() {
        return actionCount;
    }

    public void setActionCount(Integer actionCount) {
        this.actionCount = actionCount;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", merCode=").append(merCode);
        sb.append(", refNo=").append(refNo);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", actionState=").append(actionState);
        sb.append(", actionCount=").append(actionCount);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}