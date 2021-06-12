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

import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;
import com.dongogong.service.PostFacade;
import com.dongogong.service.TransactionsFacade;

//product_list.jsp에서 장바구니 버튼 클릭 시 해당 상품의 거래 상태 변경. 
//장바구니는 POST 테이블 이용.
@Controller
@RequestMapping("/cartSend.do")
public class CartSendController {

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
   
   @PostMapping
   public ModelAndView cart(HttpServletRequest request, Model model) {
      UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
      
      //product_list.jsp에서 값 받아옴
      String SPostIdx = request.getParameter("postIdx");
      String SPrice = request.getParameter("price");
      String title = request.getParameter("title");
      int postIdx = Integer.valueOf(SPostIdx);
      int price = Integer.valueOf(SPrice);
      
      String sellerId = request.getParameter("sellerId");
      
      Post post = postFacade.getPostIdx(postIdx);
       
      Transactions transIdx;
      int transactionIdx = 0;
      
      
      try {
         transIdx = transactionsFacade.transactionSize();
         transactionIdx = transIdx.getTransactionsIdx();
      } catch(Exception e) {
         transactionIdx = 0;
      }
      post.setTransactionConfirmation("WAIT");
      postFacade.updatePost(postIdx);
      
      System.out.println(postIdx);
      
      Transactions transactions = new Transactions();
      transactions.setTransactionsIdx(++transactionIdx);
      transactions.setBuyerId(userSession.getUserInfo().getUserId());;
      transactions.setPostIdx(postIdx);
      transactions.setSellerId(sellerId);
      transactions.setStatus("WAIT");
      
      transactionsFacade.insertCartTransactions(transactions);
      
      //post.setPostIdx(postIdx);
      //post.setRegisterId(userSession.getUserInfo().getUserId());
      //post.setTitle(title);

      model.addAttribute("getPostList", getPostList());
      
      return new ModelAndView("product_list");   
   }
   
    @ModelAttribute("getPostList")
      public List<Post> getPostList() {
         return postFacade.getPostList();
      }
}