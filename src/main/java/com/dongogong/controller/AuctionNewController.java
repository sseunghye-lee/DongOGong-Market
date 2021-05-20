package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping("/auctionNew.do")
public class AuctionNewController {
	
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	/*
	public String auction() {
		return "auction";
	}*/
	
	@PostMapping
	public String addAuction(/*HttpServletRequest request,
			@RequestParam(value="title", required=false) String title,
			@RequestParam(value="price", required=false) int price,
			@RequestParam(value="content", required=false) String content*/
			) throws Exception {
		//int price2 = Integer.valueOf(price);
		Post post = new Post();
		post.setPostIdx(4);
		post.setTitle("auction_goods");
		post.setRegisterId("som4");
		post.setBorderType("auction");
		post.setContent("good item");
		post.setTransactionConfirmation("no");
		post.setPhotoUrl("DongOGong.jpg");
		post.setPrice(5000);
		
		auctionFacade.insertAuction(post);
		
		return "auction";
	}
	
	/*
	@PostMapping
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String price = request.getParameter("price");
		int price2 = Integer.valueOf(price);
		
		Post post = new Post(3, "som3", request.getParameter("title"), "auction", price2, request.getParameter("content"),
			"no", "DongOGong.jpg");
		
		auctionFacade.insertAuction(post);
	}
	*/
	
	@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
}
