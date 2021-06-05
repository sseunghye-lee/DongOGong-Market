package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserInfoFacade;

//회원삭제 컨트롤러
@Controller
@RequestMapping("/deleteUser.do")
public class DeleteUserController {

   @Autowired(required=false)
   private UserInfoFacade userInfoFacade;
   @Autowired
   public void setUserInfo(UserInfoFacade userInfoFacade) {
      this.userInfoFacade = userInfoFacade;
   }
   /*
   @GetMapping
   public String deleteUserInfoView() throws Exception {
	   return "deleteUserInfoView";
   }*/
   
   @GetMapping
   public String deleteUserInfo(HttpSession session, RedirectAttributes rttr, HttpServletRequest request, Model model) throws Exception {
	   //세션 가져옴
	   UserSession userSession =
               (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);

	   //UserInfo user = (UserInfo) session.getAttribute("userSession");
	   UserInfo userInfo = userSession.getUserInfo();
	   
	   userInfoFacade.deleteChatInfo(userInfo.getUserId());
	   userInfoFacade.deleteAuctionInfo(userInfo.getUserId());
	   userInfoFacade.deletePostInfo(userInfo.getUserId());
	   userInfoFacade.deleteRelation(userInfo.getUserId());
	   userInfoFacade.deleteTransaction(userInfo.getUserId());
	   userInfoFacade.deleteUserInfo(userInfo.getUserId(), userInfo.getPassword());
	   session.invalidate();
	   return "index";
   }
}