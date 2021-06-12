package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dongogong.dao.TransactionsDao;
import com.dongogong.dao.mybatis.mapper.TransactionsMapper;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Repository
public class MybatisTransactionsDao implements TransactionsDao {
	
	@Autowired
	private TransactionsMapper transactionsMapper;
	
	/*
	@Override
	public Transactions TransactionsRequest(String buyer_id, String seller_id) throws DataAccessException {
		return transactionsMapper.TransactionsRequest(buyer_id, seller_id);
	}
	*/
	
	@Override
	public Transactions transactionSize() throws DataAccessException {
		return transactionsMapper.transactionSize();
	}
	
	/*@Override
	public List<Transactions> transactionsCheck(int postIdx) throws DataAccessException {
		return transactionsMapper.transactionsCheck(postIdx);
	}*/
	
	@Override
	public List<Transactions> transactionsCheck(String buyerId) throws DataAccessException {
		return transactionsMapper.transactionsCheck(buyerId);
	}
	
	@Override
	public String transactionsCheckNickName(String sellerId) throws DataAccessException {
		return transactionsMapper.transactionsCheckNickName(sellerId);
	}
	
	
	
	/*
    // 장바구니에 추가
	@Override
    public void insertCart(Post post) throws DataAccessException {
		transactionsMapper.insertCart(post);
	}
    
   

	//거래 추가
	@Override
	public void insertTransactions(Post post) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	 // 장바구니 보기
	@Override
	public List<Transactions> cartList(int postIdx) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	@Override
	public void insertCartTransactions(Transactions transactions) throws DataAccessException{
		transactionsMapper.insertCartTransactions(transactions);
	}
}
