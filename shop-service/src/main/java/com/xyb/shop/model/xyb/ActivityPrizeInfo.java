package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ActivityPrizeInfo implements Serializable {
    private Long id;

    private String prizeNo;

    private Integer prizeCategory;

    private Integer prizeNumber;

    private String refNo;

    private String prizePic;

    private String prizeName;

    private Integer prizeForActivity;

    private Integer state;

    private BigDecimal awardRate;

    private Date createDt;

    private Date updateDt;


    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrizeNo() {
        return prizeNo;
    }

    public void setPrizeNo(String prizeNo) {
        this.prizeNo = prizeNo == null ? null : prizeNo.trim();
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

    public Integer getPrizeForActivity() {
        return prizeForActivity;
    }

    public void setPrizeForActivity(Integer prizeForActivity) {
        this.prizeForActivity = prizeForActivity;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prizeNo=").append(prizeNo);
        sb.append(", prizeCategory=").append(prizeCategory);
        sb.append(", prizeNumber=").append(prizeNumber);
        sb.append(", refNo=").append(refNo);
        sb.append(", prizePic=").append(prizePic);
        sb.append(", prizeName=").append(prizeName);
        sb.append(", prizeForActivity=").append(prizeForActivity);
        sb.append(", state=").append(state);
        sb.append(", awardRate=").append(awardRate);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}