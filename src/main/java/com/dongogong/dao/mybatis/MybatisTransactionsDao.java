package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.dongogong.dao.TransactionsDao;
import com.dongogong.dao.mybatis.mapper.TransactionsMapper;
import com.dongogong.domain.Transactions;

public class MybatisTransactionsDao implements TransactionsDao{
	
	@Autowired
	private TransactionsMapper transactionsMapper;
	
	public Transactions TransactionsRequest(String buyer_id, String seller_id) throws DataAccessException {
		return transactionsMapper.TransactionsRequest(buyer_id, seller_id);
	}

	public List<Transactions> getTransactionByBuyerName(String buyer_id) throws DataAccessException {
		return transactionsMapper.getTransactionsByBuyerName(buyer_id);
	}
}
