package com.dongogong.controller;

import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import com.dongogong.domain.Post;
import com.dongogong.domain.Transactions;
import com.dongogong.service.PostFacade;
import com.dongogong.service.TransactionsFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
//채팅 완료 버튼 : 컨트롤러에서 상태변경 메소드 실행 -> 상품게시판으로 넘어오기 (이때 거래확정 상태를 대기에서 완료로 바꾸는 메소드 이용)
public class ChatButtonController {

    @Autowired
    private TransactionsFacade transactionsFacade;
    @Autowired
    private PostFacade postFacade;

    @PostMapping("/complete/product.do")
    @ResponseBody
    public Object completeProductOnChat(@RequestBody Transactions transactions, HttpServletRequest request, HttpServletResponse reponse) {
        UserSession userSession =
                (UserSession) WebUtils.getSessionAttribute(request, "userSession");

        if (userSession == null)
            return new ModelAndView("index");

        Post post = postFacade.getPostIdx(transactions.getPostIdx());

        postFacade.updatePostOnChat(post);

        transactionsFacade.insertTransactionsOnChat(transactions);

        return reponse.getStatus();
    }
}
