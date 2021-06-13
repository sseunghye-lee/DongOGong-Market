<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IncludeTopDist.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
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
   		<script>
		   	 function goChange(targetUri) {
		         form.action = targetUri;
		         form.submit();
		     }
   		</script>
    </head>
    <body>
        <div id="layoutDefault">
            <div id="layoutDefault_content">
                <main>
                    <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light justify-content-between">
                        <div class="container justify-content-between py-4">
                            <a class="navbar-brand text-dark">DongOGong Market</a>
                            <div class="d-inline-block collapse navbar-collapse justify-content-end text-align-right"
                                 id="navbarSupportedContent">
                                <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline"
                                   href="<c:url value="/apply/product.do"/>">NEW</a>
                                <a class="btn font-weight-500 ml-lg-4 btn-blue-soft p-3 d-inline" href="<c:url value="/"/>">HOME</a>
                                <a class="btn font-weight-500 ml-lg-4 btn-blue p-3 d-inline" href="<c:url value='/apply/PostList_product.do'/>">BACK<i class="ml-2 fas fa-arrow-left"></i></a>
                            </div>
                        </div>
                    </nav>
                    <!-- Page Header-->    
                    <section class="bg-light py-10">
                        <div class="container">
                            <h2 class="mb-5 mt-n2 font-weight-bolder">Product_my_list</h2>
                             <form name="form" method="POST">              
                            <div class="row">
                              <c:forEach var="getPost" items="${getPost}">
                        
                                <div class="col-xl-3 col-lg-4 col-md-6 mb-5">
                                    <a class="card lift h-100">
                                    <div class="card-flag card-flag-dark card-flag-top-right card-flag-lg">${getPost.price}원</div>
                                        <img name="photoUrl" src="/resources/images/${getPost.photoUrl}" height=170 alt="..." />
                                       <div class="card-body p-3">
                                            <div class="card-title small mb-0">${getPost.title}</div>
                                            <div class="text-xs text-gray-500">${getPost.content}</div>
                                        </div>
                                         <input type="submit" value="수정 및 삭제" class="btn-blue-soft border-light" 
                                        	 onClick="goChange('<c:url value='/apply/productMy.do'><c:param name='postIdx' value='${getPost.postIdx}'/></c:url>')"/>
                                   		
                                        </a>
                                </div>
                                 </c:forEach>
                            </div>
                           </form>
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
