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
<!-- chat area -->
<div class="col-xxl-6 col-xl-12 order-xl-2">
    <div class="card">
        <div class="card-body">
            <ul class="conversation-list" data-simplebar style="max-height: 537px">
                <li class="clearfix">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-5.jpg" class="rounded" alt="Shreyu N" />
                        <i>10:00</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Shreyu N</i>
                            <p>
                                Hello!
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix odd">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-1.jpg" class="rounded" alt="dominic" />
                        <i>10:01</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Dominic</i>
                            <p>
                                Hi, How are you? What about our next meeting?
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-5.jpg" class="rounded" alt="Shreyu N" />
                        <i>10:01</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Shreyu N</i>
                            <p>
                                Yeah everything is fine
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix odd">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-1.jpg" class="rounded" alt="dominic" />
                        <i>10:02</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Dominic</i>
                            <p>
                                Wow that's great
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-5.jpg" alt="Shreyu N" class="rounded" />
                        <i>10:02</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Shreyu N</i>
                            <p>
                                Let's have it today if you are free
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix odd">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-1.jpg" alt="dominic" class="rounded" />
                        <i>10:03</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Dominic</i>
                            <p>
                                Sure thing! let me know if 2pm works for you
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-5.jpg" alt="Shreyu N" class="rounded" />
                        <i>10:04</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Shreyu N</i>
                            <p>
                                Sorry, I have another meeting scheduled at 2pm. Can we have it
                                at 3pm instead?
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-5.jpg" alt="Shreyu N" class="rounded" />
                        <i>10:04</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Shreyu N</i>
                            <p>
                                We can also discuss about the presentation talk format if you have some extra mins
                            </p>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu dropdown-menu-end">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
                <li class="clearfix odd">
                    <div class="chat-avatar">
                        <img src="assets/images/users/avatar-1.jpg" alt="dominic" class="rounded" />
                        <i>10:05</i>
                    </div>
                    <div class="conversation-text">
                        <div class="ctext-wrap">
                            <i>Dominic</i>
                            <p>
                                3pm it is. Sure, let's discuss about presentation format, it would be great to finalize today.
                                I am attaching the last year format and assets here...
                            </p>
                        </div>
                        <div class="card mt-2 mb-1 shadow-none border text-start">
                            <div class="p-2">
                                <div class="row align-items-center">
                                    <div class="col-auto">
                                        <div class="avatar-sm">
                                                                        <span class="avatar-title rounded">
                                                                            .ZIP
                                                                        </span>
                                        </div>
                                    </div>
                                    <div class="col ps-0">
                                        <a href="javascript:void(0);"
                                           class="text-muted fw-bold">Hyper-admin-design.zip</a>
                                        <p class="mb-0">2.3 MB</p>
                                    </div>
                                    <div class="col-auto">
                                        <!-- Button -->
                                        <a href="javascript:void(0);"
                                           class="btn btn-link btn-lg text-muted">
                                            <i class="dripicons-download"></i>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="conversation-actions dropdown">
                        <button class="btn btn-sm btn-link" data-bs-toggle="dropdown"
                                aria-expanded="false"><i class='uil uil-ellipsis-v'></i></button>

                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Copy Message</a>
                            <a class="dropdown-item" href="#">Edit</a>
                            <a class="dropdown-item" href="#">Delete</a>
                        </div>
                    </div>
                </li>
            </ul>

            <div class="row">
                <div class="col">
                    <div class="mt-2 bg-light p-3 rounded">
                        <form class="needs-validation" novalidate="" name="chat-form"
                              id="chat-form">
                            <div class="row">
                                <div class="col mb-2 mb-sm-0">
                                    <input type="text" class="form-control border-0" placeholder="Enter your text" required="">
                                    <div class="invalid-feedback">
                                        Please enter your messsage
                                    </div>
                                </div>
                                <div class="col-sm-auto">
                                    <div class="btn-group">
                                        <a href="#" class="btn btn-light"><i class="uil uil-paperclip"></i></a>
                                        <a href="#" class="btn btn-light"> <i class='uil uil-smile'></i> </a>
                                        <div class="d-grid">
                                            <button type="submit" class="btn btn-success chat-send"><i class='uil uil-message'></i></button>
                                        </div>
                                    </div>
                                </div> <!-- end col -->
                            </div> <!-- end row-->
                        </form>
                    </div>
                </div> <!-- end col-->
            </div>
            <!-- end row -->
        </div> <!-- end card-body -->
    </div> <!-- end card -->
</div>
<!-- end chat area-->
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