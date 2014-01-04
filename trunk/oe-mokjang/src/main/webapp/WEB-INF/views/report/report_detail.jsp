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
        <caption>이번주 목장보고서 등록</caption>
       <colgroup>
       		<col width="4%" />
       		<col width="8%" />
       		<col width="8%" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       		<col width="" />
       </colgroup>
       <thead>
          <tr>
            <th>번호</th>
            <th>목장원이름</th>
            <th>목장집회<br />참석</th>
            <th>목장<br />새등록자</th>
            <th>8주<br />참석자</th>
            <th>목장등록후<br />교회등록</th>
            <th>양육1권<br />수료자</th>
            <th>학교양육<br />1권수료</th>
            <th>교회등록</th>
            <th>교회등록후<br />목장참석</th>
            <th>목장집회<br />1명감소</th>
            <th>번식하여<br />나가는분</th>
            <th>식당봉사</th>
          </tr>
          
        </thead>
        <tfoot>
        	<tr>
	        	<td colspan="3">점수 합계</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
        	</tr>
        </tfoot>
        <tbody>
        <c:forEach var="personalReport" items="${report.personalReports}" varStatus="s">
          <tr class="active">
            <td>${s.count}</td>
            <td>${personalReport.id}</td>
            <td>${personalReport.attendMokjang}</td>
            <td>${personalReport.enrollMokjang}</td>
            <td>${personalReport.attendMokjangAfterChurch}</td>
            <td>${personalReport.attend8weeksMokjang}</td>
            <td>${personalReport.graduateNurtureMokjang}</td>
            <td>${personalReport.graduateSchoolChurch}</td>
            <td>${personalReport.enrollChurch}</td>
            <td>${personalReport.enrollChurchAfterEnrollMokjang}</td>
            <td>${personalReport.decreaseAttendantMokjangChurch}</td>
            <td>${personalReport.sentChurch}</td>
            <td>${personalReport.restaurantServiceChurch}</td>
          </tr>
          </c:forEach>
          <tr class="warning">
          </tr>
          <tr class="danger">
          </tr>
        </tbody>
      </table>
      </div>

      <!-- Site footer -->
      <%@ include file="../include/footer.jsp" %>
      <!-- //Site footer -->
    </div> <!-- /container -->
	
</body>
</html>