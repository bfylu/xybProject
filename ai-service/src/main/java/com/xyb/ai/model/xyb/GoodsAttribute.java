package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsAttribute implements Serializable {
    private Long id;

    private Long goodsId;

    private Integer isSupportByStages;

    private Integer isSupportExchange;

    private BigDecimal exchangePrice;

    private Integer needIntegralNumber;

    private Integer goodsSales;

    private Integer goodsBrowsingVolume;

    private Date createTime;

    private Date updateTime;

    private Long ruleId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getIsSupportByStages() {
        return isSupportByStages;
    }

    public void setIsSupportByStages(Integer isSupportByStages) {
        this.isSupportByStages = isSupportByStages;
    }

    public Integer getIsSupportExchange() {
        return isSupportExchange;
    }

    public void setIsSupportExchange(Integer isSupportExchange) {
        this.isSupportExchange = isSupportExchange;
    }

    public BigDecimal getExchangePrice() {
        return exchangePrice;
    }

    public void setExchangePrice(BigDecimal exchangePrice) {
        this.exchangePrice = exchangePrice;
    }

    public Integer getNeedIntegralNumber() {
        return needIntegralNumber;
    }

    public void setNeedIntegralNumber(Integer needIntegralNumber) {
        this.needIntegralNumber = needIntegralNumber;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Integer getGoodsBrowsingVolume() {
        return goodsBrowsingVolume;
    }

    public void setGoodsBrowsingVolume(Integer goodsBrowsingVolume) {
        this.goodsBrowsingVolume = goodsBrowsingVolume;
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

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", isSupportByStages=").append(isSupportByStages);
        sb.append(", isSupportExchange=").append(isSupportExchange);
        sb.append(", exchangePrice=").append(exchangePrice);
        sb.append(", needIntegralNumber=").append(needIntegralNumber);
        sb.append(", goodsSales=").append(goodsSales);
        sb.append(", goodsBrowsingVolume=").append(goodsBrowsingVolume);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}