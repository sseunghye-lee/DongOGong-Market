package com.dongogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apply/product.do")
public class ProductController {
    @GetMapping
    public String applyProduct() {
        return "applyProduct";
    }
}