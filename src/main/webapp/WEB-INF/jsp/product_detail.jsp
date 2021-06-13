<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>product_detail</title>
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
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Montserrat:300,400,500,600,700"
          rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link rel="stylesheet" type="text/css" href="resources/assets/vendor/aos/aos.css">
    <link type="text/css" href="resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link type="text/css" href="resources/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link type="text/css" href="resources/assets/css/style.css" rel="stylesheet">
</head>

<body>

<main id="main">
    <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light justify-content-between">
        <div class="container justify-content-between py-4">
            <a class="navbar-brand text-dark">DongOGong Market</a>
            <div class="d-inline-block collapse navbar-collapse justify-content-end text-align-right"
                 id="navbarSupportedContent">
                <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                   href="<c:url value="/apply/product.do"/>">NEW</a>
                <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline" href="<c:url value="/"/>">HOME</a>
                <a class="btn font-weight-500 ml-lg-4 btn-blue p-3 d-inline"
                   href="<c:url value='/apply/PostList_product.do'/>">BACK<i class="ml-2 fas fa-arrow-left"></i></a>
            </div>
        </div>
    </nav>
    <section id="about" class="about">
        <div class="container" data-aos="fade-up">
            <div class="row justify-content-center">
                <form name="form" method="post" class="col-lg-5 col-md-auto">
                    <h3 class="page-header-title pb-4">상품 세부 정보</h3>
                    <div>
                        <div class="about-img" data-aos="fade-right" data-aos-delay="100">
                            <img name="photoUrl" src="/resources/images/${selectPost.photoUrl}" height="">
                        </div>
                    </div>

                    <div class="col-lg-12 w-100">
                        <div class="about-content w-100" data-aos="fade-left" data-aos-delay="100">
                            <h2>${selectPost.title}</h2>
                            <h3 class="text-align-right d-block">${selectPost.price}</h3>
                            <p class="text-align-right d-block">${selectPost.content}</p>
                        </div>
                    </div>
                    <div class="btn btn-primary btn-xl font-weight-500 mb-2 w-100">
                        <a id="button">Chat</a>
                    </div>
                </form>
            </div>

        </div>
    </section>
</main><!-- End #main -->

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
        class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
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