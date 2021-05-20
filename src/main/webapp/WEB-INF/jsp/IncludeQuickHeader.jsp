<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center header-transparent fixed-top">
    <div class="container d-flex align-items-center">

        <h1 class="logo me-auto"><a href="index.jsp">DongOGong Market</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->

        <nav id="navbar" class="navbar order-last order-lg-0">
            <ul>          <c:if test="${!empty userSession.account}">
                <%--    나중에 로그아웃 할 매핑 적어주면 됨  --%>
                <li><a href="#">LOGOUT</a></li>
            </c:if>
                <c:if test="${empty userSession.account}">
                    <li><a href="<c:url value="/login.do" />">LOGIN</a></li>
                </c:if>
                <li><a href="notice_bootstrap.jsp">Home</a></li>
                <li><a href="<c:url value="/apply/product.do"/>">PRODUCT</a></li>
                <li><a href="<c:url value="/chat/room.do"/>">CHAT</a></li>

                <li><a href="<c:url value="/services.do"/>">Services</a></li>
                <li><a href="<c:url value="/myPage.do"/>">MYPAGE</a></li>

            </ul>
        </nav>
    </div>
</header>
<!-- End Header -->