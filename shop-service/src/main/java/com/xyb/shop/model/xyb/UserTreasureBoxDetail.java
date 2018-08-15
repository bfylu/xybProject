package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class UserTreasureBoxDetail implements Serializable {
    private Long id;

    private String boxNo;

    private String openId;

    private String friendsOpenId;

    private String friendsHeadimgurl;

    private Integer isOpenBox;

    private Date startTime;

    private Date createDt;

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

    public String getFriendsOpenId() {
        return friendsOpenId;
    }

    public void setFriendsOpenId(String friendsOpenId) {
        this.friendsOpenId = friendsOpenId == null ? null : friendsOpenId.trim();
    }

    public String getFriendsHeadimgurl() {
        return friendsHeadimgurl;
    }

    public void setFriendsHeadimgurl(String friendsHeadimgurl) {
        this.friendsHeadimgurl = friendsHeadimgurl == null ? null : friendsHeadimgurl.trim();
    }

    public Integer getIsOpenBox() {
        return isOpenBox;
    }

    public void setIsOpenBox(Integer isOpenBox) {
        this.isOpenBox = isOpenBox;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
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
        sb.append(", friendsOpenId=").append(friendsOpenId);
        sb.append(", friendsHeadimgurl=").append(friendsHeadimgurl);
        sb.append(", isOpenBox=").append(isOpenBox);
        sb.append(", startTime=").append(startTime);
        sb.append(", createDt=").append(createDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}