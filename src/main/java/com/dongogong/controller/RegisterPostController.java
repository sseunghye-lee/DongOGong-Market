package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.PostFacade;


@Controller
@RequestMapping("/apply/registerPost_product.do")
//상품 등록
public class RegisterPostController {
   
	@Autowired(required=false)
   private PostFacade postFacade;
	public void setPostFacade(PostFacade postFacade) {
		this.postFacade = postFacade;
	}
	
	@PostMapping
	public ModelAndView addPost(HttpServletRequest request,
			@RequestParam(value="photoUrl", required=false) String photoUrl,
			@RequestParam(value="title", required=false) String title,
			@RequestParam(value="price", required=false) int price,
			@RequestParam(value="content", required=false) String content,
			@RequestParam(value="borderType", required=false) String borderType,
			Model model
			) throws Exception {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
	 
		Post registerPost;
		int postIdx = 0;
		try {
			registerPost = postFacade.getPostListSize();
			postIdx = registerPost.getPostIdx();
		} catch(Exception e) {
			postIdx = 0;
		}
		
		Post post = new Post();
		post.setPostIdx(++postIdx);
		post.setTitle(title);
		post.setRegisterId(userSession.getUserInfo().getUserId());
		post.setBorderType(borderType);
		post.setContent(content);
		post.setTransactionConfirmation("no");
		post.setPhotoUrl(photoUrl);
		post.setPrice(price);
		
		postFacade.registerPost(post);
		
		model.addAttribute("getPostList", getPostList());
		
		return new ModelAndView("product_list");
	}
    
    @ModelAttribute("getPostList")
   public List<Post> getPostList() {
      return postFacade.getPostList();
   }
}