package com.dongogong.controller;

import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import com.dongogong.domain.Post;
import com.dongogong.domain.Relation;
import com.dongogong.repository.ChatMessageRepository;
import com.dongogong.service.ChatMessageFacade;
import com.dongogong.service.PostFacade;
import com.dongogong.service.TransactionsFacade;
import com.dongogong.service.UserInfoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ChatMessageController {

    @Autowired
    private ChatMessageFacade chatMessageFacade;
    @Autowired
    private UserInfoFacade userInfoFacade;
    @Autowired
    private PostFacade postFacade;
    @Autowired
    private TransactionsFacade transactionsFacade;

    @GetMapping("/chat/room/{userId}")
    public ModelAndView showChatList(@PathVariable("userId") String userId, HttpServletRequest request, HttpServletResponse response, Model model) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        if (userSession == null)
            return new ModelAndView("index");

        model.addAttribute("chatRoomList", chatMessageFacade.getChatRoomList(userId));
        model.addAttribute("userSession", userSession);
        model.addAttribute("userId", userSession.getUserInfo().getUserId());

        return new ModelAndView("showChatRoom");
    }

    @GetMapping("/chat/message/{chatRelationIdx}")
    public ModelAndView showChatMessage(@PathVariable("chatRelationIdx") int relationIdx,
                                        HttpServletRequest request, HttpServletResponse response, Model model) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        if (userSession == null)
            return new ModelAndView("index");

        List<ChatSummary> chatMessageList = chatMessageFacade.getChatMessageList(relationIdx);
        model.addAttribute("chatMessageList", chatMessageList);
        Post post = postFacade.getPostIdx(chatMessageList.get(chatMessageList.size() - 1).getPostIdx());
        model.addAttribute("post", post);

        if (post.getTransactionConfirmation().equals("DECIDE")) {
            model.addAttribute("buyer", transactionsFacade.checkBuyer(post.getPostIdx()));
        }

        model.addAttribute("userSession", userSession);
        model.addAttribute("chatRelationIdx", relationIdx);
        model.addAttribute("userId", userSession.getUserInfo().getUserId());

        if (chatMessageList.get(((ArrayList) chatMessageList).size() - 1).getReadYn().equals("N")) {
            if (chatMessageList.get(((ArrayList) chatMessageList).size() - 1).getReceiverId().equals(userSession.getUserInfo().getUserId())) {
                chatMessageFacade.updateReadYn(relationIdx, userSession.getUserInfo().getUserId());
            }
        }

        if (chatMessageList.get(0).getSenderId().equals(userSession.getUserInfo().getUserId())) {
            model.addAttribute("chatRoomName", userInfoFacade.getUserInfo(chatMessageList.get(0).getReceiverId()).getNickName());
            model.addAttribute("chatRoomId", userInfoFacade.getUserInfo(chatMessageList.get(0).getReceiverId()).getUserId());
        } else {
            model.addAttribute("chatRoomName", userInfoFacade.getUserInfo(chatMessageList.get(0).getSenderId()).getNickName());
            model.addAttribute("chatRoomId", userInfoFacade.getUserInfo(chatMessageList.get(0).getSenderId()).getUserId());
        }

        return new ModelAndView("showChatMessage");
    }

    @PostMapping("/send/room/message.do")
    @ResponseBody
    public Object sendMessageOnChat(@RequestBody ChatMessage chatMessage, HttpServletRequest request, HttpServletResponse reponse, Model model) {
        ChatMessage newChatMessage = chatMessageFacade.insertMessage(chatMessage);

        model.addAttribute("chatRelationIdx", chatMessage.getChatRelationIdx());
        model.addAttribute("", newChatMessage);
        List<ChatSummary> chatMessageList = chatMessageFacade.getChatMessageList(chatMessage.getChatRelationIdx());
        model.addAttribute("chatMessageList", chatMessageList);

        return newChatMessage;
    }

    //    chatRoomList 모델맵객체에 저장
    @GetMapping("/send/post/message/{postIdx}")
    public ModelAndView sendMessageOnPost(@PathVariable("postIdx") int postIdx, HttpServletRequest request, HttpServletResponse response, Model model) {

        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");


        Post post = postFacade.getPostIdx(postIdx);
        model.addAttribute("post", post);

        if (userSession == null)
            return new ModelAndView("index");

        if (post.getTransactionConfirmation().equals("WAIT")) {
            model.addAttribute("buyer", transactionsFacade.checkBuyer(post.getPostIdx()));
        }

        model.addAttribute("userSession", userSession);
        model.addAttribute("userId", userSession.getUserInfo().getUserId());

        Relation relation = chatMessageFacade.isRelationExist(userSession.getUserInfo().getUserId(), post.getRegisterId(), post.getPostIdx());

        if (relation == null) {
            int sequence = chatMessageFacade.insertRelation(userSession.getUserInfo().getUserId(), post.getRegisterId(), post.getPostIdx());
            model.addAttribute("chatRelationIdx", sequence);
            model.addAttribute("chatMessageList", null);
        } else {
            model.addAttribute("chatRelationIdx", relation.getRelationIdx());

            List<ChatSummary> chatMessageList = chatMessageFacade.getChatMessageList(relation.getRelationIdx());
            if (chatMessageList.size() == 0)
                model.addAttribute("chatMessageList", null);
            else {
                model.addAttribute("chatMessageList", chatMessageList);

                if (chatMessageList.size() != 0 && chatMessageList.get(((ArrayList) chatMessageList).size() - 1).getReadYn().equals("N")) {
                    if (chatMessageList.get(((ArrayList) chatMessageList).size() - 1).getReceiverId().equals(userSession.getUserInfo().getUserId())) {
                        chatMessageFacade.updateReadYn(relation.getRelationIdx(), userSession.getUserInfo().getUserId());
                    }
                }
            }
        }
        model.addAttribute("chatRoomName", userInfoFacade.getUserInfo(post.getRegisterId()).getNickName());
        model.addAttribute("chatRoomId", userInfoFacade.getUserInfo(post.getRegisterId()).getUserId());

        return new ModelAndView("showChatMessage");
    }
}