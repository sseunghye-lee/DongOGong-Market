package com.dongogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes({"post", "getPost"})
public class GetMyPostController {		
			@Autowired
			public void setPost() {
				
			}
			
			//내 상품 가져오는 컨트롤러
			@RequestMapping("/market/getPost")
			public String handleRequest(@RequestParam("postIdx")
			String postIdx) throws Exception {
				return "Post";
			}

		}


