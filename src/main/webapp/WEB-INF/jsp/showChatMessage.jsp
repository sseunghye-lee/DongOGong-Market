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
            <header class="page-header page-header-light bg-light h-100">
                <div class="container h-100" style="overflow-y: scroll">
                    <div class="text-center mb-4 d-block">
                        <c:if test="${post.registerId ne userId and (post.transactionConfirmation eq 'no' or post.transactionConfirmation eq 'WAIT')}">
                            <a class="mt-2 btn btn-light btn-outline-dark font-weight-500 pl-5 pr-5 mb-2"
                               onclick="complete()">구매하기</a>
                        </c:if>
                        <c:if test="${post.registerId ne userId and post.transactionConfirmation eq 'COMPLETED' and buyer eq userId}">
                            <div class="card-header text-center mb-4">
                                <c:out value="${userSession.getUserInfo().getNickName()}"></c:out>님이 구매하신 상품입니다. 판매자와의
                                연락을 통해 직거래를 해주세요.
                            </div>
                        </c:if>
                        <c:if test="${post.registerId ne userId and post.transactionConfirmation eq 'WAIT'}">
                            <div class="card-header text-center mb-4 w-100">상품을 찜한 사람이 있습니다. 서둘러 구매해보세요.</div>
                        </c:if>
                        <c:if test="${post.registerId ne userId and post.transactionConfirmation eq 'COMPLETED' and buyer ne userId}">
                            <div class="card-header text-center mb-4">상품 구매가 완료된 상품으로 구매가 불가능합니다.</div>
                        </c:if>
                        <c:if test="${post.registerId eq userId}">
                            <div class="card-header text-center mb-4"><c:out value="${userSession.getUserInfo().getNickName()}"></c:out>님이 등록한 상품입니다. <c:out value="${chatRoomName}"></c:out>님에게 상품을 팔아보세요.</div>
                        </c:if>
                    </div>
                    <a href="<c:url value="/chat/room/${userSession.userInfo.userId}"/>">
                        <i class="fas fa-angle-left fa-2x"></i>
                        <h1 class="ml-2 d-inline font-weight-bolder">
                            <c:out value="${chatRoomName}"></c:out>
                        </h1>
                    </a>
                    <main class="main-screen main-chat mt-5 h-75 scroll-to-top pb-5" id="chatMessageArea">
                        <c:forEach var="message" items="${chatMessageList}" varStatus="i">
                            <div>
                                <c:if test="${userSession.getUserInfo().getUserId() eq message.receiverId}">
                                    <div class="message-row leftMessage">
                                        <div class="message-row__content mt-3">
                                            <span class="message__author text-primary font-weight-bolder">
                                                <c:out value="${message.senderNickName}"></c:out>
                                            </span>
                                            <div class="message__info">
                                                <span class="message__bubble">
                                                    <c:out value="${message.content}"></c:out>
                                                </span>
                                            </div>
                                            <span class="message__time">
                                                <fmt:formatDate value="${message.createdDateTime}"
                                                                pattern="yyyy/MM/dd hh:mm"/>
                                            </span>
                                        </div>
                                    </div>
                                </c:if>
                                <c:if test="${userSession.getUserInfo().getUserId() eq message.senderId}">
                                    <div class="mr-3 rightMessage">
                                        <div class="message-row__content message-row--own mt-3">
                                            <div class="message-row__content">
                                                <div class="message__info">
                                                    <span class="message__bubble">
                                                    <c:out value="${message.content}"></c:out>
                                                    </span>
                                                    <c:if test="${message.readYn eq 'N'}">
                                                        <span>1</span>
                                                    </c:if>
                                                </div>
                                                <span class="message__time float-end">
                                                        <fmt:formatDate value="${message.createdDateTime}"
                                                                        pattern="yyyy/MM/dd hh:mm"/>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </div>
                        </c:forEach>
                    </main>
                </div>
                <div class="reply">
                    <div class="reply__column">
                        <input type="text" placeholder="Write a message..." id="message" onkeyup="send()" autofocus/>
                        <button id="send_message_btn" class="bg-gray-400" onclick="send()">
                            <i class="fas fa-arrow-up text-light"></i>
                        </button>
                    </div>
                </div>
            </header>
        </main>
    </section>
</div>
<!-- end chat area-->

<%--<div class="modal fade" id="completeModal" tabindex="-1" role="dialog" aria-labelledby="completeModalLabel"--%>
<%--     aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="completeModalLabel">구매 확정</h5>--%>
<%--                <button class="close" type="button" data-dismiss="modal" aria-label="Close"><span--%>
<%--                        aria-hidden="true">×</span></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <c:out value="${chatRoomName}"></c:out>님이 올린 상품을 구매하시겠습니까?<br>--%>
<%--                구매 확정 후에는 직거래로 구매를 진행하시면 됩니다.<br>--%>
<%--                안전한 거래가 되시길 바랍니다.--%>
<%--            </div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button class="btn btn-primary" type="button">구매 확정</button>--%>
<%--                <button class="btn btn-light" type="button" data-dismiss="modal">닫기</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<div class="modal fade" id="cancelModal" tabindex="-1" role="dialog" aria-labelledby="cancelModalLabel"--%>
<%--     aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="cancelModalLabel">구매 취소</h5>--%>
<%--                <button class="close" type="button" data-dismiss="modal" aria-label="Close"><span--%>
<%--                        aria-hidden="true">×</span></button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--                <c:out value="${chatRoomName}"></c:out>님의 상품 구매를 취소하시겠습니까?<br>--%>
<%--                단순 구매 취소는 지양해주시길 바랍니다.--%>
<%--            </div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button class="btn btn-danger" type="button">구매 취소</button>--%>
<%--                <button class="btn btn-light" type="button" data-dismiss="modal">닫기</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<script
        src="https://kit.fontawesome.com/6478f529f2.js"
        crossorigin="anonymous">
</script>

<script>
    window.onload = function () {
        $("#chatMessageArea").scrollTop($("#chatMessageArea")[0].scrollHeight);
    }

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
        if (btn.hasClass("btn-loading")) return;

        let content = $('#message').val();
        let postIdx = '<c:out value="${post.postIdx}"></c:out>';
        let senderId = '<c:out value="${userId}"></c:out>';
        let receiverId = '<c:out value="${chatRoomId}"></c:out>';
        let chatRelationIdx = '<c:out value="${chatRelationIdx}"></c:out> '

        // alert(receiverId);
        //문자열 좌우 공백 제거
        if (content.trim() === '') {
            content.focus();
            return;
        }

        btn.addClass("btn-loading").attr("disabled", true);

        let data = {
            postIdx: postIdx,
            senderId: senderId,
            receiverId: receiverId,
            readYn: 'N',
            content: content,
            chatRelationIdx: chatRelationIdx
        };

        $.ajax({
            url: "../../../send/room/message.do",
            method: "POST",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            async: false,
            dataType: 'json', // 리턴해주는 타입을 지정해줘야함
            success: function (res) {
                console.log("호출성공");
                location.reload();
            },// 요청 완료 시
            error: function (err) {
                btn.removeClass("b-loading").attr("disabled", false);
                console.log("채팅 전송 실패입니다.");
                alert("채팅 전송에 실패하였습니다.");
            }// 요청 실패.
        });
    }


    function complete() {
        const btn = $(this);
        if (btn.hasClass("btn-loading")) return;

        let postIdx = '<c:out value="${post.postIdx}"></c:out>';
        let sellerId = '<c:out value="${chatRoomId}"></c:out>';
        let buyerId = '<c:out value="${userId}"></c:out>';
        let status = 'COMPLETED'
        let borderType = '<c:out value="${post.borderType}"></c:out>';

        btn.addClass("btn-loading").attr("disabled", true);


        let data = {
            postIdx: postIdx,
            sellerId: sellerId,
            buyerId: buyerId,
            status: status,
            borderType: borderType
        };

        $.ajax({
            url: "/complete/product.do",
            method: "POST",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            dataType: 'json', // 리턴해주는 타입을 지정해줘야함
            async: false,
            success: function (res) {
                console.log("호출성공");
                alert('상품 구매가 확정되었습니다.\n구매 확정 후에는 직거래로 구매를 진행하시면 됩니다.');
                location.reload();
            },// 요청 완료 시
            error: function (err) {
                btn.removeClass("b-loading").attr("disabled", false);
                console.log("상품 구매 실패입니다.");
                alert("상품 구매에 실패하였습니다.");
            }// 요청 실패.
        });
    }

</script>

</body>
</html>