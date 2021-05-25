package com.dongogong.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ChatSummary implements Serializable {

    // 채팅 메세지 idx
    private int chatMessageIdx;

    // 보낸 사람
    private String senderId;

    // 보낸 사람
    private String senderNickName;

    // 받는 사람
    private String receiverId;

    // 보낸 사람
    private String receiverNickName;

    // 관계 idx
    private int chatRelationIdx;

    // 게시물 idx
    private int postIdx;

    // 읽음 여부
    private String readYn;

    // 메세지 내용
    private String content;

    // 전송일자
    private Date createdDateTime;

    public int getChatMessageIdx() {
        return chatMessageIdx;
    }

    public void setChatMessageIdx(int chatMessageIdx) {
        this.chatMessageIdx = chatMessageIdx;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderNickName() {
        return senderNickName;
    }

    public void setSenderNickName(String senderNickName) {
        this.senderNickName = senderNickName;
    }

    public String getReceiverId() {
        return receiverNickName;
    }

    public String getReceiverNickName() {
        return receiverNickName;
    }

    public void setReceiverId(String receiverNickName) {
        this.receiverNickName = receiverNickName;
    }

    public void setReceiverNickName(String receiverNickName) {
        this.receiverNickName = receiverNickName;
    }

    public int getChatRelationIdx() {
        return chatRelationIdx;
    }

    public void setChatRelationIdx(int chatRelationIdx) {
        this.chatRelationIdx = chatRelationIdx;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public String getReadYn() {
        return readYn;
    }

    public void setReadYn(String readYn) {
        this.readYn = readYn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    // ChatMessage 모델 복사
    public void CopyData(ChatSummary param)
    {
        this.chatMessageIdx = param.getChatMessageIdx();
        this.senderId = param.getSenderId();
        this.receiverId = param.getReceiverId();
        this.senderNickName = param.getSenderNickName();
        this.receiverNickName = param.getSenderNickName();
        this.chatRelationIdx = param.getChatRelationIdx();
        this.postIdx = param.getPostIdx();
        this.readYn = param.getReadYn();
        this.content = param.getContent();
        this.createdDateTime = param.getCreatedDateTime();
    }
}
