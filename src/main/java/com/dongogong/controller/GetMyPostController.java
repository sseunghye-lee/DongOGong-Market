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
import com.dongogong.service.PostFacade;
@Controller
@RequestMapping("/apply/MyPost_product.do")
public class GetMyPostController {		
	@Autowired(required=false)
	   private PostFacade postFacade;
		public void setPostFacade(PostFacade postFacade) {
			this.postFacade = postFacade;
		}
		 
		 @PostMapping
		 public String myPost() {
		       return "product_my_list";
		    }
		 //back 버튼
		 @GetMapping
		 public String myPostList() {
		       return "product_my_list";
		    }
		
		 @ModelAttribute("getPost")
			public List<Post> getPost(HttpServletRequest request) {
				 UserSession userSession =
			                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
				
			return postFacade.getPost(userSession.getUserInfo().getUserId());
			}
		 
		}


