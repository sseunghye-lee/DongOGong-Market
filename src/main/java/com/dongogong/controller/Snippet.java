package com.dongogong.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

public class Snippet {
	public ModelAndView findUser (
			@ModelAttribute("nickName") UserSession userSession
			) throws Exception{
			String nickName = userSession.getUserInfo().getNickName();
			return new ModelAndView();
	}
}

