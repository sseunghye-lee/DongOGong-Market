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
	
	//index에서 mypage.jsp로 이동
	@GetMapping
	public ModelAndView service(HttpServletRequest request, Model model) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		model.addAttribute("userSession", userSession);
		return new ModelAndView("myPage");
	}
}
