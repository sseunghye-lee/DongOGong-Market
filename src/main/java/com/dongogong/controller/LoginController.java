package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dongogong.domain.UserInfo;
import com.dongogong.service.UserFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/login.do")
public class LoginController {

	/*
	private UserFacade dongOGong;
	
	@Autowired
	public void setDongOGong(UserFacade dongOGong) {
		this.dongOGong = dongOGong;
	}
	
	
	@RequestMapping("/jsp/login.do")
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam("user_id") String user_id,
			@RequestParam("password") String password,
			@RequestParam(value="forwardAction", required=false) String forwardAction,
			Model model) throws Exception {
		
		UserInfo user = dongOGong.getUser(user_id, password);
		if (user == null) {
			return new ModelAndView("Error", "message", 
					"Invalid username or password.  Signon failed.");
		}
		else {
			UserSession userSession = new UserSession(user);
			
			
			if (forwardAction != null) 
				return new ModelAndView("redirect: " + forwardAction);
			else
				return new ModelAndView("index");
		}
	}
	*/
	
	//메인홈페이지(index)에서 login.jsp로 가는 controller
	@GetMapping
	public String login() {
		return "login";
	}
	
	//로그인 성공 시 메인홈페이지(or index)로 가능 controller
	//@PostMapping
	/*public String onSubmit(
			
			) {
		
		
	}
	*/
}
