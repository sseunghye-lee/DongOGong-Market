package com.dongogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"post", "selectPost"})
public class SelectPostController {

	@Autowired
	public void setPost() {
		
	}
	
	//상품 눌렀을때 정보보기
	@RequestMapping("/market/selectPost")
	public String handleRequest(@RequestParam("postIdx")
	String postIdx) throws Exception {
		return "Post";
	}

}
