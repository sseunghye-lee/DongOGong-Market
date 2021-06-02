package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.AuctionPrice;
//import com.dongogong.domain.Photo;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

public interface AuctionPriceDao {
	// 1) 경매 등록
	void insertAuction(Post post) throws DataAccessException;
	//void insertPhoto(Photo photo) throws DataAccessException;
			
	// 2) 경매 수정
	void updateAuction(Post post) throws DataAccessException;
	//void updatePhoto(Photo photo) throws DataAccessException;
			
	// 3) 경매 마감
	void finishAuction(Post post) throws DataAccessException;
	String postRegisterId(int postIdx) throws DataAccessException;
	void insertTransaction(Transactions transactions) throws DataAccessException;
	void auctionPriceFinish(AuctionPrice auctionPrice) throws DataAccessException;		
	
	// 4) 경매 리스트
	List<Post> auctionList() throws DataAccessException;

	// 5) 내가 등록한 경매
	// registerId로 postIdx를 찾아야 그 것을 통해 사진을 찾을 수 있음(borderType도 경매여야함)
	int myAuctionRegister(String registerId) throws DataAccessException;
	Post myAuction(int postIdx) throws DataAccessException;
			
	// 6) 경매 가격 보여주기(생략)
	//AuctionPrice auctionPrice(int post_idx) throws DataAccessException;
	//Post auctionPrice2(int post_idx) throws DataAccessException;
			
	// 7) 경매 참여 -> AuctionPrice에 record추가, post 테이블의 price 업데이트
	void attendAuction(AuctionPrice auctionPrice) throws DataAccessException;
	// auctionSend와 updatePostPrice 메소드 사용할 것
			
	// 8) 경매 진행 상황 -> 같은 게시물 id를 가진 auction_price 테이블의 모든 레코드 가져옴
	List<AuctionPrice> auctionProgress(int postIdx) throws DataAccessException;
	// buyerId를 통해 닉네임을 가져옴
	String auctionNickName(String buyerId) throws DataAccessException;
	
	List<AuctionPrice> auctionPriceSize() throws DataAccessException;
}
