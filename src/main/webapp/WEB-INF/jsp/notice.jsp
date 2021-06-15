<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>notice</title>
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
    <link href="/img/market.png" rel="icon">
    <link href="/assets/img/apple-touch-icon.png" rel="apple-touch-icon">
</head>
<body>
<%@ include file="IncludeQuickHeader.jsp" %>
<!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container" data-aos="fade-up">
        <div class="row justify-content-around">
          <div class="col-lg-5 col-md-8 mr-3" style="margin-top: 120px;">
            <div class="about-img" data-aos="fade-right" data-aos-delay="100" style="margin-top: 120px;">
              <img src="resources/images/DongOGong2.jpg" alt="">
            </div>
          </div>

          <div class="col-lg-6 col-md-6" style="margin-top: 120px;">
            <div class="about-content" data-aos="fade-left" data-aos-delay="100">
              <h2>About DongOGong Market</h2>
              <p>안녕하세요. 동오공 마켓입니다. <br> 저희 마켓을 방문해주셔서 감사합니다. <br> 아래의 주의사항들을 잘 읽고 만족스러운 구매가 되길 바랍니다.<br>
              보다 나은 거래 환경을 제공할 수 있도록 항상 노력하는 동오공 마켓이 되겠습니다. <br> 감사합니다.
              </p>
              <p>Hello. DongOGong Market.<br>
				Thank you for visiting our market. <br>
				Please read the cautions below carefully and we hope that you will be satisfied with your purchase.<br>
				DongOGong Market will always strive to provide a better trading environment. <br>
				Thank you.
				</p>
              <ul>
                <li><i class="bi bi-check-circle"></i> 경매는 한 사람 당 하나만 등록할 수 있습니다. 새로운 경매를 등록하려면 기존 경매를 삭제해주세요.</li>
                <li><i class="bi bi-check-circle"></i> 불법 게시글은 등록을 금지합니다. 불법 게시글 발견 시 반드시 신고해주시기 바랍니다.</li>
                <li><i class="bi bi-check-circle"></i> 동오공마켓은 채팅을 통해 구매를 확정할 수 있습니다. 원하는 게시글을 선택해 판매자와 연락하시기 바랍니다.</li>
              </ul>
              <ul>
                <li><i class="bi bi-check-circle"></i> Only one auction can be registered per person. To register a new auction, please delete the existing auction.</li>
                <li><i class="bi bi-check-circle"></i> Illegal postings are prohibited from registration. If you find any illegal postings, be sure to report them.</li>
                <li><i class="bi bi-check-circle"></i> In DongOGong Market, you can confirm your purchase through chat. Please select the desired post and contact the seller.</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      
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