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
	 // 카테고리별 상품출력
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
	
	//상품 수정
	@Override
	public void updatePost(Post post) throws DataAccessException {
		postMapper.postUpdate(post);
	}
	
	 //상품 삭제
	@Override
	public void postDelete(int postIdx) throws DataAccessException {
		postMapper.postDelete(postIdx);
	}
	
	//거래 삭제
	@Override
	public void transactionDelete(int postIdx) throws DataAccessException {
		postMapper.transactionDelete(postIdx);
		
	}
	
	//릴레이션 삭제
	@Override
	public void relationDelete(int postIdx) throws DataAccessException {
		postMapper.relationDelete(postIdx);
		
	}
	//채팅 삭제
	@Override
	public void chatDelete(int postIdx) throws DataAccessException {
		postMapper.chatDelete(postIdx);
		
	}
	
	@Override
	public Post getPostListSize() throws DataAccessException {
		return postMapper.getPostListSize();
	}

	@Override
	public Post getPostIdx(int postIdx) throws DataAccessException {
		return postMapper.getPostIdx(postIdx);
	}

    @Override
    public void updatePost(int postIdx) throws DataAccessException {
       postMapper.updatePost(postIdx);  
    }

    //장바구니에 추가된 상품 가져오기
    @Override
   	public List<Post> cartList(String buyerId) throws DataAccessException {
    	return postMapper.cartList(buyerId);
    }
    
	@Override
	public List<Post> transactionsCheckList(String buyerId) throws DataAccessException {
		return postMapper.transactionsCheckList(buyerId);
	}
	
	@Override
	public void deleteCartPost(int postIdx) throws DataAccessException {
		postMapper.deleteCartPost(postIdx);
	}
}
