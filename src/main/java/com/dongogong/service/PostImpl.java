package com.dongogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dongogong.dao.PostDao;
import com.dongogong.domain.Post;
@Service
@Transactional
public class PostImpl implements PostFacade{
	
   @Autowired
   private PostDao postDao;
   
   // 전체상품 가져오기
   @Override
   public List<Post> getPostList() {
      return postDao.getPostList();
   }
         
   // 내 상품 가져오기
   @Override
   public Post getPost(int post_idx) {
      return postDao.getPost(post_idx);
   }
         
   // 상품 눌렀을때 정보보기
   @Override
   public Post selectPost(int post_idx, String content) {
      return postDao.selectPost(post_idx, content);
   }
         
   // 상품 등록
   @Override
   public Post registerPost(String registerId) {
      return postDao.registerPost(registerId);
   }

   @Override
	public List<Post> getPostListSize() {
		return postDao.getPostListSize();
	}
   
   
}