package com.dongogong.controller;

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
import com.dongogong.service.PostFacade;

   @Controller
   @RequestMapping(value="/productUpdate.do")
   //상품 수정
   public class ProductUpdateController {
      @Autowired(required=false)
         private PostFacade postFacade;
         public void setPostFacade(PostFacade postFacade) {
            this.postFacade = postFacade;
         }
         @PostMapping
         public ModelAndView updateProduct(HttpServletRequest request,
               @RequestParam(value="postIdx", required=false) String postIdx,
               @RequestParam(value="photoUrl", required=false) String photoUrl,
               @RequestParam(value="title", required=false) String title,
               @RequestParam(value="price", required=false) int price,
               @RequestParam(value="content", required=false) String content,
               @RequestParam(value="transactionConfirmation", required=false) String transactionConfirmation,
               Model model
               ) throws Exception {
            UserSession userSession =
                      (UserSession) WebUtils.getSessionAttribute(request, "userSession");
          
            int postId = Integer.valueOf(postIdx);
            Post post = postFacade.selectPost(postId);
            post.setPostIdx(postId);
            post.setTitle(title);
            post.setPrice(price);
            post.setRegisterId(userSession.getUserInfo().getUserId());
            post.setContent(content);
            post.setTransactionConfirmation(transactionConfirmation);
            if(!(photoUrl.equals("")) || photoUrl.length() != 0)
               post.setPhotoUrl(photoUrl);
         
            postFacade.updatePost(post);
            
            model.addAttribute("userSession", userSession);
            model.addAttribute("getPost", postFacade.getPost(userSession.getUserInfo().getUserId()));
         
            return new ModelAndView("product_my_list");
         }   
         
}