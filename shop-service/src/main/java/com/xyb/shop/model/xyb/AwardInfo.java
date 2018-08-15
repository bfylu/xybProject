package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class AwardInfo implements Serializable {
    private Long id;

    private String openId;

    private Long prizeId;

    private Integer prizeCategory;

    private Integer prizeNumber;

    private String refNo;

    private String prizePic;

    private String prizeName;

    private Integer state;

    private Integer prizeForActivity;

    private Date createDt;

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

    public Long getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Long prizeId) {
        this.prizeId = prizeId;
    }

    public Integer getPrizeCategory() {
        return prizeCategory;
    }

    public void setPrizeCategory(Integer prizeCategory) {
        this.prizeCategory = prizeCategory;
    }

    public Integer getPrizeNumber() {
        return prizeNumber;
    }

    public void setPrizeNumber(Integer prizeNumber) {
        this.prizeNumber = prizeNumber;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getPrizePic() {
        return prizePic;
    }

    public void setPrizePic(String prizePic) {
        this.prizePic = prizePic == null ? null : prizePic.trim();
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPrizeForActivity() {
        return prizeForActivity;
    }

    public void setPrizeForActivity(Integer prizeForActivity) {
        this.prizeForActivity = prizeForActivity;
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
        sb.append(", openId=").append(openId);
        sb.append(", prizeId=").append(prizeId);
        sb.append(", prizeCategory=").append(prizeCategory);
        sb.append(", prizeNumber=").append(prizeNumber);
        sb.append(", refNo=").append(refNo);
        sb.append(", prizePic=").append(prizePic);
        sb.append(", prizeName=").append(prizeName);
        sb.append(", state=").append(state);
        sb.append(", prizeForActivity=").append(prizeForActivity);
        sb.append(", createDt=").append(createDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}