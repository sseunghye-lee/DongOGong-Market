package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;
import com.dongogong.service.PostFacade;
import com.dongogong.service.TransactionsFacade;

//장바구니 리스트에서 장바구니 내역 삭제하기
@Controller
@RequestMapping("/cartDelete.do")
public class CartDeleteController {
   
    @Autowired(required=false)
    private PostFacade postFacade;
    public void setPostFacade(PostFacade postFacade) {
       this.postFacade = postFacade;
    }
    @Autowired(required=false)
    private TransactionsFacade transactionsFacade;
    public void setTransactionsFacade(TransactionsFacade transactionsFacade) {
       this.transactionsFacade = transactionsFacade;
    }
    
    @GetMapping
    public ModelAndView cart(HttpServletRequest request, Model model) {
    	UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
    	
      String SPostIdx = request.getParameter("postIdx");
      int postIdx = Integer.valueOf(SPostIdx); 
      Post post = postFacade.getPostIdx(postIdx); 
      
      String buyerId = request.getParameter("buyerId");
      
      Transactions transIdx;
      int transactionIdx = 0; 
      
      try {
         transIdx = transactionsFacade.transactionSize();
         transactionIdx = transIdx.getTransactionsIdx();
      } catch(Exception e) {
         transactionIdx = 0;
      }
      post.setTransactionConfirmation("no");
      postFacade.deleteCartPost(postIdx);
      
      Transactions transactions = new Transactions();
      //transactions.setTransactionsIdx(++transactionIdx);
      //transactions.setBuyerId(userSession.getUserInfo().getUserId());
      //transactions.setPostIdx(postIdx);
      //transactions.setStatus("no");
      
      transactionsFacade.deleteCartTransactions(transactions);
           
      model.addAttribute("cartList", cartList(buyerId));

      //return new ModelAndView("product_list");
      return new ModelAndView("cartList");
    }
    
    @ModelAttribute("cartList")
    public List<Post> cartList(String buyerId) {
    	return postFacade.cartList(buyerId);
    }
}