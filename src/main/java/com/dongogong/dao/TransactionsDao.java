package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

public interface TransactionsDao {	//거래

	Transactions transactionSize() throws DataAccessException;
	
	// 장바구니에 추가
	void insertCartTransactions(Transactions transactions) throws DataAccessException;
}
