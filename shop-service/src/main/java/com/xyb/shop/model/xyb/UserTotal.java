package com.xyb.shop.model.xyb;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserTotal implements Serializable {
    private Long id;

    private String username;

    private String merCode;

    private BigDecimal totalAcquire;

    private BigDecimal totalBonus;

    private BigDecimal totalProfit;

    private BigDecimal totalAgentGain;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public BigDecimal getTotalAcquire() {
        return totalAcquire;
    }

    public void setTotalAcquire(BigDecimal totalAcquire) {
        this.totalAcquire = totalAcquire;
    }

    public BigDecimal getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(BigDecimal totalBonus) {
        this.totalBonus = totalBonus;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    public BigDecimal getTotalAgentGain() {
        return totalAgentGain;
    }

    public void setTotalAgentGain(BigDecimal totalAgentGain) {
        this.totalAgentGain = totalAgentGain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", merCode=").append(merCode);
        sb.append(", totalAcquire=").append(totalAcquire);
        sb.append(", totalBonus=").append(totalBonus);
        sb.append(", totalProfit=").append(totalProfit);
        sb.append(", totalAgentGain=").append(totalAgentGain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}