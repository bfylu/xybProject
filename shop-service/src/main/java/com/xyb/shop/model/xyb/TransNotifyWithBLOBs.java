package com.xyb.shop.model.xyb;

import java.io.Serializable;

public class TransNotifyWithBLOBs extends TransNotify implements Serializable {
    private String reqMsg;

    private String respMsg;

    private String excpMsg;

    private String notifyMsg;

    private static final long serialVersionUID = 1L;

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg == null ? null : reqMsg.trim();
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg == null ? null : respMsg.trim();
    }

    public String getExcpMsg() {
        return excpMsg;
    }

    public void setExcpMsg(String excpMsg) {
        this.excpMsg = excpMsg == null ? null : excpMsg.trim();
    }

    public String getNotifyMsg() {
        return notifyMsg;
    }

    public void setNotifyMsg(String notifyMsg) {
        this.notifyMsg = notifyMsg == null ? null : notifyMsg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reqMsg=").append(reqMsg);
        sb.append(", respMsg=").append(respMsg);
        sb.append(", excpMsg=").append(excpMsg);
        sb.append(", notifyMsg=").append(notifyMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}