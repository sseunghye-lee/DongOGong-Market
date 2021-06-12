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
   
   public Post getPostListSize();
   
   public Post getPostIdx(int postIdx);
   
}