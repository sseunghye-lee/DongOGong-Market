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

                                    <div class="w-100 overflow-hidden">
                                        <h5 class="mt-0 mb-0 font-14">
                                            <span class="float-end text-muted font-12">
                                                <fmt:formatDate value="${chat.createdDateTime}"
                                                                pattern="yyyy/MM/dd hh:mm"/></span>
                                            <c:if test="${chat.senderId eq userSession.getUserInfo().getUserId()}">
                                                <c:out value="${chat.receiverNickName}"></c:out>
                                            </c:if>
                                            <c:if test="${chat.senderId ne userSession.getUserInfo().getUserId()}">
                                                <c:out value="${chat.senderNickName}"></c:out>
                                            </c:if>
                                        </h5>
                                        <h6 class="mt-2 mb-0 text-muted font-14">
                                            <c:if test="${(chat.receiverId eq userSession.getUserInfo().getUserId()) and (chat.readYn eq 'N')}">
                                            <span class="w-25 float-end text-end"><span
                                                    class="badge badge-danger-lighten">N</span></span>
                                            </c:if>
                                            <span class="w-75 font-12">
                                            <c:out value="${chat.content}"></c:out>
                                            </span>
                                        </h6>
                                    </div>
                                    <hr class="font-weight-bolder">
                                </a>
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