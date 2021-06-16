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
<title>회원가입</title>
<link type="text/css" href="resources/css/styles.css" rel="stylesheet" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
<body>
<!-- Update form  -->
	<div class="container">
                <!-- Contact Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">JOIN OUR WEBSITE</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Contact Section Form-->
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <form:form modelAttribute="userInfoForm" action="${targstUrl}" method="POST">
                          <form:errors cssClass="error" />
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Id</label>
                                    <h4>ID</h4>
                                    <form:input class="form-control" path="userInfo.userId" placeholder="ID" type="text" />
                                    <form:errors class="form-control" path="userInfo.userId" cssClass="error"/>
                                    <!--<form:button class ="idChk" id="idChk" type="button" onclick="fn_idChk();" value="N" >중복확인</form:button>-->
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>                        
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Name</label>
                                    <h4>NAME</h4>
                                    <form:input class="form-control" path="userInfo.name" placeholder="NAME" type="text" />
                                     <form:errors class="form-control" path="userInfo.name" cssClass="error"/>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>NickName</label>
                                    <h4>NICKNAME</h4>
                                    <form:input class="form-control" placeholder="NICKNAME" path="userInfo.nickName" type="text" />
                                     <form:errors class="form-control" path="userInfo.nickName" cssClass="error"/>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>phone</label> 
                                    <h4>PHONE</h4>
                                    <form:input class="form-control" path="userInfo.phone" type="text" placeholder="PHONE" />
                                     <form:errors class="form-control" path="userInfo.phone" cssClass="error"/>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>password</label>
                                    <h4>PASSWORD</h4>
                                    <form:input class="form-control" path="userInfo.password"  type="password" placeholder="PASSWORD" /> 
                                     <form:errors class="form-control" path="userInfo.password" cssClass="error"/>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                             <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                   <label>Repeat password</label>
                                    <h4>REPEATPASSWORD</h4>
                                   <form:input class="form-control" path="repeatedPassword" type="password" placeholder="REPEAT_PASSWORD"  /> 
                                   <form:errors class="form-control" path="repeatedPassword" cssClass="error"/>   
                                   <p class="help-block text-danger"></p>
                               </div>
                            </div>
                         
                            <br />
                            <div class="btn btn-primary btn font-weight-500 mb-2 w-100">
                   				<input id="btnLogin" type="submit" class="btn btn-primary font-weight-bolder w-100" value="등록하기"/>
                			</div>
                        </form:form>
                    </div>
                </div>
            </div>
</body>
</html>
