package com.xyb.ai.model.ai;

import java.io.Serializable;

public class TPca implements Serializable {
    private String pcaCode;

    private String pcaName;

    private Boolean status;

    private String pcaDesc;

    private static final long serialVersionUID = 1L;

    public String getPcaCode() {
        return pcaCode;
    }

    public void setPcaCode(String pcaCode) {
        this.pcaCode = pcaCode == null ? null : pcaCode.trim();
    }

    public String getPcaName() {
        return pcaName;
    }

    public void setPcaName(String pcaName) {
        this.pcaName = pcaName == null ? null : pcaName.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPcaDesc() {
        return pcaDesc;
    }

    public void setPcaDesc(String pcaDesc) {
        this.pcaDesc = pcaDesc == null ? null : pcaDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pcaCode=").append(pcaCode);
        sb.append(", pcaName=").append(pcaName);
        sb.append(", status=").append(status);
        sb.append(", pcaDesc=").append(pcaDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}