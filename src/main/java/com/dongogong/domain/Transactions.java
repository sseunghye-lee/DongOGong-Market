package com.dongogong.domain;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Transactions implements Serializable {
    // 거래 기록 idx
    private int transactionsIdx;

    // 게시판 idx
    private int borderIdx;

    // 게시물 idx
    private int postIdx;

    // 판매자 id
    private String sellerId;

    // 구매자 id
    private String buyerId;

    // 거래 상태 (확정, 취소, 진행)
    private String status;
    
    // 거래 날짜
    private Date transactionsDate;

    public int getTransactionsIdx() {
        return transactionsIdx;
    }

    public void setTransactionsIdx(int transactionsIdx) {
        this.transactionsIdx = transactionsIdx;
    }

    public int getBorderIdx() {
        return borderIdx;
    }

    public void setBorderIdx(int borderIdx) {
        this.borderIdx = borderIdx;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getTransactionsDate() {
		return transactionsDate;
	}

	public void setTransactionsDate(Date transactionsDate) {
		this.transactionsDate = transactionsDate;
	}

	// Transactions 모델 복사
    public void CopyData(Transactions param)
    {
        this.transactionsIdx = param.getTransactionsIdx();
        this.borderIdx = param.getBorderIdx();
        this.postIdx = param.getPostIdx();
        this.sellerId = param.getSellerId();
        this.buyerId = param.getBuyerId();
        this.status = param.getStatus();
        this.transactionsDate = param.getTransactionsDate();
    }
    
    public void initTransactions(UserInfo userInfo, Post post) {
    	sellerId = userInfo.getUserId();
    	buyerId = userInfo.getUserId();
    	
    	transactionsDate = new Date();
    	
    }
}
