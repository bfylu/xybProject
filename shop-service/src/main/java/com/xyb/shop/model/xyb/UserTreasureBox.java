package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class UserTreasureBox implements Serializable {
    private Long id;

    private String boxNo;

    private String openId;

    private Integer boxState;

    private Integer state;

    private Date startTime;

    private Date endTime;

    private Integer clickNumber;

    private Date createDt;

    private Integer getSocreNumber;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo == null ? null : boxNo.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getBoxState() {
        return boxState;
    }

    public void setBoxState(Integer boxState) {
        this.boxState = boxState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getClickNumber() {
        return clickNumber;
    }

    public void setClickNumber(Integer clickNumber) {
        this.clickNumber = clickNumber;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Integer getGetSocreNumber() {
        return getSocreNumber;
    }

    public void setGetSocreNumber(Integer getSocreNumber) {
        this.getSocreNumber = getSocreNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", boxNo=").append(boxNo);
        sb.append(", openId=").append(openId);
        sb.append(", boxState=").append(boxState);
        sb.append(", state=").append(state);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", clickNumber=").append(clickNumber);
        sb.append(", createDt=").append(createDt);
        sb.append(", getSocreNumber=").append(getSocreNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}