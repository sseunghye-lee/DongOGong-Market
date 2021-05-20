<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
        <title>auction</title>
        <link href="resources/dist/css/styles.css" rel="stylesheet" />
        <link rel="icon" type="image/x-icon" href="resources/dist/assets/img/favicon.png" />
        <script data-search-pseudo-elements defer src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div id="layoutDefault">
            <div id="layoutDefault_content">
                <main>
                    <!-- Navbar-->
                    <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light">
                        <div class="container">
                            <a class="navbar-brand text-dark" href="index.html">DongOGong Market</a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                               <i data-feather="menu"></i>
                            </button>
                              ₩5000
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <a class="btn font-weight-500 ml-lg-4 btn-primary" href="<c:url value="/auction.do"/>">Auction<i class="ml-2" data-feather="arrow-right"></i></a>
                                <a class="btn font-weight-500 ml-lg-4 btn-primary" href="<c:url value="/auction_my.do"/>">My<i class="ml-2" data-feather="arrow-right"></i></a>
                                <a class="btn font-weight-500 ml-lg-4 btn-primary" href="<c:url value="/auction_new.do"/>">NEW<i class="ml-2" data-feather="arrow-right"></i></a>
                            </div>
                        </div>
                    </nav>
                    <!-- Page Header-->
                    <header class="page-header page-header-dark bg-img-cover overlay overlay-primary overlay-90" style="background-image: url('https://source.unsplash.com/g39p1kDjvSY/1600x1200')">
                        <div class="page-header-content py-5">
                            <div class="container">
                                <div class="row justify-content-center">
                                    <div class="col-xl-8 col-lg-10 text-center">
                                        <h1 class="page-header-title">Auction</h1>
                                        <p class="page-header-text mb-5">//경매 관련 말//</p>
                                    </div>
                                </div>
                                <div class="row justify-content-center">
                                    <div class="col-xl-6 col-lg-8 text-center">
                                        <form class="form-inline justify-content-center">
                                            <div class="form-group flex-fill mb-2 mr-2"><label class="sr-only" for="inputSearch">Enter and address, city, state, or ZIP</label><input class="form-control form-control-solid w-100" id="inputSearch" type="search" placeholder="Enter and address, city, state, or ZIP" /></div>
                                            <button class="btn btn-teal font-weight-500 mb-2" type="submit">Search</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="svg-border-rounded text-white">
                            <!-- Rounded SVG Border--><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none" fill="currentColor"><path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path></svg>
                        </div>
                    </header>
                    <section class="bg-white py-10">
                        <div class="container">
                            <div class="d-flex align-items-center justify-content-between mb-4">
                                <h2 class="mb-0">Auction</h2>
                                <a class="btn btn-sm btn-primary d-inline-flex align-items-center" href="#!">See more<i class="ml-1" data-feather="arrow-right"></i></a>
                            </div>
                            <div class="row">
                            <c:forEach var="auction" items="${auctionList}">
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <a class="card lift h-100" href="#!">
                                       <div class="card-flag card-flag-dark card-flag-top-right">경매중</div>
                                        <img class="card-img-top" src="resources/images/${auction.url}" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">${auction.price} won</h3>
                                            <div class="small text-gray-800 font-weight-500">${auction.title}</div>
                                            <div class="small text-gray-500">${auction.content}</div>
                                        </div>
                                         <button>Send</button> 
                                   </a>
                                </div>
                                </c:forEach>
                                <!--  
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <a class="card lift h-100" href="#!">
                                        <div class="card-flag card-flag-dark card-flag-top-right">Listed 6 days</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/MP0bgaS_d1c/800x500" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">$409,000</h3>
                                            <div class="small text-gray-800 font-weight-500">3 bd | 2 ba | 1,350 sqft</div>
                                            <div class="small text-gray-500">Sartalik, GA</div>
                                        </div>
                                        <button>Send</button> 
                                    </a>
                                </div>
                                <div class="col-lg-4">
                                    <a class="card lift h-100" href="#!">
                                        <div class="card-flag card-flag-dark card-flag-top-right">Listed 2 weeks</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/iAftdIcgpFc/800x500" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">$1,299,999</h3>
                                            <div class="small text-gray-800 font-weight-500">6 bd | 5.5 ba | 4,220 sqft</div>
                                            <div class="small text-gray-500">Picsard, GA</div>
                                        </div>
                                        <button>Send</button> 
                                   </a>
                                </div>
                            </div>
                        </div>
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <a class="card lift h-100" href="#!">
                                        <div class="card-flag card-flag-dark card-flag-top-right">Listed 3 days</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/561igiTyvSk/800x500" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">$556,999</h3>
                                            <div class="small text-gray-800 font-weight-500">5 bd | 3 ba | 2,420 sqft</div>
                                            <div class="small text-gray-500">Sartalik, GA</div>
                                        </div>
                                        <button>Send</button> 
                                    </a>
                                </div>
                                <div class="col-lg-4 mb-5 mb-lg-0">
                                    <a class="card lift h-100" href="#!">
                                       <div class="card-flag card-flag-dark card-flag-top-right">Listed 5 days</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/IYfp2Ixe9nM/800x500" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">$384,000</h3>
                                            <div class="small text-gray-800 font-weight-500">4 bd | 2 ba | 1,750 sqft</div>
                                            <div class="small text-gray-500">Picsard, GA</div>
                                        </div>
                                        <button>Send</button> 
                                    </a>
                                </div>
                                <div class="col-lg-4">
                                    <a class="card lift h-100" href="#!"
                                        ><div class="card-flag card-flag-dark card-flag-top-right">Listed 1 week</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/XbwHrt87mQ0/800x500" alt="..." />
                                        <div class="card-body">
                                            <h3 class="text-primary mb-0">$349,999</h3>
                                            <div class="small text-gray-800 font-weight-500">3 bd | 2 ba | 1,231 sqft</div>
                                            <div class="small text-gray-500">Sartalik, GA</div>
                                        </div>
                                        <button>Send</button>                                            
                                    </a>
                                </div>
                            </div>
                        </div> -->
                        <div class="svg-border-rounded text-light">
                            <!-- Rounded SVG Border--><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none" fill="currentColor"><path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0"></path></svg>
                        </div>
                        
                    </section>
                </main>
           </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value="resouces/dist/js/scripts.js"/>"></script>
    </body>
</html>