package com.xyb.ai.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallSellOrder implements Serializable {
    private Long id;

    private String memberNo;

    private String sellerMerCode;

    private String billNo;

    private String orderNo;

    private BigDecimal orderAmount;

    private Date orderTime;

    private Date expireTime;

    private String orderDesc;

    private Integer sellerOrderStatus;

    private Integer takeMethod;

    private String paymentOrderNo;

    private BigDecimal paymentAmount;

    private String installmentOrderNo;

    private String goodsSnapshotIds;

    private String isFinish;

    private String remark;

    private String userName;

    private String userPhone;

    private String userTel;

    private Integer orderType;

    private String provinceCode;

    private String cityCode;

    private String areaCode;

    private String address;

    private Integer postCode;

    private Integer isInvoice;

    private String invoiceClient;

    private Integer isdel;

    private String sellerCloseCauseNo;

    private String sellerCloseCause;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    public String getSellerMerCode() {
        return sellerMerCode;
    }

    public void setSellerMerCode(String sellerMerCode) {
        this.sellerMerCode = sellerMerCode == null ? null : sellerMerCode.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Integer getSellerOrderStatus() {
        return sellerOrderStatus;
    }

    public void setSellerOrderStatus(Integer sellerOrderStatus) {
        this.sellerOrderStatus = sellerOrderStatus;
    }

    public Integer getTakeMethod() {
        return takeMethod;
    }

    public void setTakeMethod(Integer takeMethod) {
        this.takeMethod = takeMethod;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo == null ? null : paymentOrderNo.trim();
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getInstallmentOrderNo() {
        return installmentOrderNo;
    }

    public void setInstallmentOrderNo(String installmentOrderNo) {
        this.installmentOrderNo = installmentOrderNo == null ? null : installmentOrderNo.trim();
    }

    public String getGoodsSnapshotIds() {
        return goodsSnapshotIds;
    }

    public void setGoodsSnapshotIds(String goodsSnapshotIds) {
        this.goodsSnapshotIds = goodsSnapshotIds == null ? null : goodsSnapshotIds.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceClient() {
        return invoiceClient;
    }

    public void setInvoiceClient(String invoiceClient) {
        this.invoiceClient = invoiceClient == null ? null : invoiceClient.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public String getSellerCloseCauseNo() {
        return sellerCloseCauseNo;
    }

    public void setSellerCloseCauseNo(String sellerCloseCauseNo) {
        this.sellerCloseCauseNo = sellerCloseCauseNo == null ? null : sellerCloseCauseNo.trim();
    }

    public String getSellerCloseCause() {
        return sellerCloseCause;
    }

    public void setSellerCloseCause(String sellerCloseCause) {
        this.sellerCloseCause = sellerCloseCause == null ? null : sellerCloseCause.trim();
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
        sb.append(", memberNo=").append(memberNo);
        sb.append(", sellerMerCode=").append(sellerMerCode);
        sb.append(", billNo=").append(billNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", orderDesc=").append(orderDesc);
        sb.append(", sellerOrderStatus=").append(sellerOrderStatus);
        sb.append(", takeMethod=").append(takeMethod);
        sb.append(", paymentOrderNo=").append(paymentOrderNo);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", installmentOrderNo=").append(installmentOrderNo);
        sb.append(", goodsSnapshotIds=").append(goodsSnapshotIds);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", remark=").append(remark);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userTel=").append(userTel);
        sb.append(", orderType=").append(orderType);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", invoiceClient=").append(invoiceClient);
        sb.append(", isdel=").append(isdel);
        sb.append(", sellerCloseCauseNo=").append(sellerCloseCauseNo);
        sb.append(", sellerCloseCause=").append(sellerCloseCause);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}