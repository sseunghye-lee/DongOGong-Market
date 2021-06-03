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
</head>
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
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->
                        <form:form modelAttribute="userInfoForm" action="${targstUrl}" method="POST">
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Id</label>
                                    <h4>ID</h4><form:input class="form-control" path="userInfo.userId" placeholder="ID" type="text" />
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>                        
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Name</label>
                                    <h4>NAME</h4><form:input class="form-control" path="userInfo.name" placeholder="NAME" type="text" />
                              
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>NickName</label>
                                    <h4>NICKNAME</h4>
                                    <form:input class="form-control" placeholder="NICKNAME" path="userInfo.nickName" type="text" />
                                    <button id="confirmNickName" type="submit">중복확인</button>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>PHONE</label> 
                                    <h4>PHONE</h4><form:input class="form-control" path="userInfo.phone" type="text" placeholder="PHONE" />
                                   
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>PASSWORD</label>
                                    <h4>PASSWORD</h4><form:input class="form-control" path="userInfo.password"  type="password" placeholder="PASSWORD" />
                                   
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                             <!--  <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>PASSWORD CHECK</label>
                                    <h4>PASSWORD CHECK</h4><input class="form-control" id="passwordCheck" type="password" placeholder="PASSWORD CHECK"  />
                                    
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            -->
                            <br />
                            <div id="success"></div>
								<div class="form-group">
									<div class="btn btn-primary btn-xl font-weight-500 mb-2 w-100">
										<input id="btnLogin" type="submit" value="등록하기"/>
									</div>
								</div>
                        </form:form>
                    </div>
                </div>
            </div>
</body>
</html>
