package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dongogong.domain.UserInfo;

//회원수정 컨트롤러
@Controller
public class UpdateUserController {
/*
	@RequestMapping("/jsp/updateUser.do")
	public ModelAndView handleRequest(HttpServletRequest request, @ModelAttribute("user") UserInfo user) throws Exception {
	public String updateGET(HttpSession session, Model model) throws Exception {
	
		
	}
*/	

	@RequestMapping(value="/updateUser.do", method=RequestMethod.GET) 
	public String updateGet(HttpSession session, Model model) throws Exception {
		return "update";
	}
}
