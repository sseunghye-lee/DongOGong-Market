package com.dongogong.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Transactions;

@Mapper
public interface TransactionsMapper {
	
	Transactions transactionSize() throws DataAccessException;
	
	// 장바구니에 추가
	void insertCartTransactions(Transactions transactions);
	
	// 장바구니에서 삭제
	void deleteCartTransactions(int postIdx);
	
	String checkBuyer(int postIdx) throws DataAccessException;
}
