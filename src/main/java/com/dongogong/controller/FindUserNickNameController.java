package com.dongogong.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

//닉네임 이용해서 사용자 검색하는 controller
public class FindUserNickNameController {

	public ModelAndView findUser (
			@ModelAttribute("nickName") UserSession userSession
			) throws Exception{
			String nickName = userSession.getUserInfo().getNickName();
			return new ModelAndView();
	}
}
