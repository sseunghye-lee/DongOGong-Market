<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/custom.css" rel="stylesheet">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <title>auction</title>
    <link href="resources/dist/css/styles.css" rel="stylesheet"/>
    <link rel="icon" type="image/x-icon" href="resources/dist/assets/img/favicon.png"/>
    <script data-search-pseudo-elements defer
            src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js"
            crossorigin="anonymous"></script>
    <script>

        function goMyAuction(targetUri) {
            var myTitle = "${myAuction.title}";
            if (myTitle.length == 0) {
                alert("내 경매가 존재하지 않습니다.");
                return false;
            } else {
                form.action = targetUri;
                form.submit();
            }
        }

        function goAuction(targetUri) {
            form.action = targetUri;
            form.submit();
        }

        function goNewAuction(targetUri) {
            var myTitle = "${myAuction.title}";
            if (myTitle.length != 0) {
                alert("이미 등록한 경매가 있습니다.");
                return false;
            } else {
                form.action = targetUri;
                form.submit();
            }
        }
    </script>
</head>
<body>
<div id="layoutDefault">
    <div id="layoutDefault_content">
        <main>
            <!-- Navbar-->
            <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light">

                <div class="container">
                    <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light justify-content-between w-100">
                        <div class="container justify-content-between py-4">
                            <div class="d-inline-block">
                                <a class="navbar-brand text-dark" href="<c:url value="/index.do"/>"> DongOGong
                                    Market</a>
                                <button class="navbar-toggler" type="button" data-toggle="collapse"
                                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                        aria-expanded="false" aria-label="Toggle navigation">
                                </button>
                                <span class="ml-2 font-weight-bolder">₩5000</span>
                            </div>
                            <div class="d-inline-block collapse navbar-collapse justify-content-end float-end text-align-right"
                                 style="flex-grow: inherit;">
                                <div class="collapse navbar-collapse text-right" id="navbarSupportedContent">
                                    <form method="post">
                                        <a class="btn font-weight-500 ml-lg-4 btn-primary"
                                           href="<c:url value="/auction.do"/>">Auction</a>
                                        <input type="button" value="My"
                                               onClick="goMyAuction('<c:url value="/auction_my.do"/>')"
                                               class="btn font-weight-500 ml-lg-4 btn-primary"/>
                                        <input type="button" value="NEW"
                                               onClick="goNewAuction('<c:url value="/auction_new.do"/>')"
                                               class="btn font-weight-500 ml-lg-4 btn-primary"/>
                                        <a class="btn font-weight-500 ml-lg-4 btn-primary" href="<c:url value="/"/>">HOME</a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </nav>

                </div>

            </nav>
            <!-- Page Header-->
            <header class="page-header page-header-dark bg-img-cover overlay overlay-primary overlay-90"
                    style="background-image: url('https://source.unsplash.com/g39p1kDjvSY/1600x1200')">
                <div class="page-header-content py-5">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-xl-8 col-lg-10 text-center">
                                <h1 class="page-header-title">Auction</h1>
                                <p class="page-header-text mb-5">경매에 참여하고 싶은 상품을 골라 "경매참가" 버튼을 눌러주세요.
                                    <br> 원하는 상품을 구매할 수 있길 바랍니다.
                                    <br> 상품 가격은 "경매참가"를 할 때마다 "5000원"씩 올라갑니다.
                                </p>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-xl-6 col-lg-8 text-center">
                                <form class="form-inline justify-content-center">
                                    <!--
                                        <div class="form-group flex-fill mb-2 mr-2"><label class="sr-only" for="inputSearch">Enter and address, city, state, or ZIP</label><input class="form-control form-control-solid w-100" id="inputSearch" type="search" placeholder="Enter and address, city, state, or ZIP" /></div>
                                        <button class="btn btn-teal font-weight-500 mb-2" type="submit">Search</button> -->
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="svg-border-rounded text-white">
                    <!-- Rounded SVG Border-->
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none"
                         fill="currentColor">
                        <path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path>
                    </svg>
                </div>
            </header>
            <section class="bg-white py-10">

                <div class="container">
                    <div class="d-flex align-items-center justify-content-between mb-4">
                        <h2 class="mb-0">Auction ${transIdx.transactionsIdx }</h2>

                    </div>
                    <form name="form" method="POST">
                        <div class="row">

                            <c:forEach var="auction" items="${auctionList}">
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <a class="card lift h-100">
                                        <div class="card-flag card-flag-dark card-flag-top-right">경매중</div>
                                        <img class="card-img-top" name="photoUrl"
                                             src="/resources/images/${auction.photoUrl}" height=200 alt="..."/>
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">${auction.price}</h3>
                                            <div class="small text-gray-800 font-weight-500">${auction.title}
                                            </div>
                                            <div class="small text-gray-500" name="content">${auction.content}
                                            </div>
                                        </div>
                                        <c:if test="${auction.registerId ne userSession.getUserInfo().getUserId()}">
                                            <input type="submit" value="경매참가" class="btn-blue-soft border-light"
                                                   onClick="goAuction('<c:url value='/auctionSend.do'><c:param name='postIdx' value='${auction.postIdx}'/><c:param name='price' value='${auction.price}'/></c:url>')"/>
                                        </c:if>
                                        <input type="submit" value="경매현황" class="btn-danger-soft border-light"
                                               onClick="goAuction('<c:url value='/auction_progress.do'> <c:param name='postIdx' value='${auction.postIdx}'/></c:url>')"/>
                                    </a>
                                </div>
                            </c:forEach>

                            <div class="svg-border-rounded text-light">
                                <!-- Rounded SVG Border-->
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34"
                                     preserveAspectRatio="none" fill="currentColor">
                                    <path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path>
                                </svg>
                            </div>
                        </div>
                    </form>
            </section>
        </main>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="<c:url value="resouces/dist/js/scripts.js"/>"></script>
</body>
</html>