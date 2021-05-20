<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
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
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->
                        <form:form modelAttribute="" method="post">
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Name</label>
                                    <h4>NAME</h4><input class="form-control" id="name" type="text" />
                                    <!-- <form:input path="name" class="form-control" />
                                    <form:errors path="name" />  -->
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Email</label> 
                                    <h4>EMAIL</h4><input class="form-control" id="email" type="email" placeholder="EMAIL" required="required" data-validation-required-message="Please enter your email address." />
                                    <!-- <form:input path="email" class="form-control" />  
                                    	<form:errors path="email"/>
                                    -->
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>PASSWORD</label>
                                    <h4>PASSWORD</h4><input class="form-control" id="phone" type="tel" placeholder="PASSWORD" required="required" data-validation-required-message="Please enter your phone number." />
                                    <!--<form:password path="password" class="form-control" showPassword="true" />
                                    <form:errors path="password"/> -->
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                             <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>PASSWORD CHECK</label>
                                    <h4>PASSWORD CHECK</h4><input class="form-control" id="phone" type="tel" placeholder="PASSWORD CHECK" required="required" data-validation-required-message="Please enter your phone number." />
                                    <!-- <form:password path="passwordConfirm" showPassword="true" />
                                    <form:errors path="passwordConfirm"/>-->
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                         
                            <br />
                            <div id="success"></div>
                            <div class="form-group"><button class="btn btn-primary btn-xl" id="okayButton" type="submit">OKAY</button>
                            <button class="btn btn-primary btn-xl" id="cancelButton" type="submit">CANCEL</button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
</body>
</html>