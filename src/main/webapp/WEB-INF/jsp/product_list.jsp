<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTopDist.jsp" %>
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
    <title>product_list</title>
    <link href="resources/dist/css/styles.css" rel="stylesheet"/>
    <link rel="icon" type="image/x-icon" href="resources/dist/assets/img/favicon.png"/>
    <script data-search-pseudo-elements defer
            src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.24.1/feather.min.js"
            crossorigin="anonymous"></script>
    <script>
    function goCart(targetUri) {
        form.action = targetUri;
        form.submit();
     }
    </script>
</head>
<body>
<div id="layoutDefault">

    <div id="layoutDefault_content">
        <main>
            <!-- Navbar-->
            <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light justify-content-between">
                <div class="container justify-content-between py-4">
                    <a class="navbar-brand text-dark">DongOGong Market</a>
                    <div class="d-inline-block collapse navbar-collapse justify-content-end text-align-right"
                         id="navbarSupportedContent">
                        <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                           href="<c:url value="/apply/MyPost_product.do"/>">MY</a>
                        <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                           href="<c:url value="/apply/product.do"/>">NEW</a>
                        <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                           href="<c:url value="/cartSend.do/"/>">CART</a>
                        <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                           href="<c:url value="/"/>">HOME</a>

                    </div>
                </div>
            </nav>
            <!-- Page Header-->
            <section class="bg-light py-10">
                <div class="container">

                    <h2 class="mb-5 font-weight-bolder">Product Categories</h2>
                      <form method="get" action="<c:url value="/jsp/category_product.do"/>">
                        
                    <div class="row">
                        <div class="col-lg-3 col-md-6 mb-5">
                           <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="elec" href="<c:url value="/jsp/category_product.do"/>">
                             <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-red text-white w-2 mb-2">
                                         <i class="fas fa-blender-phone"></i>
                                    </div>
                                    <div class="small text-gray-600 mt-3">가전제품(Home Appliances)</div>
                                </div>
                             
                            </a>
                            
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5"> 
                              <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="clothes" href="<c:url value="/jsp/category_product.do"/>">
                         
                                <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-orange text-white mb-2">
                                        <i class="fas fa-tshirt"></i>
                                    </div>
                                    <div class="small text-gray-600 mt-3">옷(Clothes)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5">
                          <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="cosmetic" href="<c:url value="/jsp/category_product.do"/>">
                              <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-yellow text-white mb-2"><i
                                            class="fas fa-gift"></i></div>
                                    <div class="small text-gray-600 mt-3">화장품(Cosmetics)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5">
                            <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="furniture" href="<c:url value="/jsp/category_product.do"/>">
                            <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-green text-white mb-2">
                                        <i class="fas fa-couch"></i></div>
                                    <div class="small text-gray-600 mt-3">가구(Furniture)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                           <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="toy" href="<c:url value="/jsp/category_product.do"/>">
                             <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-cyan text-white mb-2">
                                        <i class="fas fa-robot"></i></div>
                                    <div class="small text-gray-600 mt-3">장난감(Toy)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                          <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="stationery" href="<c:url value="/jsp/category_product.do"/>">
                              <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-blue text-white mb-2">
                                        <i class="fas fa-pencil-alt"></i></div>
                                    <div class="small text-gray-600 mt-3">문구류(Stationery)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                          <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="book" href="<c:url value="/jsp/category_product.do"/>">
                              <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-purple text-white mb-2">
                                        <i class="fas fa-book"></i>
                                    </div>
                                    <div class="small text-gray-600 mt-3">도서(Book)</div>
                                </div>
                            </a>
                        </div>
                        <div class="col-lg-3 col-md-6">
                          <input type="submit" class="card lift border-bottom-lg border-red col-lg-12" id="borderType" name="borderType" value="others" href="<c:url value="/jsp/category_product.do"/>">
                              <div class="card-body text-center">
                                    <div class="icon-stack icon-stack-xl bg-pink text-white mb-2"><i
                                            class="fas fa-shopping-cart"></i></div>
                                    <div class="small text-gray-600 mt-3">기타(Other)</div>
                                </div>
                            </a>
                        </div>
                    </div>
                    </form>
                    <br>
                    <h2 class="mt-5 mb-5 font-weight-bolder">Product_list</h2>
                    <div class="row">
                        <c:forEach var="getPostList" items="${getPostList}">
                            <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                <a class="card lift h-100" href="product_detail.jsp">
                                    <div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">${getPostList.price}</div>
                                     <img name="photoUrl" src="/resources/images/${getPostList.photoUrl}" height=170 alt="..." />
                                           
                                    <div class="card-body p-3">
                                        <div class="card-title small mb-0">${getPostList.title}</div>
                                        <div class="text-xs text-gray-500">${getPostList.content} </div>
                                    </div>
                                       <input type = "submit" value = "장바구니" onClick = "goCart('<c:url value='/cartSend.do'><c:param name='postIdx' value='${post.postIdx}'/><c:param name='price' value='${post.price}'/><c:param name='title' value='${post.title}'/></c:url>')" /> 
                               	   </a>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="mb-10">
                        <a class="text-arrow-icon" href="#!">See more deals near you<i
                                data-feather="arrow-right"></i></a>
                    </div>


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