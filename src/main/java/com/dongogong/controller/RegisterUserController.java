package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserInfoFacade;
import com.dongogong.service.UserInfoFormValidator;

//회원가입 컨트롤러
@Controller
@RequestMapping("/join.do")
public class RegisterUserController {
	
	
   @Value("join")
   private String formViewName;
   @Value("index")
   private String successViewName;
   
   @Autowired
   private UserInfoFacade userInfoFacade;
   public void setUserInfo(UserInfoFacade userInfoFacade) {
      this.userInfoFacade = userInfoFacade;
   }

   @Autowired
   private UserInfoFormValidator validator;
   public void setValidator(UserInfoFormValidator validator) {
      this.validator = validator;
   }
   
   @ModelAttribute("userInfoForm")
   public UserInfoForm formBackingObject(HttpServletRequest request) throws Exception {
      UserSession userSession = (UserSession) WebUtils.getSessionAttribute(request, "userSession");
      if (userSession == null) {  
    	  return new UserInfoForm();
      }
	return null;
   }


   //login.jsp에서 회원가입 클릭시 join.jsp로 넘어감
   @GetMapping
   public String showForm() {
      return formViewName;
   }
   

   @PostMapping
   public String onSubmit(
         HttpServletRequest request, HttpSession session,
         @ModelAttribute("userInfoForm") UserInfoForm userInfoForm,
         UserInfo userInfo,
         BindingResult result) throws Exception {

     //validator.validate(userInfoForm, result);
     
      if (result.hasErrors()) 
         return "index";
     
      /*
       try {
         if (userInfoForm.isNewUserInfo() && idChk(userInfo) == 0) {
        	 userInfoFacade.insertUserInfo(userInfoForm.getUserInfo());
         } 
         else if (idChk(userInfo) == 1) {
        	 return "index";
         }
      } catch (DataIntegrityViolationException ex) {
         result.rejectValue("userInfo.userId", "USER_ID_ALREADY_EXISTS",
               "User ID already exists: choose a different ID.");
         return formViewName;
      }
	
      return successViewName;
       */
      
      
      try {
         if (userInfoForm.isNewUserInfo()) {
        	 userInfoFacade.insertUserInfo(userInfoForm.getUserInfo());
         } 
      } catch (DataIntegrityViolationException ex) {
         result.rejectValue("userInfo.userId", "USER_ID_ALREADY_EXISTS",
               "User ID already exists: choose a different ID.");
         return formViewName;
      }
	
      return successViewName;
   }
   
   /*
   //아이디 중복체크
   @ResponseBody
   @RequestMapping(value="/idChk.do", method=RequestMethod.POST)
   public int idChk(UserInfo userInfo) throws Exception {
	   int result = userInfoFacade.idChk(userInfo);
	   return result;
   }*/
}