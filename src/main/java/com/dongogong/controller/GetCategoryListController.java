package com.dongogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"category", "getCategoryList"})
public class GetCategoryListController {

	
	@Autowired
	public void setCategory() {
		
	}
	
	//모든 카테고리 출력
	@RequestMapping("/market/getCategoryList")
	public String handleRequest(@RequestParam("productCategoryId")
	String productCategoryId) throws Exception {
		return "Category";
	}

}
