package com.dongogong.dao.mybatis;

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
	
	@Override
	public Transactions transactionSize() throws DataAccessException {
		return transactionsMapper.transactionSize();
	}
	
	@Override
	public void insertCartTransactions(Transactions transactions) throws DataAccessException{
		transactionsMapper.insertCartTransactions(transactions);
	}
	
	@Override
	public void deleteCartTransactions(int postIdx) throws DataAccessException {
		transactionsMapper.deleteCartTransactions(postIdx);
	}

	@Override
	public String checkBuyer(int postIdx) throws DataAccessException {
		return transactionsMapper.checkBuyer(postIdx);
	}
}
