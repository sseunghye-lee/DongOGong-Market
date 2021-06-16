package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
   /*
   @GetMapping
   public String auction() {
      return "auction";
   }*/

	@GetMapping
	public ModelAndView auction(HttpServletRequest request, Model model) {
		UserSession userSession =
				(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		model.addAttribute("auctionList", auctionList());
		return new ModelAndView("auction");
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