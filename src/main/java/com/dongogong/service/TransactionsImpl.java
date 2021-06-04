package com.dongogong.service;

import org.springframework.beans.factory.annotation.Autowired;
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

}
