<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTop.jsp" %>
<script>
$(document).ready(function() {
   $("#submit").on("click", function() {
      if($("#userPassword").val() == "") {
         alert("비밀번호를 입력해주세요.");
         $("#userPassword").focus();
         return false;
      }
   });
})
</script>
 <%@ include file="IncludeTop.jsp" %>
</head>
<body>
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
                                    <h1 class="page-header-title">회원탈퇴</h1><br>
                                    <form action='<c:url value="/deleteUser.do"/>' method="POST" class="form-inline justify-content-center">
                                        <div class="form-group flex-fill mb-2 ">
                                            <label class="sr-only" for="userId"><strong>ID</strong></label>
                                            <input class="mt-2 form-control form-control-solid w-100 log-email" id="userId" name="userId"
                                                   type="text" placeholder="Enter your ID..." aria-describedby="inputEmail"/>
                                            <label class="pt-3 sr-only" for="userPassword"><strong>PASSWORD</strong></label>
                                            <input class="mt-2 form-control form-control-solid w-100" id="password" name="password"
                                                   type="password" placeholder="Enter your password..." aria-describedby="inputPassword"/>
                                        </div>
                                        <input class="mt-4 btn btn-light btn-outline-dark font-weight-500 mb-2 w-100"
                                               id="btnDelete" type="submit" value="회원탈퇴"/>
                                        <input class="mt-4 btn btn-light btn-outline-dark font-weight-500 mb-2 w-100"
                                               id="btnDelete" onClick="history.go(-1)" value="취소"/>       
                                    </form>
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