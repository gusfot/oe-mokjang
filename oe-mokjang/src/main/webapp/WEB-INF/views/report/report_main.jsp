<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목장 보고서 목록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	    <!-- header -->
		<%@ include file="../include/header.jsp" %>
		<!-- //header -->

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>메인페이지</h1>
        <p class="lead">
        <c:choose>
       		<c:when test="${isSubmited eq true }">목장보고서 제출 완료</c:when>
       		<c:otherwise>목장보고서 미제출</c:otherwise>
       </c:choose>
        </p>
      </div>
       <span>목장보고서 메인페이지</span>
       <%-- 
       <c:choose>
       		<c:when test="${isSumited eq true }"><span>목장보고서 제출 완료</span></c:when>
       		<c:otherwise><span>목장보고서 제출 완료</span></c:otherwise>
       </c:choose>
               --%>
      <div class="container">
       <c:choose>
       		<c:when test="${isSubmited eq true }"><span>목장보고서 제출 완료</span></c:when>
       		<c:otherwise><button type="button" class="btn btn-primary"" onclick="javascript:location.href='/report/mokjang/regist.oe';">목장 보고서 작성하기 </button></c:otherwise>
       </c:choose>
		
		<button type="button" class="btn btn-primary"" onclick="javascript:location.href='/dept/children.oe';">하위 목장 내역</button>
		<button type="button" class="btn btn-primary"" onclick="javascript:location.href='/user/registForm.oe';">새신자 추가</button>
		
      </div>
      <!-- Example row of columns -->
     

      <!-- Site footer -->
      <%@ include file="../include/footer.jsp" %>
      <!-- //Site footer   tst -->
    </div> <!-- /container -->
	
</body>
</html>