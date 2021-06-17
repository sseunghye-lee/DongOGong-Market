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
         
   // 2) 경매 수정
   void updateAuction(Post post) throws DataAccessException;
         
   // 3) 경매 마감
   void finishAuction(int postIdx) throws DataAccessException;
   String postRegisterId(int postIdx) throws DataAccessException;
   void insertTransaction(Transactions transactions) throws DataAccessException;
   void auctionPriceFinish(int postIdx) throws DataAccessException;      
   
   // 4) 경매 리스트
   List<Post> auctionList() throws DataAccessException;

   // 5) 내가 등록한 경매
   // registerId로 postIdx를 찾아야 그 것을 통해 사진을 찾을 수 있음(borderType도 경매여야함)
   int myAuctionRegister(String registerId) throws DataAccessException;
   Post myAuction(int postIdx) throws DataAccessException;
         
         
   // 7) 경매 참여 -> AuctionPrice에 record추가, post 테이블의 price 업데이트
   void attendAuction(AuctionPrice auctionPrice) throws DataAccessException;
   // auctionSend와 updatePostPrice 메소드 사용할 것
         
   // 8) 경매 진행 상황 -> 같은 게시물 id를 가진 auction_price 테이블의 모든 레코드 가져옴
   List<AuctionPrice> auctionProgress(int postIdx) throws DataAccessException;
   
   AuctionPrice auctionPriceSize() throws DataAccessException;
   
   // 경매 삭제하기
   void auctionDelete(int postIdx) throws DataAccessException;
      
   // auctionPrice에서 해당 경매참가한 내역 삭제하기
   void auctionPriceDelete(int postIdx) throws DataAccessException;
   
   Post auctionRegisterId(int postIdx) throws DataAccessException;
   
   AuctionPrice auctionMax(int postIdx) throws DataAccessException;
   
   void transactionDelete(int postIdx) throws DataAccessException;
   
}