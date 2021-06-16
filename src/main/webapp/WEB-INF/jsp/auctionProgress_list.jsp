<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTopDist.jsp" %><!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>

<body>
<!-- ======= Header ======= -->
<section id="hero" class="bg-light h-100 overflow-scroll" >
    <div id="layoutDefault">
        <div id="layoutDefault_content h-100 overflow-scroll">
            <%@ include file="IncludeQuickHeader.jsp" %>
            <!-- End Header -->
            <main>
                <!-- Page Header-->
                <div class="page-header-content pt-15">
                    <div class="container mt-n10 mb-4">
                        <h5 class="page-header-text text-orange">
                            <i class="fas fa-coins text-yellow mr-2"></i>나의 거래내역을 확인해보세요.</h5>
                        <ul class="list-group list-group-flush list-group-careers overflow-hidden">
                            <li class="list-group-item bg-light align-items-center">
                                <table class="text-center table table-vcenter custom-table">
                                    <thead>
                                    <tr class="bg-gray-200 rounded-circle">
                                        <th class="w-7 text-nowrap">번호</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">참가자</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">제시가</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">낙찰</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="auction" items="${auctionProgressList}" varStatus="status">
                                        <tr>
                                            <td class="px-3 text-nowrap">
                                                <c:out value="${status.count}"/>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${auction.buyerId}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${auction.price}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                            <form method="post" action="<c:url value='/auctionFinish.do'>
                                                <c:param name='postIdx' value='${auction.postIdx}'/>
                                                <c:param name='buyerId' value='${auction.buyerId}'/>
                                                <c:param name='sellerId' value='${postRegister.registerId}'/>
                                                </c:url>">
                                            <c:if test="${userId eq postRegister.registerId and auction.price eq maxPrice.price}">  
                                            	                                        	
                                                <input type = "submit" value = "낙찰하기" onClick = "goAuction('<c:url value='/auctionFinish.do'>
                                                <c:param name='postIdx' value='${auction.postIdx}'/>
                                                <c:param name='buyerId' value='${auction.buyerId}'/>
                                                <c:param name='sellerId' value='${postRegister.registerId}'/>
                                                </c:url>')" />     
                                                          
                                            </c:if>
                                            <c:if test="${userId ne postRegister.registerId}">
                                                낙찰불가 
                                            </c:if>
                                            </form>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                     </tbody>
                                </table>
                            </li>
                        </ul>
                        <c:if test="${empty auctionProgressList}">
                            <p class="text-center page-header-text align-middle pt-10 pb-15">
                                경매에 참여한 사람이 없습니다.
                            </p>
                            <hr class="mb-0">
                        </c:if>
                    </div>
                </div>
            </main>
        </div>
    </div>
</section>
</body>