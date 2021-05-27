package com.dongogong.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

//user_id 이용해서 사용자 검색하는 controller
public class FindUserIdController {
	public ModelAndView findUser (
			@ModelAttribute("userId") UserSession userSession
			) throws Exception{
			String nickName = userSession.getUserInfo().getUserId();
			return new ModelAndView();
	}
}
