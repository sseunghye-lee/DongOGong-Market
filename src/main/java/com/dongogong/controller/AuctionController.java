package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping("/auction.do")
public class AuctionController {
	
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@GetMapping
	public String auction() {
		return "auction";
	}
	
	
	@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
	@ModelAttribute("myAuction")
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
