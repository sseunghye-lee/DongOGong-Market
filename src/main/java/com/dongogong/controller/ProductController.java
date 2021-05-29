package com.dongogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/apply/product.do")
public class ProductController {
    @GetMapping
    public ModelAndView applyProduct(HttpServletRequest request, HttpServletResponse response) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        ModelAndView mav = new ModelAndView("applyProduct");
        mav.addObject("userSession", userSession);
        return mav;
    }
}