<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="IncludeTopDist.jsp" %>
<body>
<!-- ======= Header ======= -->
<section id="hero" class="clearfix h-100 overflow-scroll">
    <div id="layoutDefault">
        <div id="layoutDefault_content h-100 overflow-scroll">
            <%@ include file="IncludeQuickHeader.jsp" %>
            <!-- End Header -->
            <main>
                <!-- Page Header-->
                <div class="page-header-content pt-5">
                    <div class="row justify-content-around">
                        <div class="col-lg-7">
                            <h1 class="page-header-title fw-bolder">상품 등록</h1><br>
                            <form class="form-inline justify-content-center">
                                <div class="form-group flex-fill mb-2 justify-content-between">
                                    <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->
                                    <%--                                            <form:form modelAttribute="post" action="${targetUrl}" method="post">--%>
                                    <%--                    <form id="contactForm" name="sentMessage" novalidate="novalidate">--%>
                                    <form method="post" action="<c:url value="/apply/registerPost_product.do"/>">
                                    <p class="d-inline text-align-left fw-bold">카테고리 선택 (해당 카테고리 검색 시 게시물이
                                        보여집니다.)</p>
                                    <div class="float-right d-inline-block d-inline-flex float-right d-inline-block">
                                        <select class="custom-select w-auto mr-2" id="borderType" name="borderType">
                                            <option value="elec">가전제품</option>
                                            <option value="clothes">의류</option>
                                            <option value="cosmetic">화장품</option>
                                            <option value="furniture">가구</option>
                                            <option value="toy">장난감</option>
                                            <option value="stationery">문구류</option>
                                            <option value="book">도서</option>
                                            <option value="others">기타</option>
                                        </select>
                                    </div>
                                    <div class="form-group flex-fill mb-2 mr-2 mt-8">
                                        <p class="d-inline text-align-left w-25 pt-4 fw-bold">상품명 입력</p>
                                        <label class="sr-only" for="inputName">상품명 입력</label>
                                        <input
                                                class="form-control form-control-solid w-75" id="title" name="title"
                                                type="text" placeholder="Enter the Product Name" onkeyup="apply()"
                                                aria-describedby="inputEmail" required="required"/>
                                        <p class="d-inline text-align-left w-25 fw-bold bottom pt-4 m-0">가격</p>
                                        <label class="sr-only" for="inputPrice">가격</label>
                                        <input class="form-control form-control-solid w-75" id="price" name="price"
                                               type="text" placeholder="Enter the cost. (WON)"
                                               required="required"
                                               data-validation-required-message="Please enter the Cost."/>
                                        <br/>
                                        <p class="d-inline text-align-left w-25 fw-bold m-0">상품 설명</p>
                                        <label class="sr-only" for="inputDescription">상품 설명</label>
                                        <textarea class="form-control w-75 mt-2" style="resize: none"
                                                  id="content" name="content" rows="5"
                                                  type="text" placeholder="Description"
                                                  required="required"
                                                  data-validation-required-message="Please enter a Description."></textarea>

                                        <div class="form-group flex-fill mb-2 justify-content-between w-100">
                                            <div class="row mr-0 ml-0">
                                                <div class="flex-column mr-0 ml-0 pl-0 pt-4 mr-4">
                                                    <p class="d-inline text-align-left fw-bold ml-0 pl-0">
                                                        사진 첨부 (대표 사진 1장)</p>
                                                    <p class="text-primary ml-2 d-inline text-align-left fw-bold">*실제 상태가 보여질 수 있는 이미지를
                                                        첨부하는 것을 권장합니다.</p>
                                                </div>
                                                <a class="w-100 pl-0 text-danger">반드시 사진 선택 후 등록 버튼을 눌러주세요.
                                                    사진이 나오지 않을 경우, 버튼을 다시 클릭해주세요.</a>
                                            </div>

                                            <input class="pt-4" type="file" name="photoUrl" id="photoUrl" accept="image/*"
                                                   onchange="ResizeImage()"/>
                                            <input class="mt-4" type="button" value="사진 등록" onclick="ResizeImage()"/>
                                            <label class="sr-only">사진 첨부
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </label>
                                        </div>
                                        <%--                                        <input class="w-100 mt-4 form-control h-100"--%>
                                        <%--                                               id="img"--%>
                                        <%--                                               type="text"--%>
                                        <%--                                               placeholder="Upload Image ..."--%>
                                        <%--                                               required="required"--%>
                                        <%--                                               data-validation-required-message="Please enter your Image."/>--%>
                                        <div class="mt-3 flex-column"><img src="" id="output"></div>
                                    </div>
                                    <div class="mt-4 btn btn-light btn-outline-dark font-weight-500 mb-2 w-100"
                                         id="btnApply">
                                        <a href="<c:url value="/apply/registerPost_product.do"/>"><strong>등록하기</strong></a>
                                     </div>
                                    <%--                                            </form:form>--%>

                            </form>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </div>
</section>
<script src="/assets/vendor/aos/aos.js"/>
<script src="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"/>
<script src="/assets/vendor/glightbox/js/glightbox.min.js"/>
<script src="/assets/vendor/isotope-layout/isotope.pkgd.min.js"/>
<script src="/assets/vendor/php-email-form/validate.js"/>
<script src="/assets/vendor/purecounter/purecounter.js"/>
<script src="/assets/vendor/swiper/swiper-bundle.min.js"/>
<!-- Template Main JS File -->
<script src="<c:url value="/assets/js/main.js"/>"></script>
<script type="text/javascript">
    function ResizeImage() {
        var filesToUpload = document.getElementById('photoUrl').files;
        var file = filesToUpload[0];

        // 문서내에 img 객체를 생성합니다
        var img = document.createElement("img");
        // 파일을 읽을 수 있는 File Reader 를 생성합니다
        var reader = new FileReader();

        // 파일이 읽혀지면 아래 함수가 실행됩니다
        reader.onload = function (e) {
            img.src = e.target.result;
            // HTML5 canvas 객체를 생성합니다
            var canvas = document.createElement("canvas");
            var ctx = canvas.getContext("2d");
            // 캔버스에 업로드된 이미지를 그려줍니다
            ctx.drawImage(img, 0, 0);
            // 최대폭을 400 으로 정했다고 가정했을때
            // 최대폭을 넘어가는 경우 canvas 크기를 변경해 줍니다.
            var MAX_WIDTH = 150;
            var MAX_HEIGHT = 150;
            var width = img.width;
            var height = img.height;
            if (width > height) {
                if (width > MAX_WIDTH) {
                    height *= MAX_WIDTH / width;
                    width = MAX_WIDTH;
                }
            } else {
                if (height > MAX_HEIGHT) {
                    width *= MAX_HEIGHT / height;
                    height = MAX_HEIGHT;
                }
            }
            canvas.width = width;
            canvas.height = height;
            // canvas에 변경된 크기의 이미지를 다시 그려줍니다.
            var ctx = canvas.getContext("2d");
            ctx.drawImage(img, 0, 0, width, height);
            // canvas 에 있는 이미지를 img 태그로 넣어줍니다
            var dataurl = canvas.toDataURL("image/png");
            document.getElementById('output').src = dataurl;
        }
        reader.readAsDataURL(file);
    }
</script>
</body>
</html>