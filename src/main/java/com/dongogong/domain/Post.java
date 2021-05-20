package com.dongogong.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Post implements Serializable {
    // 寃뚯떆臾� idx
    private int postIdx;

    // �벑濡앹옄 id
    private String registerId;

    // 寃뚯떆臾� �젣紐�
    private String title;

    // 寃뚯떆�뙋 醫낅쪟
    private String borderType;
    
    // �긽�뭹 媛�寃�
    private int price;

	// 寃뚯떆臾� �궡�슜
    private String content;

    // 嫄곕옒 �솗�젙 �뿬遺�
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

    // Post 紐⑤뜽 蹂듭궗
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
