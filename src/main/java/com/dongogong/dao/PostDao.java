package com.dongogong.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;

public interface PostDao {
      // 전체상품 가져오기
      List<Post> getPostList() throws DataAccessException;
      
      // 카테고리별 상품출력
      List<Post> getCategory(String borderType) throws DataAccessException;
      
      // 내 상품 가져오기
      List<Post> getPost(String registerId) throws DataAccessException;
      
      // 상품 눌렀을때 정보보기
      Post selectPost(int post_idx) throws DataAccessException;
      
      // 상품 등록
      void registerPost(Post post) throws DataAccessException;
      
      void updatePost(Post post) throws DataAccessException;
  	
      void postDelete(int postIdx) throws DataAccessException;
  	
      void transactionDelete(int postIdx) throws DataAccessException;
      void relationDelete(int postIdx) throws DataAccessException;
    	
      void chatDelete(int postIdx) throws DataAccessException;
    	
      
      Post getPostListSize() throws DataAccessException;
      
      Post getPostIdx(int postIdx) throws DataAccessException;
      
      // 장바구니 추가 시 상태 변경
      void updatePost(int postIdx) throws DataAccessException;
      
     //장바구니에 추가된 상품 가져오기
     List<Post> cartList(String buyerId) throws DataAccessException;
     
  	 // 거래 내역 확인 -> 로그인한 해당 user가 buyerId인 경우의 모든 레코드 가져오기
  	 List<Post> transactionsCheckList(String buyerId) throws DataAccessException;
}