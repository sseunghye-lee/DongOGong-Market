package com.dongogong.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "RELATION")
public class Relation implements Serializable {

    // 관계 idx
    @Id
    private int relationIdx;

    // 사용자 1
    @Column(name="USER1_ID")
    private String user1Id;

    // 사용자 2
    @Column(name="USER2_ID")
    private String user2Id;

    @Column(name="POST_IDX")
    private int postIdx;

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public int getRelationIdx() {
        return relationIdx;
    }

    public void setRelationIdx(int relationIdx) {
        this.relationIdx = relationIdx;
    }

    public String getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(String user1Id) {
        this.user1Id = user1Id;
    }

    public String getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(String user2Id) {
        this.user2Id = user2Id;
    }

    // Relation 모델 복사
    public void CopyData(Relation param)
    {
        this.relationIdx = param.getRelationIdx();
        this.user1Id = param.getUser1Id();
        this.user2Id = param.getUser2Id();
        this.postIdx = param.getPostIdx();
    }
}
