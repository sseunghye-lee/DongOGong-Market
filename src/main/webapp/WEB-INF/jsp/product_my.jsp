<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ include file="IncludeTopDist.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
   
   <title>product_my</title>    
    <!-- Core theme CSS (includes Bootstrap)-->
    <link type="text/css" href="resources/css/styles.css" rel="stylesheet" />
<script>
function goProduct(targetUri) {
    form.action = targetUri;
    form.submit();
}
</script>
</head>
<body>
 <!-- Contact Section-->
          <section class="page-section" id="contact">
            <div class="container">
                <!-- Contact Section Heading-->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Contact Me</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Contact Section Form-->
                <div class="row">
                <form name="form" method="POST">
                    <div class="col-lg-8 mx-auto">
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->
                        
                        <form id="contactForm" name="sentMessage" novalidate="novalidate">
                           
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                   <input type="file" name="photoUrl" accept="image/*">
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Product Name</label>
                                    <input class="form-control" name="title" id="ProductName" value="${productMy.title}" type="text" placeholder="Product Name" required="required" data-validation-required-message="Please enter your Product Name." />
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Cost</label>
                                    <input class="form-control" id="Cost" name="price" value="${productMy.price}" type="text" placeholder="Cost" required="required" data-validation-required-message="Please enter your phone Minimum Cost." />
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                                    <label>Description</label>
                                    <textarea class="form-control" name="content" id="Description" rows="5" type="text" placeholder="Description" required="required" data-validation-required-message="Please enter a Description.">${productMy.content}</textarea>
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <br />
                            <div id="success"></div>
                            <div class="form-group">
                                 <input type = "submit" value = "UPDATE" class="btn btn-primary btn-xl" 
                                 onClick = "goProduct('<c:url value='/productUpdate.do'><c:param name='postIdx' value='${productMy.postIdx}'/></c:url>')"/>
                     			 
                       
                     			 
                     			 <a class="btn btn-primary btn-xl" href="<c:url value='/apply/MyPost_product.do'/>">BACK<i class="ml-2 fas fa-arrow-left"></i></a>
                     
                                
                            </div> 
                        </form>
                    </div>
                    </form>
                </div>
            </div>
        </section>
</body>
</html>