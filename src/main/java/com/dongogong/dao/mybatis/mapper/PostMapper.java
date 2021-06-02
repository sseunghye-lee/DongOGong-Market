package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;

@Mapper
public interface PostMapper {
	// 전체상품 가져오기
			List<Post> getPostList();
			// 내 상품 가져오기
			Post getPost(int post_idx); 
			
			
			// 상품 눌렀을때 정보보기
			Post selectPost(int post_idx, String content);
			

			// 상품 등록
			void registerPost(Post post) throws DataAccessException;
			
			// 전체 상품 가져오기
			Post getPostListSize();
}
