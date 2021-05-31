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
<meta charset="utf-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Aution_my</title>
   <!-- Core theme CSS (includes Bootstrap)-->
    <link type="text/css" href="resources/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
    
</head>
<body>
   <section>
      <div>
          <!-- Contact Section Heading-->
            <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">My Auction</h2>
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
                  <form method="post" action="<c:url value="/auctionUpdate.do"/>">
                     <div class="control-group">
                        <div class="form-group floating-label-form-group controls mb-0 pb-2">
                           <input type="file" name="photoUrl" accept="image/*" value="${myAuction.photoUrl}">
                        </div>
                     </div>
                     <div class="control-group">
                           <div class="form-group floating-label-form-group controls mb-0 pb-2">
                               <label>Product Name</label>
                           <input class="form-control"  name="title" id="ProductName" type="text" value = "${myAuction.title}" placeholder="Product Name" required="required" data-validation-required-message="Please enter your email Product Name." />
                                <p class="help-block text-danger"></p>
                        </div>
                     </div>
                     <div class="control-group">
                           <div class="form-group floating-label-form-group controls mb-0 pb-2">
                               <label>Minimum Cost</label>
                                <input class="form-control" name="price" id="MinimumCost" type="text" value="${myAuction.price}" placeholder="Minimum Cost" required="required" data-validation-required-message="Please enter your phone Minimum Cost." />
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                     <div class="control-group">
                           <div class="form-group floating-label-form-group controls mb-0 pb-2">
                               <label>Description</label>
                               <input class="form-control" name="content" id="Description" rows="5" type="text" placeholder="Description" required="required" 
                               data-validation-required-message="Please enter a Description." value="${myAuction.content}" />
                                <!--  
                                <textarea class="form-control" name="content" id="Description" rows="5" type="text" placeholder="Description" required="required" data-validation-required-message="Please enter a Description.">
                                	${myAuction.content}
                                </textarea>-->
                                <p class="help-block text-danger"></p>
                           </div>
                        </div>
                         <br />
                        <div id="success"></div>
                        <div class="form-group">
                        <button onclick="<c:url value="/auctionUpdate.do"/>" class="btn btn-primary btn-xl" id="sendMessageButton" type="submit">Update</button>
                        <a class="btn btn-primary btn-xl" href="<c:url value="/auction.do"/>">Cancel</a>
                        <!--  
                     <button onclick="<c:url value="/auction.do"/>" class="btn btn-primary btn-xl" id="sendMessageButton" type="submit">Cancel</button>  -->                         </div>
                  </form>
               </div>
            </div>
      </div>
   </section>
</body>
</html>