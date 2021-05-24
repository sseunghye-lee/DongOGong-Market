<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTop.jsp" %>
<body>
<!-- ======= Header ======= -->
<%@ include file="IncludeQuickHeader.jsp" %>
<!-- End Header -->
<section id="hero" class="clearfix">
    <div class="container h-100">
        <div>
            <main>
                <!-- Page Header-->
                <header class="page-header page-header-light">
                    <div class="page-header-content pt-5">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-7">
                                    <h1 class="page-header-title">로그인</h1><br>
                                    <form action='<c:url value="/login.do"/>' method="POST" class="form-inline justify-content-center">
                                           <c:if test="${!empty loginForwardAction}">
    										  <input type="hidden" name="forwardAction"
       											 value='<c:url value="${loginForwardAction}"/>' />
										    </c:if>
                                        <div class="form-group flex-fill mb-2 ">
                                            <label class="sr-only" for="inputEmail"><strong>ID</strong></label>
                                            <input class="mt-2 form-control form-control-solid w-100 log-email"
                                                   id="userId" name="userId"
                                                   type="text" placeholder="Enter your ID..." 
                                                   onkeyup="login()" aria-describedby="inputEmail"/>
                                            <label class="pt-3 sr-only" for="inputPassword"><strong>PASSWORD</strong></label>
                                            <input class="mt-2 form-control form-control-solid w-100" 
                                            	   id="password" name="password"
                                            	   type="password" placeholder="Enter your password..."
                                                   onkeyup="login()" aria-describedby="inputPassword"/>
                                        </div>
                                         <div class="mt-4 btn btn-light btn-outline-dark font-weight-500 mb-2 w-100" id="btnLogin">
                                         <input type="submit" value="로그인"/>
                                        </div>                        
 									    </form>
                                        <div class="mt-2 d-inline d-inline-block a-join float-right text-align-right">
                                            <p class="page-header-text small mb-0 float-right text-align-right">
                                            <a href='<c:url value="/join.do"/>'>회원 가입</a>
                                        </div>
                                        <!--                                    <p class="page-header-text small mb-0 w-100">-->
                                        <!--                                        <a class="a-password w-75" href="#!">비밀번호가 기억나지 않습니다.</a>-->
                                        <!--                                        <a class="a-join w-75" href="#!">회원 가입</a>-->
                                        <!--                                    </p>-->                                 
                                </div>
                            </div>
                        </div>
                    </div>
                </header>
            </main>
        </div>
    </div>
</section>

</body>
</html>