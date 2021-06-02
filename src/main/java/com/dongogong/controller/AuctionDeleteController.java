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
@RequestMapping(value="/auctionDelete.do")
public class AuctionDeleteController {
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@PostMapping
	public String deleteAuction(HttpServletRequest request
			) throws Exception {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
	 
		int postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());
		//String SpostIdx = request.getParameter("postIdx");
		//int postIdx = Integer.valueOf(SpostIdx);
		Post post = auctionFacade.myAuction(postIdx);	
		//auctionFacade.updateAuction(post);
		auctionFacade.auctionPriceDelete(postIdx);
		auctionFacade.auctionDelete(postIdx);
		
		return "auction";
	}
	
	@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
}
