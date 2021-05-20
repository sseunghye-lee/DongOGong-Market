package com.dongogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice.do")
public class NoticeController {
	@GetMapping
	public String notice() {
		return "notice";
	}
}
