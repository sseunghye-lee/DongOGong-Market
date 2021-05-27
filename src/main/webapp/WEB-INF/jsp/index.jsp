<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>mainPage</title>
    <meta content="" name="description">
    <meta content="" name="keywords">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/custom.css" rel="stylesheet">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>

    <!-- Favicons -->
    <link href="resources/assets/img/favicon.png" rel="icon">
    <link href="resources/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Montserrat:300,400,500,600,700" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link rel="stylesheet" type="text/css" href="resources/assets/vendor/aos/aos.css">
    <link type="text/css" href="resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link type="text/css" href="resources/assets/css/style.css" rel="stylesheet">

    <!-- =======================================================
    * Template Name: Rapid - v4.0.1
    * Template URL: https://bootstrapmade.com/rapid-multipurpose-bootstrap-business-template/
    * Author: BootstrapMade.com
    * License: https://bootstrapmade.com/license/
    ======================================================== -->
</head>
<body>
<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center header-transparent">
    <div class="container d-flex align-items-center">

        <h1 class="logo me-auto">DongOGong Market</h1>
        <!-- Uncomment below if you prefer to use an image logo -->

        <nav id="navbar" class="navbar order-last order-lg-0">
            <ul>
               <c:if test="${!empty userSession.userInfo}">
                    <li><a href="<c:url value="/logout.do" />">LOGOUT</a></li>		
                </c:if>
                <c:if test="${empty userSession.userInfo}">
                    <li><a href="<c:url value="/loginForm.do" />">LOGIN</a></li>
                </c:if>
                <li><a href="notice_bootstrap.jsp">Home</a></li>
                <li><a href="<c:url value="/apply/product.do"/>">PRODUCT</a></li>
                <li><a href="<c:url value='/chat/room/ + ${userSession.userInfo.userId}'/>">CHAT</a></li>

                <li><a href="<c:url value="/services.do"/>">Services</a></li>
                <li><a href="<c:url value="/myPage.do"/>">MYPAGE</a></li>
            </ul>
        </nav>
    </div>
</header><!-- End Header -->

<!-- ======= Hero Section ======= -->
<section id="hero" class="clearfix">
    <div class="container d-flex h-100">
        <div class="row justify-content-center align-self-center" data-aos="fade-up">
            <div class="col-lg-6 intro-info order-lg-first order-last" data-aos="zoom-in" data-aos-delay="100">
                <h2>DONGOGONG MARKET<br>당신의 물건을 <span>판매해보세요!</span></h2>
                <div>
                    <a href="notice_bootstrap.jsp" class="btn-get-started scrollto">Go Shopping!</a>
                </div>
            </div>

            <div class="col-lg-6 intro-img order-lg-last order-first" data-aos="zoom-out" data-aos-delay="200">
                <img src="resources/images/DongOGong.jpg" alt="" class="img-fluid">
            </div>
        </div>

    </div>
</section><!-- End Hero -->
<script src="<c:url value="resources/assets/vendor/aos/aos.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/glightbox/js/glightbox.min.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/isotope-layout/isotope.pkgd.min.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/php-email-form/validate.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/purecounter/purecounter.js"/>"></script>
<script src="<c:url value="resources/assets/vendor/swiper/swiper-bundle.min.js"/>"></script>
<!-- Template Main JS File -->
<script src="<c:url value="resources/assets/js/main.js"/>"></script>
</body>
</html>