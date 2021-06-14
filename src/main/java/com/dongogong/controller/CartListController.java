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

// service.jsp에서 My CART 클릭시 이동
@Controller
@RequestMapping("/cartList.do")
public class CartListController {
		
    @Autowired(required=false)
    private PostFacade postFacade;
    public void setPostFacade(PostFacade postFacade) {
       this.postFacade = postFacade;
    }
    
    @GetMapping
	public ModelAndView cartList(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		
		model.addAttribute("userSession", userSession);
    	model.addAttribute("cartList", cartList(userSession.getUserInfo().getUserId()));
    	
    	return new ModelAndView("cartList");
	}
    
    @ModelAttribute("cartList")
    public List<Post> cartList(String buyerId) {
    	return postFacade.cartList(buyerId);
    }
}
