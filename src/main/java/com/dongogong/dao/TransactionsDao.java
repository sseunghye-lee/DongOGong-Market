package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Transactions;

public interface TransactionsDao {	//거래
	
	/*
	//구매자가 판매자에게 거래 요청
	Transactions TransactionsRequest(String buyer_id, String seller_id) throws DataAccessException;

	List<Transactions> getTransactionByBuyerName(String buyer_id) throws DataAccessException; */
	
	Transactions transactionSize() throws DataAccessException;
}
