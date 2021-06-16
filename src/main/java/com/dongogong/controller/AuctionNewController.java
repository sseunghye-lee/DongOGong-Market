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
import com.dongogong.service.AuctionFacade;
import com.dongogong.service.PostFacade;

@Controller
@RequestMapping("/auctionNew.do")
public class AuctionNewController {
	
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@Autowired(required=false)
	private PostFacade postFacade;
	public void setPostFacade(PostFacade postFacade) {
		this.postFacade = postFacade;
	}
	
	@PostMapping
	public ModelAndView addAuction(HttpServletRequest request,
			@RequestParam(value="photoUrl", required=false) String photoUrl,
			@RequestParam(value="title", required=false) String title,
			@RequestParam(value="price", required=false) int price,
			@RequestParam(value="content", required=false) String content,
			Model model
			) throws Exception {
		//int price2 = Integer.valueOf(price);
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		
		Post auctionPost;
		int postIdx = 0;
		try {
			auctionPost = postFacade.getPostListSize();
			postIdx = auctionPost.getPostIdx();
		} catch(Exception e) {
			postIdx = 0;
		}
		
		Post post = new Post();
		post.setPostIdx(++postIdx);
		post.setTitle(title);
		post.setRegisterId(userSession.getUserInfo().getUserId());
		post.setBorderType("auction");
		post.setContent(content);
		post.setTransactionConfirmation("no");
		post.setPhotoUrl(photoUrl);
		post.setPrice(price);
		
		auctionFacade.insertAuction(post);
		
		model.addAttribute("userSession", userSession);
		model.addAttribute("auctionList", auctionList());
		model.addAttribute("myAuction", myAuction(request));
		
		return new ModelAndView("auction");
	}
	
	//@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
	//@ModelAttribute("myAuction")
	public Post myAuction(HttpServletRequest request) {
		 UserSession userSession =
	                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		 int postIdx = 0;
		 try{
			 postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());
		 } catch(Exception e) {
			 postIdx = 0;
			 return auctionFacade.myAuction(postIdx);
		 }
		return auctionFacade.myAuction(postIdx);
	}
	
}
