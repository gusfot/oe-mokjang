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
        <h1>Marketing stuff!</h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p><a class="btn btn-lg btn-success" href="#">Get started today</a></p>
      </div>
      <div class="container">
		<button type="button" class="btn btn-primary"" onclick="javascript:location.href='/report/regist.oe';">목장 보고서 작성하기 </button>
      </div>
      <!-- Example row of columns -->
      <div class="row">
       <table class="table table-bordered">
        <thead>
          <tr>
          	<th>번호</th>
          	<th>주차</th>
            <th>목장</th>
            <th>점수합계</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="report" items="${reports}" varStatus="s">
          <tr>
            <td>${s.count}</td>
            <td>${report.weeks}</td>
            <td></td>
            <td></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      </div>

      <!-- Site footer -->
      <%@ include file="../include/footer.jsp" %>
      <!-- //Site footer -->
    </div> <!-- /container -->
	
</body>
</html>