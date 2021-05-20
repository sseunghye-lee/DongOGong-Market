package com.dongogong.controller;

import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//거래 내역 확인으로 가는 메소드(마이페이지에서 거래내역으로 넘어감) -> getTransactionsByBuyer 메소드 이용
@Controller
public class TransactionsCheckController {
/*
	private TransactionService transactionService;
	
	@Autowired
	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@RequestMapping("jsp/checkDeal.do")
	public ModelAndView handleRequest (
			@ModelAttribute("") 
			)throws Exception {
		return new ModelAndView("", "", transactionService.getTransactionsByBuyer());
		
	}
*/	
}
