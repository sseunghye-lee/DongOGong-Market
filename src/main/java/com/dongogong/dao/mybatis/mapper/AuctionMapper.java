package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.dongogong.domain.AuctionPrice;
//import com.dongogong.domain.Photo;
//import com.dongogong.domain.Photo;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Mapper
public interface AuctionMapper {
	// 1) 경매 등록
	void auctionRegister(Post post) throws DataAccessException;
	// 경매 등록 시 사진도 넣어야함
	//void auctionPhoto(Photo photo) throws DataAccessException;
		
	// 2) 경매 수정
	void auctionUpdate(Post post) throws DataAccessException;
	// 경매 수정 시 사진도 변경될 수 있음
	//void photoUpdate(Photo photo) throws DataAccessException;
		
	// 3) 경매 마감 -> post 테이블의 거래확정 여부 변경
	void auctionFinish(Post post) throws DataAccessException;
	// transaction에 넣을 sellerId 가져오기
	String postRegisterId(int postIdx) throws DataAccessException;
	// transaction 테이블에 거래 완료된 경매 상품 넣기
	void insertTransaction(Transactions transactions) throws DataAccessException;
	// auction_price 테이블의 상태 변경
	void auctionPriceFinish(AuctionPrice auctionPrice) throws DataAccessException;
	
	// 4) 경매 리스트
	List<Post> auctionList() throws DataAccessException;
	//List<Photo> auctionPhotoList() throws DataAccessException;

	// 5) 내가 등록한 경매 -> 로그인된 user_id와 registerId는 같음
	Post myAuction(int post_idx) throws DataAccessException;
	// registerId로 postIdx를 찾아야 그 것을 통해 사진을 찾을 수 있음(borderType도 경매여야함)
	int myAuctionRegister(String registerId) throws DataAccessException;
	
	// 6) 경매 가격 보여주기 (생략)
	//AuctionPrice auctionPrice(int post_idx) throws DataAccessException;
	//Post auctionPrice2(int post_idx) throws DataAccessException;
	// -> 경매로 등록된 현재 게시물의 price가 경매 가격임
		
	// 7) 경매 참여
	void auctionSend(AuctionPrice auctionPrice) throws DataAccessException;
	// AuctionPrice 테이블에 insert 될 때의 price 값을 post 테이블의 price에도 반영함
	void updatePostPrice(String price, int postIdx) throws DataAccessException;
	// 원래 가격에서 일정 금액을 더한 price로 업데이트
	void updateAuctionPrice(String price) throws DataAccessException;
	
	// 8) 경매 진행 상황
	List<AuctionPrice> auctionProgress(int post_idx) throws DataAccessException;
	// buyerId를 통해 닉네임을 가져옴
	String auctionNickName(String buyerId) throws DataAccessException;
	
}
