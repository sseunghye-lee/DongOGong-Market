<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IncludeTopDist.jsp" %>
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
        <title>product_my_list</title>
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
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">   
                                <a class="btn font-weight-500 ml-lg-4 btn-teal" href="product_list.jsp">BACK<i class="ml-2" data-feather="arrow-right"></i></a>
                            </div>
                        </div>
                    </nav>
                    <!-- Page Header-->    
                    <section class="bg-light py-10">
                        <div class="container">
                            <h2 class="mb-4">Product_my_list</h2>
                            <div class="row">
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$115</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/tG36rvCeqng/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Gray Bicycle</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 2 days ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$29</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/nHOz7sp5nHE/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Hanimex Camera</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 3 days ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$999</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/GkFQEOubrCo/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Macbook Pro</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 4 hours ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$19</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/MCUOp3o4dgk/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Assorted Skin Care</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 29 minutes ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$59</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/w9IHmVSNBfU/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Brown Ukulele</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 3 days ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$249</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/bpg-ngqrPc8/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Leather Sofa</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 2 hours ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$219</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/fZuleEfeA1Q/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Green Suede Sofa</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 2 days ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$89</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/rjhAiP3cj9E/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Metal Chairs</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 5 days ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$89</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/5ba6j8d_oXY/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Wireless Earbuds</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 1 month ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$34,999</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/ESoE_buQvNQ/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Muscle Car</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 1 week ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$69</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/zuE9jsaVHuA/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Hardwood Dresser</div>
                                            <div class="text-xs text-gray-500">Waterlow, CO &middot; 2 weeks ago</div>
                                        </div></a
                                    >
                                </div>
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100" href="product_my.jsp"
                                        ><div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">$9,999</div>
                                        <img class="card-img-top" src="https://source.unsplash.com/WuRsjF4iZK0/800x500" alt="..." />
                                        <div class="card-body p-3">
                                            <div class="card-title small mb-0">Classic Motorcycle</div>
                                            <div class="text-xs text-gray-500">Readcaster, CO &middot; 1 week ago</div>
                                        </div></a
                                    >
                                </div>
                            </div>
                            <div class="mb-10">
                                <a class="text-arrow-icon" href="#!">See more deals near you<i data-feather="arrow-right"></i></a>
                            </div>
                        </div>
                    </section>
                </main>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>
