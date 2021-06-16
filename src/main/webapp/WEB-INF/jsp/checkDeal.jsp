<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTopDist.jsp" %>
<body>
<script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
<!-- ======= Header ======= -->
<section id="hero" class="bg-light h-100 overflow-scroll">
    <div id="layoutDefault">
        <div id="layoutDefault_content h-100 overflow-scroll">
            <%@ include file="IncludeQuickHeader.jsp" %>
            <!-- End Header -->
            <main>
                <!-- Page Header-->
                <div class="page-header-content pt-15">
                    <div class="container mt-n10 mb-4">
                        <h5 class="page-header-text text-gray-600 font-weight-bolder"><i class="fas fa-hand-holding-usd fa-2x mr-2"></i>
                            나의 거래내역을 확인해보세요.</h5>
                        <ul class="list-group list-group-flush list-group-careers overflow-hidden">
                            <li class="list-group-item bg-light align-items-center">
                                <table class="text-center table table-vcenter custom-table">
                                    <thead>
                                    <tr class="bg-gray-200 rounded-circle">
                                        <th class="w-7 text-nowrap">번호</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">판매자</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">상품명</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">가격</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">거래내역(일반거래, 경매)</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="transactionsCheckList" items="${transactionsCheckList}"
                                               varStatus="status">
                                        <tr>
                                            <td class="px-3 text-nowrap">
                                                <c:out value="${status.count}"/>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${transactionsCheckList.registerId}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${transactionsCheckList.title}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${transactionsCheckList.price}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:if test="${transactionsCheckList.transactionConfirmation eq 'COMPLETED'}">
                                                    <c:out value="일반거래"></c:out>
                                                </c:if>
                                                <c:if test="${transactionsCheckList.transactionConfirmation eq 'DECIDE'}">
                                                    <c:out value="경매"></c:out>
                                                </c:if>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </li>
                        </ul>
                        <c:if test="${empty transactionsCheckList}">
                            <p class="text-center page-header-text align-middle pt-10 pb-15">
                                거래한 물건이 없습니다.
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