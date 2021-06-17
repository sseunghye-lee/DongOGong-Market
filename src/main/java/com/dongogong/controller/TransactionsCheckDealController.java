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
import com.dongogong.service.PostFacade;

//myPage.jsp에서 거래내역확인 클릭 시 이동
@Controller
@RequestMapping(value="/checkDeal.do")
public class TransactionsCheckDealController {	//거래 내역 확인
	
    @Autowired(required=false)
    private PostFacade postFacade;
    public void setPostFacade(PostFacade postFacade) {
       this.postFacade = postFacade;
    }
  
	@GetMapping
	public ModelAndView transactionsCheckList(HttpServletRequest request, Model model) {	
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		
		model.addAttribute("userSession", userSession);
    	model.addAttribute("transactionsCheckList", transactionsCheckList(userSession.getUserInfo().getUserId()));
    	
		return new ModelAndView("checkDeal");
	}

	@ModelAttribute("transactionsCheckList")
	public List<Post> transactionsCheckList(String buyerId) {
		return postFacade.transactionsCheckList(buyerId);
	}
}
