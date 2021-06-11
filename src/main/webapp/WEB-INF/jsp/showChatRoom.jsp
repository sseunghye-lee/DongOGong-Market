<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTopDist.jsp" %>
<body>
<div id="layoutDefault">
    <section id="layoutDefault_content">
        <%@ include file="IncludeQuickHeader.jsp" %>
        <main class="vh-100">
            <header class="page-header page-header-light bg-light h-100 overflow-scroll">
                <c:forEach var="chat" items="${chatRoomList}">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <a href="<c:url value="/chat/message.do?chatRelationIdx=${chat.chatRelationIdx}"/>"
                                   class="chats-list">
                                    <div class="user-component-chatroom">
                                        <c:if test="${chat.senderId eq userSession.getUserInfo().getUserId()}">
                                            <h4 class="user-component__title" th:text="${chat.getReceiverName()}">
                                                <c:out value="${chat.receiverNickName}"></c:out>
                                            </h4>
                                        </c:if>
                                        <c:if test="${chat.senderId ne userSession.getUserInfo().getUserId()}">
                                            <h4 class="user-component__title">
                                                <c:out value="${chat.senderNickName}"></c:out>
                                            </h4>
                                        </c:if>
                                        <div class="user-component__column__chat__noImg date">
                                            <span class="user-component__time">
                                                <c:out value="${chat.createdDateTime}"></c:out>
                                            </span>
                                        </div>
                                        <h6 class="user-component__subtitle__chats">
                                            <c:out value="${chat.content}"></c:out></h6>
                                        <c:if test="${chat.receiverId eq userSession.getUserInfo().getUserId() and chat.readYn eq 'N'}">
                                            <div class="user-component__column__chat__noImg">
                                                <div class="badge">N</div>
                                            </div>
                                        </c:if>
                                    </div>
                                </a>
                                <hr>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                <h3 class="font-weight-bolder page-header-text text-muted text-center">END</h3>
            </header>
        </main>
    </section>
</div>
</div>
<script
        src="https://kit.fontawesome.com/6478f529f2.js"
        crossorigin="anonymous"
></script>
</body>
</html>