package com.dongogong.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

// 구매자 판매자 채팅 메세지
@SuppressWarnings("serial")
@Entity
@Table(name = "CHAT_MESSAGE")
public class ChatMessage implements Serializable {

    // 채팅 메세지 idx
    @Id
//    @Column(name="chat_message_idx")
    private int chatMessageIdx;

    // 보낸 사람
    private String senderId;

    // 받는 사람
    private String receiverId;

    // 관계 idx
    private int chatRelationIdx;

    // 게시물 idx
    private int postIdx;

    // 읽음 여부
    private String readYn;

    // 메세지 내용
    private String content;

    // 전송일자
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    @Column(name = "CREATED_DATE_TIME", updatable = false)
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

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
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
    public void CopyData(ChatMessage param)
    {
        this.chatMessageIdx = param.getChatMessageIdx();
        this.senderId = param.getSenderId();
        this.receiverId = param.getReceiverId();
        this.chatRelationIdx = param.getChatRelationIdx();
        this.postIdx = param.getPostIdx();
        this.readYn = param.getReadYn();
        this.content = param.getContent();
        this.createdDateTime = param.getCreatedDateTime();
    }
}
