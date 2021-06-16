package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserInfoFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@SessionAttributes("userSession")
public class LoginController {
   
   private UserInfoFacade userInfo;
   @Autowired
   public void setUserInfo(UserInfoFacade userInfo) {
      this.userInfo = userInfo;
   }
      
   //로그인 성공 시 메인홈페이지(or index)로 가능 controller
   @RequestMapping("/login.do")
   public ModelAndView handleRequest(HttpServletRequest request,
         @RequestParam("userId") String userId,
         @RequestParam("password") String password,
         @RequestParam(value="forwardAction", required=false) String forwardAction,
         Model model) throws Exception {
      
      UserInfo user = userInfo.getUserInfo(userId, password);     
      if (user == null) {
    	  return new ModelAndView("Error", "message", 
					"Invalid username or password. Signon failed.");
      }
      else {
         UserSession userSession = new UserSession(user);
         model.addAttribute("userSession", userSession);
         if (forwardAction != null) 
            return new ModelAndView("redirect: " + forwardAction);
         else
            return new ModelAndView("index");
      }
   }
}