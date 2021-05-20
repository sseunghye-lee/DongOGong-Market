package com.dongogong.controller;

import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.Post;
import com.dongogong.service.ChatMessageFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ChatMessageController {

    @Autowired
    private ChatMessageFacade chatMessageFacade;

    @RequestMapping("/chat/room.do")
    public ModelAndView showChatList(@RequestParam("user_id") String userId, HttpServletRequest request, HttpServletResponse response) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        ModelAndView mav = new ModelAndView("showChatRoom");
        mav.addObject("chatRoomList", chatMessageFacade.getChatRoomList(userId));
        mav.addObject("userId", userSession.getUserInfo().getUserId());

        return mav;
    }

    @RequestMapping("/chat/message.do")
    public ModelAndView showChatMessage(@RequestParam("relation_idx") int relationIdx, @ModelAttribute("post") Post post,
                                        HttpServletRequest request, HttpServletResponse response) {
//        UserSession userSession =
//                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        ModelAndView mav = new ModelAndView("showChatMessage");
        mav.addObject("post", post);
        mav.addObject("chatMessageList", chatMessageFacade.getChatMessageList(relationIdx));
//        mav.addObject("userId", userSession.getUserId());

        return mav;
    }

    @RequestMapping("/send/room/message.do")
    public Map<String, Boolean> sendMessageOnChat(@RequestBody ChatMessage chatMessage, HttpServletRequest request, HttpServletResponse reponse) {
        chatMessageFacade.insertMessage(chatMessage);

        Map<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("result", true);

        return map;
    }

    //    chatRoomList 모델맵객체에 저장
    @RequestMapping("/send/post/message.do")
    public String sendMessageOnPost(@ModelAttribute("post") Post post, @ModelAttribute("ChatMessage") ChatMessage chatMessage, HttpServletRequest request, HttpServletResponse response) {

//        UserSession userSession =
//                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

//        boolean check = chatMessageFacade.isRelationExist(userSession.getUserId(), post.getRegisterId());

//        if (check) {
//            chatMessageFacade.insertRelation(userSession.getUserId(), post.getRegisterId());
//        }
//
//        int relationIdx = chatMessageFacade.findRelationIdx(userSession.getUserId(), post.getRegisterId());

//        chatMessage.setChatRelationIdx(relationIdx);

        chatMessageFacade.insertMessage(chatMessage);

        return "index";
    }
}
