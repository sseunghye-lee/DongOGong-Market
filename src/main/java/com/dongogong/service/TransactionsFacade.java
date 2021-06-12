package com.dongogong.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

public interface TransactionsFacade {
	
	Transactions transactionSize();
	
	// 거래 내역 확인 -> 같은 게시물 id를 가진 transactions 테이블의 모든 레코드 가져오기
	//List<Transactions> transactionsCheck(int postIdx);
	
	// 거래 내역 확인 -> 로그인한 해당 user가 buyerId인 경우의 모든 레코드 가져오기
	List<Transactions> transactionsCheck(String buyerId);
	//sellerId를 통해 닉네임 가져오기.
	String transactionsCheckNickName(String sellerId);
	
	// 장바구니에 추가
	//void insertCart(Post post) throws DataAccessException;
	
	void insertCartTransactions(Transactions transactions); 
}
