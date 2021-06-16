package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;


import com.dongogong.domain.Post;
import com.dongogong.service.PostFacade;

@Controller
@RequestMapping("/select_product_myList.do")
//상품 세부정보
public class SelectPostController {

    @Autowired(required = false)
    private PostFacade postFacade;

    public void setPostFacade(PostFacade postFacade) {
        this.postFacade = postFacade;
    }

    @GetMapping
    public ModelAndView selectPost2(HttpServletRequest request, Model model) throws Exception {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        String SpostIdx = request.getParameter("postIdx");
        int postIdx = Integer.valueOf(SpostIdx);


        model.addAttribute("userSession", userSession);
        model.addAttribute("selectPost", selectPostList(postIdx));
        model.addAttribute("userId", userSession.getUserInfo().getUserId());

        return new ModelAndView("product_detail");
    }

    @PostMapping
    public ModelAndView selectPost(HttpServletRequest request, Model model) throws Exception {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        String SpostIdx = request.getParameter("postIdx");
        int postIdx = Integer.valueOf(SpostIdx);


        model.addAttribute("userSession", userSession);
        model.addAttribute("selectPost", selectPostList(postIdx));
        if (userSession != null)
            model.addAttribute("userId", userSession.getUserInfo().getUserId());

        return new ModelAndView("product_detail");
    }

    public Post selectPostList(int postId) {
        return postFacade.selectPost(postId);
    }

}
