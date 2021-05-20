package com.dongogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services.do")
public class ServicesController {
	@GetMapping
	public String service() {
		return "services";
	}
}
