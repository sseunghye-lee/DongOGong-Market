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
@RequestMapping("/apply/registerPost_product.do")
public class RegisterPostController {
	
	@Autowired
	private PostFacade postFacade;
	
    @GetMapping
    public String registerPost() {

        return "product_list";
    }
    
    @ModelAttribute("getPostList")
	public List<Post> getPostList() {
		return postFacade.getPostList();
	}
}