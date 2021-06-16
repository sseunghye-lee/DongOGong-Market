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
@RequestMapping("/jsp/category_product.do")
//카테고리별 상품 출력
public class GetCategoryController {
	
		
	@Autowired(required=false)
	   private PostFacade postFacade;
		public void setPostFacade(PostFacade postFacade) {
			this.postFacade = postFacade;
		}
	
	  
	
	   @GetMapping
		public ModelAndView categoryPost(HttpServletRequest request, Model model
				) throws Exception {
			UserSession userSession =
	                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
			model.addAttribute("userSession", userSession);

			String borderType = request.getParameter("borderType");
			
			model.addAttribute("getPostList", postFacade.getCategory(borderType));
			
			return new ModelAndView("product_list");
		}
	    
	    @ModelAttribute("getPostList")
	   public List<Post> getPostList() {
	      return postFacade.getPostList();
	   }
	
	
	

}