package com.dongogong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/catergoryInsert_product.do")
public class CategoryInsertController {
			
			//레코드 삽입
			@GetMapping 
			public String handleRequest(@RequestParam("productCategoryId")
			String productCategoryId, @RequestParam("name") String name) throws Exception {
				return "Category";
			}

	}
