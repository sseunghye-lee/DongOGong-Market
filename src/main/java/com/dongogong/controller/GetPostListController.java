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
@Controller
@RequestMapping("/apply/PostList_product.do")
//전체상품 가져오는 컨트롤러
public class GetPostListController {
		
	@Autowired(required=false)
	   private PostFacade postFacade;
		public void setPostFacade(PostFacade postFacade) {
			this.postFacade = postFacade;
		}
		/*
		 @GetMapping
		    public String registerPost() {
		        return "product_list";
		    }
		*/
		@GetMapping
		public ModelAndView postList(HttpServletRequest request, Model model) {
			UserSession userSession =
					(UserSession) WebUtils.getSessionAttribute(request, "userSession");
			model.addAttribute("userSession", userSession);
			model.addAttribute("getPostList", getPostList());
			return new ModelAndView("product_list");
		}
		
		//전체 상품 가져오기
		@ModelAttribute("getPostList")
		public List<Post> getPostList() {
			return postFacade.getPostList();
		}
		

	}
