package com.dongogong.dao;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Transactions;

public interface TransactionsDao {	//거래

	Transactions transactionSize() throws DataAccessException;
	
	// 장바구니에 추가
	void insertCartTransactions(Transactions transactions) throws DataAccessException;
	
	// 장바구니에서 삭제
	void deleteCartTransactions(int postIdx) throws DataAccessException;
	
	String checkBuyer(int postIdx) throws  DataAccessException;
}
