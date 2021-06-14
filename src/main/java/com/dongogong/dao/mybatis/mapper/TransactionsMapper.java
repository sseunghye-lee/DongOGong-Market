package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;

@Mapper
public interface TransactionsMapper {
	//구매자가 판매자에게 거래 요청
	//Transactions TransactionsRequest(String buyer_id, String seller_id);
	
	//거래 완료 후 거래 상태 변경
	//Transactions TransactionsStatus(String status);
	//	int TransactionsStatus(String status);
	
	Transactions transactionSize() throws DataAccessException;
	
	// 거래 내역 확인 -> 같은 게시물 id를 가진 transactions 테이블의 모든 레코드 가져오기
	//List<Transactions> transactionsCheck(int postIdx);
	
	// 거래 내역 확인 -> 로그인한 해당 user가 buyerId인 경우의 모든 레코드 가져오기
	List<Transactions> transactionsCheck(String buyerId);
	//sellerId를 통해 닉네임 가져오기.
	String transactionsCheckNickName(String sellerId);
	
	// 장바구니에 추가
	void insertCartTransactions(Transactions transactions);
	 
	// 장바구니에 추가된 상품 가져오기 (같은 buyerId)
	//List<Transactions> cartList(String buyerId) throws DataAccessException; 
}
