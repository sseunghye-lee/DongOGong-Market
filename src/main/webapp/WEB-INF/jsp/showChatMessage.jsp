<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTop.jsp" %>
<body>
<!-- ======= Header ======= -->
<%@ include file="IncludeQuickHeader.jsp" %>
<header class="alt-header">
    <div class="alt-header__column">
        <a th:href="${"/chat/room.do"+userId}">
            <i class="fas fa-angle-left fa-3x"></i>
        </a>
    </div>
    <div class="alt-header__column">
        <h1 class="alt-header__title__message" th:if="${userId == chatMessageList.get(0).getSenderId()}" th:text="${chatMessageList.get(0).getReceiverName()}"></h1>
        <h1 class="alt-header__title__message" th:if="${userId == chatMessageList.get(0).getReceiverId()}" th:text="${chatMessageList.get(0).getSenderName()}"></h1>
    </div>
    <div class="alt-header__column">
        <span><i class="fas fa-search fa-lg"></i></span>
        <span><i class="fas fa-bars fa-lg"></i></span>
    </div>
</header>

<main class="main-screen main-chat">
    <div class="chat__timestamp" th:text="${createDataTime}">
    </div>
    <div th:each="message, index : ${chatMessageList}">
        <div class="message-row leftMessage" th:if="${message.getReceiverId() == userId}">
            <img th:src="${message.getSenderProfileImg()}" />
            <div class="message-row__content">
                <span class="message__author" th:text="${message.getSenderName()}"></span>
                <div class="message__info">
                    <span class="message__bubble" th:text="${message.getChatMessage()}"></span>
                    <span class="message__time" th:datetime="${message.getModifiedDateTime()}"></span>
                </div>
            </div>
        </div>
        <div class="message-row rightMessage" th:if="${message.getSenderId() == userId}">
            <div class="message-row message-row--own">
                <div class="message-row__content">
                    <div class="message__info">
                        <span class="message__bubble" th:text="${message.getChatMessage()}"></span>
                        <span class="message__time" th:datetime="${message.getModifiedDateTime()}"></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>

<form class="reply">
    <div class="reply__column">
        <i class="far fa-plus-square fa-lg"></i>
    </div>
    <div class="reply__column">
        <input type="text" placeholder="Write a message..." id="message" onkeyup="send()" autofocus/>
        <i class="far fa-smile-wink fa-lg"></i>
        <button id = "send_message_btn" onclick="send()">
            <i class="fas fa-arrow-up"></i>
        </button>
    </div>
</form>

<script
        src="https://kit.fontawesome.com/6478f529f2.js"
        crossorigin="anonymous"
></script>


<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script th:inline="javascript">
    /*<![CDATA[*/
    let Message = document.getElementById("message");
    $("#send_message_btn").click(function () {
        sendMessage();
    });

    function send() {
        if (window.event.keyCode === 13) {
            sendMessage(); //실행 명령
        }
    }

    function sendMessage() {
        const btn = $(this);
        if(btn.hasClass("btn-loading")) return;

        let content = $('#message').val();
        let postIdx = /*[[${post.getPostIdx()}]]*/ '';
        let senderId = /*[[${userId}]]*/ '';
        let receiverId = /*[[${post.getRegisterId()}]]*/ '';
        let userId = /*[[${userId}]]*/ '';

        if(senderId != userId) {
            let tmp = senderId;
            senderId = userId;
            receiverId = tmp;
        }

        // alert(receiverId);
        //문자열 좌우 공백 제거
        if (content.trim() === '') {
            content.focus();
            return;
        }

        btn.addClass("btn-loading").attr("disabled", true);

        let data = {
            postIdx : postIdx,
            senderId : senderId,
            receiverId : receiverId,
            readYn : 'N',
            content : content
        };

        $.ajax({
            url: "../../../send/message.do" ,
            async: false,
            type:'POST',
            data: JSON.stringify(data),
            contentType:'application/json; charset = utf-8',
            dataType: 'json', // 리턴해주는 타입을 지정해줘야함
            success: function(res) {
                // location.reload();

                console.log("호출성공");
                console.log(JSON.parse(res)); //찾아보기
            },// 요청 완료 시
            error:function(err) {
                console.log("실패입니다.");
                btn.removeClass("btn-loading").attr("disabled", false);
            }// 요청 실패.
        });
    }

    /*]]>*/
</script>

</body>
</html>