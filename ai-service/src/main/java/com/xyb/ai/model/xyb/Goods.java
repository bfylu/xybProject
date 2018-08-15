package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    private Long id;

    private String merCode;

    private String username;

    private String refNo;

    private Integer goodsSrc;

    private String goodsName;

    private Long goodsTypeId;

    private BigDecimal purchasePrice;

    private BigDecimal goodsPrice;

    private Float goodsWeight;

    private Integer goodsWeightUnit;

    private Float goodsWidth;

    private Float goodsHeight;

    private Float goodsLength;

    private String goodsPic;

    private String goodsDesc;

    private String brand;

    private String barCode;

    private Integer stock;

    private BigDecimal freight;

    private Date createTime;

    private Date updateTime;

    private String ruleNo;

    private Integer isSupportExchange;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public Integer getGoodsSrc() {
        return goodsSrc;
    }

    public void setGoodsSrc(Integer goodsSrc) {
        this.goodsSrc = goodsSrc;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Float getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Float goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getGoodsWeightUnit() {
        return goodsWeightUnit;
    }

    public void setGoodsWeightUnit(Integer goodsWeightUnit) {
        this.goodsWeightUnit = goodsWeightUnit;
    }

    public Float getGoodsWidth() {
        return goodsWidth;
    }

    public void setGoodsWidth(Float goodsWidth) {
        this.goodsWidth = goodsWidth;
    }

    public Float getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(Float goodsHeight) {
        this.goodsHeight = goodsHeight;
    }

    public Float getGoodsLength() {
        return goodsLength;
    }

    public void setGoodsLength(Float goodsLength) {
        this.goodsLength = goodsLength;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
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

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo == null ? null : ruleNo.trim();
    }

    public Integer getIsSupportExchange() {
        return isSupportExchange;
    }

    public void setIsSupportExchange(Integer isSupportExchange) {
        this.isSupportExchange = isSupportExchange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merCode=").append(merCode);
        sb.append(", username=").append(username);
        sb.append(", refNo=").append(refNo);
        sb.append(", goodsSrc=").append(goodsSrc);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsTypeId=").append(goodsTypeId);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsWeight=").append(goodsWeight);
        sb.append(", goodsWeightUnit=").append(goodsWeightUnit);
        sb.append(", goodsWidth=").append(goodsWidth);
        sb.append(", goodsHeight=").append(goodsHeight);
        sb.append(", goodsLength=").append(goodsLength);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", brand=").append(brand);
        sb.append(", barCode=").append(barCode);
        sb.append(", stock=").append(stock);
        sb.append(", freight=").append(freight);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", isSupportExchange=").append(isSupportExchange);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}