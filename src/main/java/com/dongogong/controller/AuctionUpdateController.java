package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.Post;
import com.dongogong.service.AuctionFacade;

@Controller
@RequestMapping(value="/auctionUpdate.do")
public class AuctionUpdateController {

   @Autowired(required=false)
   private AuctionFacade auctionFacade;
   public void setAuctionFacade(AuctionFacade auctionFacade) {
      this.auctionFacade = auctionFacade;
   }
   
   @PostMapping
   public ModelAndView addAuction(HttpServletRequest request,
         @RequestParam(value="photoUrl") String photoUrl,
         @RequestParam(value="title", required=false) String title,
         @RequestParam(value="price", required=false) int price,
         @RequestParam(value="content", required=false) String content,
         Model model
         ) throws Exception {
      UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
    
      int postIdx = auctionFacade.myAuctionRegister(userSession.getUserInfo().getUserId());
      Post post = auctionFacade.myAuction(postIdx);
      post.setPostIdx(postIdx);
      post.setTitle(title);
      post.setRegisterId(userSession.getUserInfo().getUserId());
      post.setBorderType("auction");
      post.setContent(content);
      post.setTransactionConfirmation("no");
      if(!(photoUrl.equals("")) || photoUrl.length() != 0)
         post.setPhotoUrl(photoUrl);
      
      post.setPrice(price);
      
      auctionFacade.updateAuction(post);
      
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