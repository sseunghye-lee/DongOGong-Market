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

  <title>services</title>
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
 <%@ include file="IncludeTop.jsp" %>
</head>
<body>
<%@ include file="IncludeQuickHeader.jsp" %>
<!-- ======= Services Section ======= -->
    <section id="services" class="services section-bg">
      <div class="container" data-aos="fade-up">

        <header class="section-header">
          <h3>Services</h3>
          <p>원하는 페이지를 눌러주세요. <br> 해당 페이지로 이동합니다.</p>
        </header>

        <div class="row">

          <div class="col-md-6 col-lg-4 wow bounceInUp" data-aos="zoom-in" data-aos-delay="100">
            <div class="box">
              <div class="icon" style="background: #fceef3;"><i class="bi bi-briefcase" style="color: #ff689b;"></i></div>
              <h4 class="title"><a href="<c:url value='/apply/PostList_product.do'/>">PRODUCT</a></h4>
              <p class="description">상품게시판 <br> 상품들의 목록과 상세보기, 내가 올린 상품들을 볼 수 있는 페이지입니다.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-4" data-aos="zoom-in" data-aos-delay="200">
            <div class="box">
              <div class="icon" style="background: #fff0da;"><i class="bi bi-card-checklist" style="color: #e98e06;"></i></div>
              <h4 class="title">
               
              <c:if test="${empty userSession.userInfo}">
              <a href="<c:url value="/loginForm.do"/>">AUCTION</a>
              </c:if> 
              <c:if test="${!empty userSession.userInfo}">
              <a href="<c:url value="/auction.do"/>">AUCTION</a>
              </c:if> </h4>
              <p class="description">경매페이지 <br> 경매할 상품들의 목록과 상세보기를 할 수 있는 페이지입니다.</p>
            </div>
          </div>

          <div class="col-md-6 col-lg-4" data-aos="zoom-in" data-aos-delay="300">
            <div class="box">
              <div class="icon" style="background: #e6fdfc;"><i class="bi bi-bar-chart" style="color: #3fcdc7;"></i></div>
              <h4 class="title"><a href="<c:url value="/apply/product.do"/>">REGISTER PRODUCT</a></h4>
              <p class="description">상품 등록 페이지 <br> 구매 상품을 등록하는 페이지로 검색될 상품명, 가격, 설명 등을 입력해 등록할 수 있는 페이지입니다.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 wow" data-aos="zoom-in" data-aos-delay="100">
            <div class="box">
              <div class="icon" style="background: #eafde7;"><i class="bi bi-binoculars" style="color:#41cf2e;"></i></div>
              <h4 class="title"><a href="<c:url value="/cartList.do"/>">MY CART</a></h4>
              <p class="description">장바구니 <br> 장바구니에 담은 물건을 한 눈에 볼 수 있는 페이지입니다.</p>
            </div>
          </div>

          <div class="col-md-6 col-lg-4" data-aos="zoom-in" data-aos-delay="200">
        <div class=" box">
            <div class="icon" style="background: #e1eeff;"><i class="bi bi-brightness-high" style="color: #2282ff;"></i></div>
            <h4 class="title"><a href="<c:url value="/myPage.do"/>">MYPAGE</a></h4>
            <p class="description">마이페이지 <br> 내 정보와 거래 내역을 확인하고 정보 수정, 회원 탈퇴할 수 있는 페이지입니다.</p>
          </div>
        </div>
        <div class="col-md-6 col-lg-4" data-aos="zoom-in" data-aos-delay="300">
          <div class="box">
            <div class="icon" style="background: #ecebff;"><i class="bi bi-calendar4-week" style="color: #8660fe;"></i></div>
            <h4 class="title"><a href="<c:url value="/notice.do"/>">NOTICE</a></h4>
            <p class="description">공지사항 <br> DONGOGONG Market의 정보를 열람할 수 있는 페이지입니다.</p>
          </div>
        </div>

      </div>

      </div>
    </section><!-- End Services Section -->

	
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