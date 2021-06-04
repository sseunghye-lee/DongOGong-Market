package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dongogong.dao.TransactionsDao;
import com.dongogong.dao.mybatis.mapper.TransactionsMapper;
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

	@Override
	public List<Transactions> getTransactionByBuyerName(String buyer_id) throws DataAccessException {
		return transactionsMapper.getTransactionsByBuyerName(buyer_id);
	}
*/
	
	@Override
	public Transactions transactionSize() throws DataAccessException {
		return transactionsMapper.transactionSize();
	}
}
