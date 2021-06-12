package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Transactions;
import com.dongogong.service.TransactionsFacade;

@Controller
@RequestMapping(value="/checkDeal.do")
public class TransactionsCheckController {	//거래 내역 확인

	private TransactionsFacade transactionsFacade;
	
	@Autowired
	public void setTransaction(TransactionsFacade transactionsFacade) {
		this.transactionsFacade = transactionsFacade;
	}
	
	//거래 내역 확인으로 가는 메소드 (myPage.jsp에서 거래내역(checkDeal.jsp)으로 넘어감)
	@GetMapping
	public ModelAndView check(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		return new ModelAndView("checkDeal");
	}
	
	@PostMapping
	/*public ModelAndView transactionsCheck(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		
		
		model.addAttribute("userSession", userSession);
		model.addAttribute("transactionsCheckList", transactionsCheckList(buyer_id));
		model.addAttribute("userId", userSession.getUserInfo().getUserId());
	}
	*/
	public List<Transactions> transactionsCheckList(String buyerId) {
		return transactionsFacade.transactionsCheck(buyerId);
	}
	
}
