package com.dongogong.service;

import java.util.List;

import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

public interface AuctionFacade {

	// 1) 경매 등록
	void insertAuction(Post post); 
				
	// 2) 경매 수정
	void updateAuction(Post post);
				
	// 3) 경매 마감
	void finishAuction(Post post);
	String postRegisterId(int postIdx);
	void insertTransaction(Transactions transactions);
	void auctionPriceFinish(AuctionPrice auctionPrice);		
		
	// 4) 경매 리스트
	List<Post> auctionList();

	// 5) 내가 등록한 경매
	// registerId로 postIdx를 찾아야 그 것을 통해 사진을 찾을 수 있음(borderType도 경매여야함)
	int myAuctionRegister(String registerId);
	Post myAuction(int postIdx);
				
	// 7) 경매 참여 -> AuctionPrice에 record추가, post 테이블의 price 업데이트
	void attendAuction(AuctionPrice auctionPrice);
	// auctionSend와 updatePostPrice 메소드 사용할 것
				
	// 8) 경매 진행 상황 -> 같은 게시물 id를 가진 auction_price 테이블의 모든 레코드 가져옴
	List<AuctionPrice> auctionProgress(int postIdx);
	// buyerId를 통해 닉네임을 가져옴
	String auctionNickName(String buyerId);
	
}
