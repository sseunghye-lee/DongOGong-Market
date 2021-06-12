package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dongogong.dao.PostDao;
import com.dongogong.dao.mybatis.mapper.PostMapper;
import com.dongogong.domain.Post;

@Repository
public class MybatisPostDao implements PostDao {
	
	@Autowired
	private PostMapper postMapper;
	// 전체상품 가져오기
	@Override
	public List<Post> getPostList() throws DataAccessException {
		return postMapper.getPostList();
	}
	
	@Override
	 public  List<Post> getCategory(String borderType) throws DataAccessException {
		 return postMapper.getCategory(borderType);
	 }
     
	
	// 내 상품 가져오기
	@Override
	public List<Post> getPost(String registerId) throws DataAccessException {
		return postMapper.getPost(registerId);
	}
	
	
	// 상품 눌렀을때 정보보기
		@Override
		public Post selectPost(int post_idx) throws DataAccessException {
			return postMapper.selectPost(post_idx);
		}

	
	// 상품 등록
	@Override
	public void registerPost(Post post) 
			throws DataAccessException {
	   postMapper.registerPost(post);
	}
	
	@Override
	public Post getPostListSize() throws DataAccessException {
		return postMapper.getPostListSize();
	}

	@Override
	public Post getPostIdx(int postIdx) throws DataAccessException {
		return postMapper.getPostIdx(postIdx);
	}
}
