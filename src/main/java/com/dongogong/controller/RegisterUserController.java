package com.dongogong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserFacade;
import com.dongogong.service.UserInfoService;

//회원가입 컨트롤러
@Controller
@RequestMapping("/join.do")
public class RegisterUserController {

/*
   @Autowired
   private UserFacade userInfo;
   public void setUserService(UserFacade userInfo) {
      this.userInfo = userInfo;
   }

   @ModelAttribute("register")
   public UserInfoForm formBackingObject(HttpServletRequest request)
         throws Exception {
      UserSession userSession =
         (UserSession) WebUtils.getSessionAttribute(request, "userSession");
      if (userSession != null) {   // edit an existing account
         return new UserInfoForm(
               userInfo.getUserInfo(userSession.getUserInfo().getUser_id()));
      }
      else {   // create a new account
         return new UserInfoForm();
      }
   }

   @GetMapping
   public String join() {
      return "join";
   }


   @PostMapping
   public String onSubmit(
         HttpServletRequest request, HttpSession session,
         @ModelAttribute("accountForm") UserInfoForm userInfoForm,
         BindingResult result) throws Exception {

      if (result.hasErrors()) return "join";
      try {
         if (userInfoForm.isNewUserInfo()) {
            userInfo.insertUser(userInfoForm.getUserInfo());
         }
      } catch (DataIntegrityViolationException ex) {
         result.rejectValue("account.username", "USER_ID_ALREADY_EXISTS",
               "User ID already exists: choose a different ID.");
         return "join";
      }

      UserSession userSission = new UserSession (
            userInfo.getUserInfo(userInfoForm.getUserInfo().getUser_id()));

      session.setAttribute("userSission", userSission);
      return "index";
   }*/

	@GetMapping
	public String join() {
		return "join";
	}
}