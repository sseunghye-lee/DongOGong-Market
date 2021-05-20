package com.dongogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"category", "getCategory"})

public class GetCategoryController {
	
		
		@Autowired
		public void setCategory() {
			
		}
		
		//카테고리 이름 출력
		@RequestMapping("/market/getCategory")
		public String handleRequest(@RequestParam("productCategoryId")
		String productCategoryId) throws Exception {
			return "Category";
		}

}