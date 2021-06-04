package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;
import com.dongogong.service.AuctionFacade;
import com.dongogong.service.TransactionsFacade;

@Controller
@RequestMapping("/auctionFinish.do")
public class AuctionFinishController {

	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@Autowired(required=false)
	private TransactionsFacade transactionsFacade;
	public void setTransactionsFacade(TransactionsFacade transactionsFacade) {
		this.transactionsFacade = transactionsFacade;
	}
	
	@PostMapping
	public ModelAndView auctionProgress(HttpServletRequest request, Model model
			) throws Exception {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		String SpostIdx = request.getParameter("postIdx");
		int postIdx = Integer.valueOf(SpostIdx);
		String buyerId = request.getParameter("buyerId");
		String sellerId = request.getParameter("sellerId");
		
		Transactions transIdx;
		int transactionIdx = 0;
		
		
		try {
			transIdx = transactionsFacade.transactionSize();
			transactionIdx = transIdx.getTransactionsIdx();
		} catch(Exception e) {
			transactionIdx = 0;
		}
		
		Transactions transactions = new Transactions();
		transactions.setTransactionsIdx(++transactionIdx);
		transactions.setBuyerId(buyerId);
		transactions.setPostIdx(postIdx);
		transactions.setSellerId(sellerId);
		transactions.setStatus("DECIDE");
		
		auctionFacade.insertTransaction(transactions);
		auctionFacade.finishAuction(postIdx);
		auctionFacade.auctionPriceFinish(postIdx);
		
		model.addAttribute("userSession", userSession);
		model.addAttribute("userId", userSession.getUserInfo().getUserId());
		model.addAttribute("auctionList", auctionList());
		model.addAttribute("myAuction", myAuction(request));
		//model.addAttribute("transIdx", transIdx);
		//model.addAttribute("auctionProgressList", auctionProgressList(postIdx));
		
		return new ModelAndView("auction");
	}
	
	/*
	public List<AuctionPrice> auctionProgressList(int postIdx) {
		return auctionFacade.auctionProgress(postIdx);
	}*/
	
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
	public Post myAuction(HttpServletRequest request) {
		 UserSession userSession =
	                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		 int postIdx = 0;
		 try{
			 postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());
		 } catch(Exception e) {
			 postIdx = 0;
			 return auctionFacade.myAuction(postIdx);
		 }
		return auctionFacade.myAuction(postIdx);
	}
}
