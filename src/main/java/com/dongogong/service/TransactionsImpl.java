package com.dongogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dongogong.dao.TransactionsDao;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Service
@Transactional
public class TransactionsImpl implements TransactionsFacade {

	@Autowired
	private TransactionsDao transactionsDao;
	
	@Override
	public Transactions transactionSize() {
		return transactionsDao.transactionSize();
	}
	
	/*
	@Override
	public List<Transactions> transactionsCheck(int postIdx) {
		return transactionsDao.transactionsCheck(postIdx);
	}
	*/
	
	@Override
	public List<Transactions> transactionsCheck(String buyerId) {
		return transactionsDao.transactionsCheck(buyerId);
	}
	
	@Override
	public	String transactionsCheckNickName(String sellerId) {
		return transactionsDao.transactionsCheckNickName(sellerId);
	}

	@Override
	public void insertCartTransactions(Transactions transactions) throws DataAccessException {
		transactionsDao.insertCartTransactions(transactions);
	}
	
	
}
