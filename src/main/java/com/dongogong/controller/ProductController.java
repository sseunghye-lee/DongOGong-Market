package com.dongogong.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.PostFacade;

@Controller
@RequestMapping("/apply/product.do")
public class ProductController {
	
	@Autowired(required=false)
	   private PostFacade postFacade;
		public void setPostFacade(PostFacade postFacade) {
			this.postFacade = postFacade;
		}
	
	 @ModelAttribute("getPostList")
	   public List<Post> getPostList() {
	      return postFacade.getPostList();
	   }
	
    @GetMapping
    public ModelAndView applyProduct(HttpServletRequest request, HttpServletResponse response) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        if(userSession == null)
            return new ModelAndView("loginForm");
        
        ModelAndView mav = new ModelAndView("applyProduct");
        mav.addObject("userSession", userSession);
        return mav;
    }
}