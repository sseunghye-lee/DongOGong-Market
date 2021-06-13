package com.dongogong.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;

public interface PostFacade {
   // 전체상품 가져오기
   public List<Post> getPostList();
   
   // 카테고리별 상품 출력
   public List<Post> getCategory(String borderType);
   
         
   // 내 상품 가져오기
   public List<Post> getPost(String registerId);
	     
   // 상품 눌렀을때 정보보기
   Post selectPost(int post_idx);

         
   // 상품 등록
   void registerPost(Post post);
   // 상품 업데이트
   void updatePost(Post post);
   //상품 삭제
   void postDelete(int postIdx);
   void transactionDelete(int postIdx);
   void relationDelete(int postIdx);
   void chatDelete(int postIdx);
	
   
   public Post getPostListSize();
   
   public Post getPostIdx(int postIdx);
   
   // 장바구니 추가 시 상태변경
   void updatePost(int postIdx);

   
}