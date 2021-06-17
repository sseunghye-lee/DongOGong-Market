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
@RequestMapping("/auctionSend.do")
public class AuctionSendController {

   @Autowired(required=false)
   private AuctionFacade auctionFacade;
   public void setAuctionFacade(AuctionFacade auctionFacade) {
      this.auctionFacade = auctionFacade;
   }
   
   @PostMapping
   public ModelAndView auction(HttpServletRequest request, Model model
         ) {
      UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
      String SpostIdx = request.getParameter("postIdx");
      String Sprice = request.getParameter("price");
      int postIdx = Integer.valueOf(SpostIdx);
      int price = Integer.valueOf(Sprice);
      
      AuctionPrice auction;
      int auctionPriceIdx = 0;
      try {
         auction = auctionFacade.auctionPriceSize();
         auctionPriceIdx = auction.getAuctionPriceId();
      } catch(Exception e) {
         auctionPriceIdx = 0;
      }
       
      AuctionPrice auctionPrice = new AuctionPrice();
      auctionPrice.setAuctionPriceId(++auctionPriceIdx);
      auctionPrice.setBuyerId(userSession.getUserInfo().getUserId());
      auctionPrice.setPostIdx(postIdx);
      auctionPrice.setPrice(price + 5000);
      auctionPrice.setStatus("going");
      auctionFacade.attendAuction(auctionPrice);
      model.addAttribute("userSession", userSession);
      model.addAttribute("auctionList", auctionList());
      model.addAttribute("myAuction", myAuction(request));
      return new ModelAndView("auction");
   }
   
   public List<Post> auctionList() {
      return auctionFacade.auctionList();
   }
   
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