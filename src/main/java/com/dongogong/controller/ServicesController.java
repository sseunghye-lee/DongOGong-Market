package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

@Controller
@RequestMapping("/services.do")
public class ServicesController {
	@GetMapping
	public String service(HttpServletRequest request) {
		UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");
		return "services";
	}
}
