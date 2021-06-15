<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
           <meta name="viewport" content="width=device-width, initial-scale=1">
      <link href="./css/bootstrap.min.css" rel="stylesheet">
      <link href="./css/custom.css" rel="stylesheet">
      <script
          src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <script src="./js/bootstrap.min.js"></script>
        <title>myPage</title>
        <link type="text/css" href="resources/dist/css/styles.css" rel="stylesheet" />
        <link rel="icon" type="image/x-icon" href="resources/dist/assets/img/favicon.png" />
        <script data-search-pseudo-elements defer src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js" crossorigin="anonymous"></script>
        
 <%@ include file="IncludeTop.jsp" %>
</head>
<body>
<%@ include file="IncludeQuickHeader.jsp" %>

                    <!-- Page Header-->
                    <header class="page-header page-header-light bg-white">
                        <div class="page-header-content">
                            <div class="container">
                                <div class="row justify-content-center">
                                    <div class="col-xl-8 col-lg-10 text-center">
                                        <img class="mb-4" src="resources/dist/assets/img/demo/avataaars.svg" style="width: 15rem" />
                                        <h1 class="page-header-title">MyPage</h1>
                                        <p class="page-header-text">아이콘 밑의 설명을 읽고 원하는 페이지를 클릭하세요. 
                                        <br> 원하는 페이지의 하이퍼링크를 누르면 해당 페이지로 이동합니다.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="svg-border-rounded text-light">
                            <!-- Rounded SVG Border--><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none" fill="currentColor"><path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path></svg>
                        </div>
                    </header>
                    <section class="bg-light py-10">
                        <div class="container">
                            <div class="row text-center">
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <div class="icon-stack icon-stack-xl bg-red text-white mb-4"><i class="fas fa-edit"></i></i></div>
                                    <h3><a href="<c:url value="/myPage_change.do"/>">회원 정보 수정</a></h3>
                                    <p class="mb-0">이름, 핸드폰 번호, 비밀번호 등을 변경하고 싶을 때 누르세요.</p>
                                </div>
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <div class="icon-stack icon-stack-xl bg-yellow text-white mb-4"><i class="far fa-frown"></i></i></div>
                                    <h3><a href="<c:url value="/deleteUser.do"/>">회원 탈퇴</a></h3>
                                    <p class="mb-0">더 이상 이 사이트를 이용하지 않을 때 누르세요.</p>
                                </div>
                                <div class="col-lg-4">
                                    <div class="icon-stack icon-stack-xl bg-blue text-white mb-4"><i class="fas fa-clipboard-list"></i></div>
                                    <h3><a href="<c:url value="/checkDeal.do"/>">거래 내역 확인</a></h3>
                                    <p class="mb-0">본인이 거래한 상품 내역을 확인하고 싶을 때 누르세요.</p>
                                </div>
                            </div>
                        </div>
                        <div class="svg-border-rounded text-white">
                            <!-- Rounded SVG Border--><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none" fill="currentColor"><path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path></svg>
                        </div>
                    </section>
          
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value="resources/dist/js/scripts.js"/>"></script>
</body>
</html>