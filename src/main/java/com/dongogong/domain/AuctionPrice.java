package com.dongogong.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AuctionPrice implements Serializable { // 경매가 idx
    private int auctionPriceId;

    // 해당 게시물
    private int postIdx;

    // 제시가
    private int price;

    // 당첨 낙첨 여부
    private String status;

    // 참여자
    private String buyerId;

    public int getAuctionPriceId() {
        return auctionPriceId;
    }

    public void setAuctionPriceId(int auctionPriceId) {
        this.auctionPriceId = auctionPriceId;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }
    
    public AuctionPrice() {}

    // AuctionPrice 모델 복사
    public void CopyData(AuctionPrice param)
    {
        this.auctionPriceId = param.getAuctionPriceId();
        this.postIdx = param.getPostIdx();
        this.price = param.getPrice();
        this.status = param.getStatus();
        this.buyerId = param.getBuyerId();
    }
}
