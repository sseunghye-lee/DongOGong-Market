package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping(value="/auction_progress.do")
public class AuctionProgressController {
	
	@Autowired(required=false)
	private AuctionFacade auctionFacade;
	public void setAuctionFacade(AuctionFacade auctionFacade) {
		this.auctionFacade = auctionFacade;
	}

	@PostMapping
	public ModelAndView auctionProgress(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		String SpostIdx = request.getParameter("postIdx");
		int postIdx = Integer.valueOf(SpostIdx);
		Post post = auctionFacade.auctionRegisterId(postIdx);
		AuctionPrice auctionPrice = auctionFacade.auctionMax(postIdx);
		
		model.addAttribute("userSession", userSession);
		model.addAttribute("auctionProgressList", auctionProgressList(postIdx));
		model.addAttribute("userId", userSession.getUserInfo().getUserId());
		model.addAttribute("postRegister", post);
		model.addAttribute("maxPrice", auctionPrice);
		return new ModelAndView("auctionProgress_list");
	}
	
	public List<AuctionPrice> auctionProgressList(int postIdx) {
		return auctionFacade.auctionProgress(postIdx);
	}
}
