package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

public interface TransactionsDao {	//거래
	
	/*
	//구매자가 판매자에게 거래 요청
	Transactions TransactionsRequest(String buyer_id, String seller_id) throws DataAccessException;
	*/
	
	Transactions transactionSize() throws DataAccessException;
	
	// 거래 내역 확인 -> 같은 게시물 id를 가진 transactions 테이블의 모든 레코드 가져오기
	//List<Transactions> transactionsCheck(int postIdx) throws DataAccessException;
	
	// 거래 내역 확인 -> 로그인한 해당 user가 buyerId인 경우의 모든 레코드 가져오기
	List<Transactions> transactionsCheck(String buyerId) throws DataAccessException;
	
	//sellerId를 통해 닉네임 가져오기.
	String transactionsCheckNickName(String sellerId) throws DataAccessException;
	
	/*
	//거래 추가
	void insertTransactions(Post post) throws DataAccessException;
	
    // 장바구니에 추가
    void insertCart(Post post) throws DataAccessException;
    
    // 장바구니 보기
    List<Transactions> cartList(int postIdx) throws DataAccessException;
    */
	
	// 장바구니에 추가
	void insertCartTransactions(Transactions transactions) throws DataAccessException;
	
}
