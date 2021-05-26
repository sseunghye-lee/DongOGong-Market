package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dongogong.domain.UserInfo;

@Controller
@RequestMapping("/myPage.do")
public class MyPageController {
	@GetMapping
	public String myPage() {
		return "myPage";
	}
}

