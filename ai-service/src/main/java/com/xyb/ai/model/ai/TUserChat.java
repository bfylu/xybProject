package com.xyb.ai.model.ai;

import java.io.Serializable;
import java.util.Date;

public class TUserChat implements Serializable {
    private Long id;

    private String buyUserId;

    private String merCode;

    private String content;

    private Date chatTime;

    private Integer messageTypeId;

    private Short msgStatus;

    private Short status;

    private Date createDt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(String buyUserId) {
        this.buyUserId = buyUserId == null ? null : buyUserId.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getChatTime() {
        return chatTime;
    }

    public void setChatTime(Date chatTime) {
        this.chatTime = chatTime;
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Short getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Short msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
        sb.append(", buyUserId=").append(buyUserId);
        sb.append(", merCode=").append(merCode);
        sb.append(", content=").append(content);
        sb.append(", chatTime=").append(chatTime);
        sb.append(", messageTypeId=").append(messageTypeId);
        sb.append(", msgStatus=").append(msgStatus);
        sb.append(", status=").append(status);
        sb.append(", createDt=").append(createDt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}