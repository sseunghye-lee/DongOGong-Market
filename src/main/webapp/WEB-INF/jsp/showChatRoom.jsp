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
                                <a href='<c:url value="/chat/message.do">
                                    <c:param name="chatRelationIdx" value="${chat.chatRelationIdx}"/>
                                    <c:param name="postIdx" value="${chat.postIdx}"/><</c:url>'
                                   class="chats-list">
                                    <div class="d-flex align-items-start bg-light p-2">
                                        <img src="/resources/images/${chat.photoUrl}" class="me-2 rounded-pill mr-3"
                                             height="48"/>
                                        <div class="w-100 overflow-hidden">
                                            <h5 class="mt-0 mb-0 font-14 font-weight-bolder">
                                                <span class="float-end text-muted font-12 font-weight-normal">
                                                    <fmt:formatDate value="${chat.createdDateTime}"
                                                                    pattern="yyyy/MM/dd hh:mm"/>
                                                </span>
                                                <c:if test="${chat.senderId eq userSession.getUserInfo().getUserId()}">
                                                    <c:out value="${chat.receiverNickName}"></c:out>
                                                </c:if>
                                                <c:if test="${chat.senderId ne userSession.getUserInfo().getUserId()}">
                                                    <c:out value="${chat.senderNickName}"></c:out>
                                                </c:if>
                                                <span class="ml-2 text-gray-600 font-12">(상품명 -
                                                    <c:out value="${chat.title}"></c:out>)
                                                </span>
                                            </h5>
                                            <h6 class="mt-3 mb-0 text-muted">
                                                <c:if test="${chat.receiverId eq userId and chat.readYn eq 'N'}">
                                                    <span class="w-25 float-end text-end pt-1 pb-1 mt-n1">
                                                        <span class="badge-pill badge-danger pt-1 pb-1">N</span>
                                                    </span>
                                                </c:if>
                                                <span class="w-75 font-12 text-gray-700 ">
                                                    <c:out value="${chat.content}"></c:out>
                                                </span>
                                            </h6>
                                        </div>
                                    </div>
                                </a>
                                <hr class="font-weight-bolder">
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