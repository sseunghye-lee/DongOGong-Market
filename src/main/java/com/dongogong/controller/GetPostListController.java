package com.dongogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes({"post", "getPostList"})
public class GetPostListController {
		
		@Autowired
		public void setPost() {
			
		}
		
		//전체 상품 가져오기
		@RequestMapping("/market/getPostList")
		public String handleRequest(@RequestParam("postIdx")
		String postIdx) throws Exception {
			return "Post";
		}

	}
