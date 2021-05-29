package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserInfoFacade;

@Controller
@RequestMapping("/myPage.do")
public class MyPageController {
   /*	
   @Value("myPage_change")
   private String formViewName;
   

    @Autowired
    private UserInfoFacade userInfo;
    public void setUserInfo(UserInfoFacade userInfo) {
       this.userInfo = userInfo;
    }
    */
	
	//index에서 mypage.jsp로 이동
	@GetMapping
	public ModelAndView service(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		return new ModelAndView("myPage");
	}
   
   /*
    @ModelAttribute("userInfoForm")
      public UserInfoForm formBackingObject(HttpServletRequest request) throws Exception {
         UserSession userSession = (UserSession) WebUtils.getSessionAttribute(request, "userSession");
         if (userSession != null) {   // edit an existing account
            return new UserInfoForm( 
                  userInfo.getUserInfo(userSession.getUserInfo().getUserId()) 
           );
         }
         else {   // create a new account
            return new UserInfoForm();
         }
    }
    
   @PostMapping
      public String onSubmit(
            HttpServletRequest request, HttpSession session,
            @ModelAttribute("userInfoForm") UserInfoForm userInfoForm,
            BindingResult result) throws Exception {
      
      try {
         if (!userInfoForm.isNewUserInfo()) {
            userInfo.updateUserInfo(userInfoForm.getUserInfo());
         }
      } catch (DataIntegrityViolationException ex) {
         
      }
      UserSession UserSession = new UserSession (
              userInfo.getUserInfo(userInfoForm.getUserInfo().getUserId()));

       session.setAttribute("UserSession", UserSession);
       return "index";
   }
   */         
}
