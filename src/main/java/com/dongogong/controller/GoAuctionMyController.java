package com.dongogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping("/auction_my.do")
public class GoAuctionMyController {
	
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@GetMapping
	public String auctionMy() {
		return "auction_my";
	}
	
	// registerId == userId (로그인한 사용자의 id를 사용해야 함)
	
	@ModelAttribute("myAuction")
	public Post myAuction() {
		int postidx = auctionFacade.myAuctionRegister("somsom");
		return auctionFacade.myAuction(1);
	}
	
}
