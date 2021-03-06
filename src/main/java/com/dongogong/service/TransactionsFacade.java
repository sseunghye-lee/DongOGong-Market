package com.dongogong.service;

import com.dongogong.domain.Transactions;

public interface TransactionsFacade {
	
	Transactions transactionSize();
		
	void insertCartTransactions(Transactions transactions);
	
	void deleteCartTransactions(int postIdx);

	String checkBuyer(int postIdx);

	void insertTransactionsOnChat(Transactions transactions);
}
