<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<c:set var="targetUrl"><c:url value="/index.do" /></c:set> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>마이페이지 수정</title>
<link type="text/css" href="resources/css/styles.css" rel="stylesheet" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
</head>
<body>
	<!-- Update form  -->
	<div class="container">
	    <!-- Contact Section Heading-->
	    <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Change My Information</h2>
	    <!-- Icon Divider-->
	    <div class="divider-custom">
	        <div class="divider-custom-line"></div>
	        <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
	        <div class="divider-custom-line"></div>
	    </div>
	    <!-- Contact Section Form-->
	    <div class="row">
	        <div class="col-lg-8 mx-auto">
	                <form method="POST" action="<c:url value="/myPage_change.do"/>">
	                    <div class="control-group">
	                        <div class="form-group floating-label-form-group controls mb-0 pb-2">
	                            <label>Name</label>
	                            <h4>NAME</h4>
	                            <input class="form-control" id="name" name="name" value="${myInfo.name}" type="text" placeholder="NAME" required="required" data-validation-required-message="Please enter your name." />
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    <!-- <div class="control-group">
                        	<div class="form-group floating-label-form-group controls mb-0 pb-2">
                            	<label>NickName</label>
                                <h4>NICKNAME</h4>
                                <input class="form-control" id="nickName" name="nickName" placeholder="NICKNAME" type="text" />
                                <button id="confirmNickName" type="submit">중복확인</button>
                                <p class="help-block text-danger"></p>
                           </div>
                        </div>
                         -->
	                    <div class="control-group">
	                        <div class="form-group floating-label-form-group controls mb-0 pb-2">
	                            <label>Phone</label> 
	                            <h4>PHONE</h4>
	                            <input class="form-control" id="phone" value="${myInfo.phone}" name="phone" type="text" placeholder="PHONE" required="required" data-validation-required-message="Please enter your phone number." />
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    <div class="control-group">
	                        <div class="form-group floating-label-form-group controls mb-0 pb-2">
	                            <label>password</label>
	                            <h4>PASSWORD</h4>
	                            <input class="form-control" id="password" name="password" type="password" placeholder="PASSWORD" required="required" data-validation-required-message="Please enter your password." />
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    <!--
	                     <div class="control-group">
	                        <div class="form-group floating-label-form-group controls mb-0 pb-2">
	                            <label>PASSWORD CHECK</label>
	                            <h4>PASSWORD CHECK</h4><input class="form-control" id="passwordCheck" type="password" placeholder="PASSWORD CHECK" required="required" data-validation-required-message="Please enter your phone number." />
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    -->
	                    <br />
	                    <div id="success"></div>
	                    <div onclick="<c:url value="/myPage_change.do"/>" class="form-group"><button class="btn btn-primary btn-xl" id="okayButton" type="submit">UPDATE</button>
	                    <button class="btn btn-primary btn-xl" id="cancelButton" onClick="history.go(-1)">CANCEL</button>
	                    </div>
	                </form>
	        </div>
	    </div>
	</div>
</body>
</html>