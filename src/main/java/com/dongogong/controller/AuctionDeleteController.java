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
   public ModelAndView deleteAuction(HttpServletRequest request, Model model
         ) throws Exception {
      UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
    
      int postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());

      auctionFacade.auctionPriceDelete(postIdx);
      auctionFacade.transactionDelete(postIdx);
      auctionFacade.auctionDelete(postIdx);
      
      model.addAttribute("userSession", userSession);
      model.addAttribute("auctionList", auctionList());
      
      return new ModelAndView("auction");
   }
   
   public List<Post> auctionList() {
      return auctionFacade.auctionList();
   }
}