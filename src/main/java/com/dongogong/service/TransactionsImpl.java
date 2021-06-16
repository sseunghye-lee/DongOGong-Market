package com.dongogong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dongogong.dao.TransactionsDao;
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

	@Override
	public void insertCartTransactions(Transactions transactions) throws DataAccessException {
		transactionsDao.insertCartTransactions(transactions);
	}

	@Override
	public void deleteCartTransactions(int postIdx) {
		transactionsDao.deleteCartTransactions(postIdx);   
	}   

	@Override
	public String checkBuyer(int postIdx) {
		return transactionsDao.checkBuyer(postIdx);
	}
}
