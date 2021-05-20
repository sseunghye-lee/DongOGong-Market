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
	
}
