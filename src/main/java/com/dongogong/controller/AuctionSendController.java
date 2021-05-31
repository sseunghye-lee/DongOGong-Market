package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping(value="/auctionSend.do")
public class AuctionSendController {

	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}
	
	@PostMapping
	public String auction(HttpServletRequest request
			//@RequestParam(value="postIdx", required=false) int postIdx,
			//@RequestParam(value="price", required=false) String price
			) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		AuctionPrice auctionPrice = new AuctionPrice();
		auctionPrice.setAuctionPriceId(1);
		auctionPrice.setBuyerId(userSession.getUserInfo().getUserId());
		auctionPrice.setPostIdx(1);
		//int intPrice = Integer.valueOf(price);
		//auctionPrice.setPrice(intPrice + 5000);
		auctionPrice.setPrice(6000);
		auctionPrice.setStatus("going");
		auctionFacade.attendAuction(auctionPrice);
		return "auction";
	}
	
	@ModelAttribute("auctionList")
	public List<Post> auctionList() {
		return auctionFacade.auctionList();
	}
	
}
