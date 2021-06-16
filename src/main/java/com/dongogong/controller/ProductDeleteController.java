package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.PostFacade;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping(value="/productDelete.do")
//상품 삭제
public class ProductDeleteController {
	@Autowired(required=false)
	   private PostFacade postFacade;
		public void setPostFacade(PostFacade postFacade) {
			this.postFacade = postFacade;
		}
		@PostMapping
		public ModelAndView deleteProduct(HttpServletRequest request,
				@RequestParam(value="postIdx", required=false) String postIdx,
				Model model
				) throws Exception {
			UserSession userSession =
	                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		 
			int postId = Integer.valueOf(postIdx);
			
			postFacade.chatDelete(postId);
			postFacade.relationDelete(postId);
			postFacade.transactionDelete(postId);
			
			postFacade.postDelete(postId);
			
			model.addAttribute("getPost", postFacade.getPost(userSession.getUserInfo().getUserId()));
		
			return new ModelAndView("product_my_list");
		}	
}
