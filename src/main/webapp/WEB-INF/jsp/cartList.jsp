<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTop.jsp" %>
<body>
<!-- ======= Header ======= -->
<section id="hero" class="bg-light h-100 overflow-scroll">
    <div id="layoutDefault">
        <div id="layoutDefault_content h-100 overflow-scroll">
            <%@ include file="IncludeQuickHeader.jsp" %>
            <!-- End Header -->
            <main>
                <!-- Page Header-->
                <div class="page-header-content pt-2">
                    <div class="container mt-n10 mb-4">
                        <ul class="list-group list-group-flush list-group-careers overflow-hidden">
                            <li class="list-group-item bg-light align-items-center">
                                <table class="text-center table table-vcenter custom-table">
                                    <thead>
                                    <tr class="bg-secondary rounded-circle ">
                                        <th class="text-light w-7 text-nowrap pt-3 pb-3">번호</th>
                                        <th class="text-light w-7 d-none d-lg-table-cell text-nowrap pt-3 pb-3">물건 이름
                                        </th>
                                        <th class="text-light w-7 d-none d-lg-table-cell text-nowrap pt-3 pb-3">가격</th>
                                        <th class="text-light w-7 d-none d-lg-table-cell text-nowrap pt-3 pb-3">장바구니에서
                                            삭제
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="cartList" items="${cartList}" varStatus="status">
                                        <tr>
                                            <td class="px-3 text-nowrap">
                                                <c:out value="${status.count}"/>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <a class=" text-primary" href="<c:url value="/select_product_myList.do">
                                            		<c:param name='postIdx' value='${cartList.postIdx}'/>
                                            	    </c:url>">
                                                    <c:out value="${cartList.title}"></c:out></a>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${cartList.price}"></c:out>원
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <a class=" text-danger" href="<c:url value="/cartDelete.do">
                                            		<c:param name='postIdx' value='${cartList.postIdx}'/>
                                            		<c:param name='buyerId' value='${cartList.registerId}'/>
                                            	</c:url>">삭제하기&nbsp;<i class="fas fa-trash-alt"></i></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </li>
                        </ul>
                        <c:if test="${empty cartList}">
                            <p class="text-center page-header-text align-middle pt-10 pb-15">
                                장바구니에 담은 물건이 없습니다.
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
<script
        src="https://kit.fontawesome.com/6478f529f2.js"
        crossorigin="anonymous">
</script>