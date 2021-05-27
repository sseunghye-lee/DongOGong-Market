package com.dongogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dongogong.domain.Post;
import com.dongogong.service.PostFacade;
@Controller
@RequestMapping("/apply/select_product_myList.do")
public class SelectPostController {

	 @Autowired
	   private PostFacade postFacade;
	 @GetMapping
	    public String send() {
		 return "product_my_list";
	    }
	
}
