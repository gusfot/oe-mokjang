<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
          	<th rowspan="2">번호</th>
          	<th rowspan="2">이름</th>
            <th rowspan="2">제자와<br /> 목장원</th>
            <th colspan="5">예배</th>
            <th colspan="3">기도</th>
            <th rowspan="2">성경 </th>
            <th rowspan="2">성미 </th>
            <th rowspan="2">목장<br />인도 </th>
            <th rowspan="2">양육<br />인도 </th>
            <th rowspan="2">교회<br />등록 </th>
            <th rowspan="2">특별<br />행사 </th>
          </tr>
          <tr>
            <th>주일 낮</th>
            <th>목장<br/>집회</th>
            <th>저녁 </th>
            <th>수요 </th>
            <th>가정 </th>
            <th>새벽 </th>
            <th>철야 </th>
            <th>골방 </th>
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
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
	        	<td>3</td>
        	</tr>
        </tfoot>
        <tbody>
          <tr class="active">
            <td>1</td>
            <td>김현래</td>
            <td>목자</td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
            <td>2 </td>
          </tr>
          <tr class="success">
          	<td>2</td>
          	<td>송민주</td>
          	<td>목장원 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          	<td>1 </td>
          </tr>
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