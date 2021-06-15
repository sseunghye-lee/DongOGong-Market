package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserInfoFacade;
import com.dongogong.service.UserInfoFormValidator;

//회원수정 컨트롤러
@Controller
@RequestMapping("/myPage_change.do")
public class UpdateUserController {

	@Value("myPage_change")
	private String formViewName;
	
	@Autowired(required=false)
	private UserInfoFacade userInfoFacade;
	public void setUserInfo(UserInfoFacade userInfoFacade) {
		this.userInfoFacade = userInfoFacade;
	}

	   
	@Autowired
	private UserInfoFormValidator validator;
	public void setValidator(UserInfoFormValidator validator) {
		this.validator = validator;
	}
    
    //myPage.jsp에서 myPage_change.jsp로
	@GetMapping
    public String showForm(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		model.addAttribute("myInfo", myInfo(userSession.getUserInfo().getUserId()));
		return formViewName;
	}
	
	
	@PostMapping
	public ModelAndView addUser(HttpServletRequest request,
			@RequestParam(value="name", required=false) String name,
			//@RequestParam(value="nickName", required=false) String nickName,
			@RequestParam(value="phone", required=false) String phone,
			@RequestParam(value="password", required=false) String password,
			Model model
			) throws Exception {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		
		UserInfo userInfo = userInfoFacade.getUserInfo(userSession.getUserInfo().getUserId());
		userInfo.setName(name);
		//userInfo.setName(nickName);
		userInfo.setPhone(phone);
		userInfo.setPassword(password);
		
		userInfoFacade.updateUserInfo(userInfo);
		
		return new ModelAndView("myPage");
	} 
	
	@ModelAttribute("myInfo")
	public UserInfo myInfo(String userId) {
		return userInfoFacade.myInfo(userId);
	}
}
