package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.util.Date;

public class IntegralExchangeRule implements Serializable {
    private Long id;

    private String ruleNo;

    private String ruleName;

    private Integer integralRatio;

    private Integer cashRatio;

    private Integer isValid;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo == null ? null : ruleNo.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Integer getIntegralRatio() {
        return integralRatio;
    }

    public void setIntegralRatio(Integer integralRatio) {
        this.integralRatio = integralRatio;
    }

    public Integer getCashRatio() {
        return cashRatio;
    }

    public void setCashRatio(Integer cashRatio) {
        this.cashRatio = cashRatio;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", ruleName=").append(ruleName);
        sb.append(", integralRatio=").append(integralRatio);
        sb.append(", cashRatio=").append(cashRatio);
        sb.append(", isValid=").append(isValid);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}