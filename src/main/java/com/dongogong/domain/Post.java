package com.dongogong.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Post implements Serializable {
    // 해당 상품 idx
    private int postIdx;

    // 상품 등록자 id
    private String registerId;

    // 상품 이름
    private String title;

    // 카테고리
    private String borderType;
    
    //가격
    private int price;

	// 내용
    private String content;

    // 거래확정 여부
    private String transactionConfirmation;
    
    private String photoUrl;
    
    public Post() {}

    public Post(int postIdx, String registerId, String title, String borderType, int price, String content,
			String transactionConfirmation, String photoUrl) {
		super();
		this.postIdx = postIdx;
		this.registerId = registerId;
		this.title = title;
		this.borderType = borderType;
		this.price = price;
		this.content = content;
		this.transactionConfirmation = transactionConfirmation;
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBorderType() {
        return borderType;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTransactionConfirmation() {
        return transactionConfirmation;
    }

    public void setTransactionConfirmation(String transactionConfirmation) {
        this.transactionConfirmation = transactionConfirmation;
    }

	
    public void CopyData(Post param)
    {
        this.postIdx = param.getPostIdx();
        this.registerId = param.getRegisterId();
        this.title = param.getTitle();
        this.borderType = param.getBorderType();
        this.price = param.getPrice();
        this.content = param.getContent();
        this.transactionConfirmation = param.getTransactionConfirmation();
        this.photoUrl = param.getPhotoUrl();
    }
}
