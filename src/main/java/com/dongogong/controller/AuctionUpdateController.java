package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping(value="/auctionUpdate.do")
public class AuctionUpdateController {

	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@PostMapping
	public String addAuction(HttpServletRequest request,
			@RequestParam(value="photoUrl", required=false) String photoUrl,
			@RequestParam(value="title", required=false) String title,
			@RequestParam(value="price", required=false) int price,
			@RequestParam(value="content", required=false) String content
			) throws Exception {
		//int price2 = Integer.valueOf(price);
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
	 
		int postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());
		//int intPrice = Integer.valueOf(price);
		Post post = auctionFacade.myAuction(postIdx);
		post.setPostIdx(postIdx);
		post.setTitle(title);
		post.setRegisterId(userSession.getUserInfo().getUserId());
		post.setBorderType("auction");
		post.setContent(content);
		post.setTransactionConfirmation("no");
		post.setPhotoUrl(photoUrl);
		post.setPrice(price);
		
		auctionFacade.updateAuction(post);
		
		return "auction";
	}
	
	@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
}
