<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTop.jsp" %>
<body>
<!-- ======= Header ======= -->
<%@ include file="IncludeQuickHeader.jsp" %>
<!-- End Header -->
<main class="main-screen" th:each="chat, index : ${chatRoomList}">
    <a th:href="${'/chat/message/list/'+userId+'/'+chat.getChatRoomId()}" class="chats-list">
        <div class="user-component-chatroom">

            <div class="user-component__column__chat__img" th:if="${chat.getSenderId() == userId}">
                <img th:src="${chat.getReceiverProfileImg()}"
                     class="user-component__avatar user-component__avatar--sm__chats"
                />
            </div>
            <div class="user-component__column__chat__img" th:if="${chat.getSenderId() != userId}">
                <img th:src="${chat.getSenderProfileImg()}"
                     class="user-component__avatar user-component__avatar--sm__chats"
                />
            </div>
            <!--                <h4 class="user-component__title" th:if="${chat.getSenderId()}" text="${chat.getSenderId()}"></h4>-->
            <!--                    <h6 class="user-component__subtitle" th:text="${chat.getChatMessage()}">-->
            <h4 class="user-component__title" th:if="${chat.getSenderId() == userId}"
                th:text="${chat.getReceiverName()}"></h4>
            <h4 class="user-component__title" th:if="${chat.getSenderId() != userId}"
                th:text="${chat.getSenderName()}"></h4>
            <div class="user-component__column__chat__noImg date">
                <span class="user-component__time" th:text="${chat.getModifiedDateTime()}"></span>
            </div>
            <h6 class="user-component__subtitle__chats" th:text="${chat.getChatMessage()}"></h6>
            <div class="user-component__column__chat__noImg"
                 th:if="${(chat.receiverId == userId) and (chat.getReadYn().toString().equals('N'))}">
                <div class="badge">N</div>
            </div>
        </div>
    </a>
</main>

<script
        src="https://kit.fontawesome.com/6478f529f2.js"
        crossorigin="anonymous"
></script>
</body>
</html>