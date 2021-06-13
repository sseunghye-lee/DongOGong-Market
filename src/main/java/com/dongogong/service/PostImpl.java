package com.dongogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
   
   //카테고리별 상품출력
   @Override
   public List<Post> getCategory(String borderType) {
	   return postDao.getCategory(borderType);
   }
   
         
   // 내 상품 가져오기
   @Override
   public List<Post> getPost(String registerId) {
      return postDao.getPost(registerId);
   }
         
// 상품 눌렀을때 정보보기
   @Override
   public Post selectPost(int post_idx) {
      return postDao.selectPost(post_idx);
   }
         
   // 상품 등록
   @Override
   public void registerPost(Post post) {
      postDao.registerPost(post);
   }
   
   @Override
	public void updatePost(Post post) {
		postDao.updatePost(post);
	}
   @Override
	public void postDelete(int postIdx) {
		postDao.postDelete(postIdx);
	}
   
   @Override
	public void transactionDelete(int postIdx) {
		postDao.transactionDelete(postIdx);
		
	}
   @Override
  	public void relationDelete(int postIdx) {
  		postDao.relationDelete(postIdx);
  		
  	}
   @Override
  	public void chatDelete(int postIdx) {
  		postDao.chatDelete(postIdx);
  		
  	}
   
   @Override
	public Post getPostListSize() {
		return postDao.getPostListSize();
	}

	@Override
	public Post getPostIdx(int postIdx) {
		return postDao.getPostIdx(postIdx);
	}
	
   @Override
   public void updatePost(int postIdx) {
      postDao.updatePost(postIdx);
   }

   
}