package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import com.dongogong.domain.Transactions;

public interface TransactionsMapper {
	//구매자가 판매자에게 거래 요청
	Transactions TransactionsRequest(String buyer_id, String seller_id);
	
	//거래 완료 후 거래 상태 변경
	//Transactions TransactionsStatus(String status);
	//	int TransactionsStatus(String status);

	
	//거래 내역 확인
	List<Transactions> getTransactionsByBuyerName(String buyer_id);
}
