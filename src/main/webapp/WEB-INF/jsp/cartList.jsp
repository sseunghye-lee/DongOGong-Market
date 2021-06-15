<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="IncludeTopDist.jsp" %>
<%@ include file="IncludeTop.jsp" %>
<body>
<%@ include file="IncludeQuickHeader.jsp" %>
<!-- ======= Header ======= -->
<section id="hero" class="clearfix h-100 overflow-scroll">
    <div id="layoutDefault">
        <div id="layoutDefault_content h-100 overflow-scroll">
            <%@ include file="IncludeQuickHeader.jsp" %>
            <!-- End Header -->
            <main>
                <!-- Page Header-->
                <div class="page-header-content pt-5">
                    <div class="container mt-n10 mb-4">
                        <ul class="list-group list-group-flush list-group-careers overflow-hidden">
                            <li class="list-group-item bg-light align-items-center">
                                <table class="text-center table table-vcenter custom-table">
                                    <thead>
                                    <tr class="bg-gray-200 rounded-circle">
                                        <th class="w-7 text-nowrap">번호</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">물건 이름</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">가격</th>
                                        <th class="w-7 d-none d-lg-table-cell text-nowrap">장바구니에서 삭제</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="cartList" items="${cartList}" varStatus="status">
                                        <tr>
                                            <td class="px-3 text-nowrap">
                                                <c:out value="${status.count}"/>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${cartList.title}"></c:out>
                                            </td>
                                             <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                                <c:out value="${cartList.price}"></c:out>
                                            </td>
                                            <td class="px-3 d-none d-lg-table-cell text-nowrap">
                                            	<a href="<c:url value="/cartDelete.do"><c:param name='postIdx' value='${cartList.postIdx}'/></c:url>">삭제하기</a>
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