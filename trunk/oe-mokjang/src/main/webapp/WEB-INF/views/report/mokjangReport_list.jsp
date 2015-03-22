<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목장 보고서 입력</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- Custom styles for this template -->
 <link href="/resources/assets/css/dashboard.css" rel="stylesheet">
</head>
<body>

<div>
	<h1>목장집회 보고서 <small>(하나님은 정직한 사람을 복 주십니다.)</small></h1>
</div>
<form class="form-horizontal" id="mokjangReportForm">
<div class="containerWrap">
			<div class="headWrap">
			<%@ include file="../include/header.jsp" %>
			</div>
	<div class="row">
		<div class="col-xs-6 col-sm-4">저번주${weeks-1}번째주</div>
		  <div class="col-xs-6 col-sm-4">이번주${weeks}번째주</div>
		  <!-- Optional: clear the XS cols if their content doesn't match in height -->
		  <!-- <div class="clearfix visible-xs-block"></div> -->
		  <div class="col-xs-6 col-sm-4">다음주</div>
	  <div class="col-md-9">
		<table class="table table-bordered">
	      <caption>개인별 보고서.</caption>
	      <colgroup>
	      	<col width="2%">
	      	<col width="2%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="5%">
	      	<col width="*">
	      </colgroup>
	      <thead>
	        <tr>
	          <th class="text-center"><small>목장원<br />이름</small></th>
	          <th class="text-center"><small>목장집회<br />참석</small></th>
	          <th class="text-center"><small>주일예배<br />참석</small></th>
	        </tr>
	      </thead>
	      <tbody>
	      	<c:forEach var="report" items="${mokjangReport.reports}" varStatus="i" >
		      	<tr>
		          <td><span class="label label-primary <c:choose><c:when test="${user.role.roleName eq '목자'}">label-success</c:when><c:when test="${user.role.roleName eq '예비목자'}">label-info</c:when><c:otherwise>label-default</c:otherwise></c:choose> ">${report.userId}</span></td>
		          <td>${report.mokjangYn}</td>
		          <td>${report.sundayYn}</td>
		      	</tr>
	      	</c:forEach>
	      </tbody>
	    </table>
	  </div>
	</div>
	</div>
</form>


    <!-- Bootstrap core JavaScript
    ================================================== -->
	<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- Latest compiled and minified JavaScript -->
    <!-- <script src="/resources/assets/js/docs.min.js"></script> -->
    
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
	var report = {
		mokjang : {
			regist : function() {
				var $f = $('#mokjangReportForm'),
				 formData;
				 
				formData = $f.serialize();
				 
				 $.ajax({
					 url: '/report/mokjang/regist.oe',
					 type: 'POST',
					 data: formData,
					 dataType : 'json',
					 success:function(result){
					   alert(result.success);
					 }
					});
			
			}
		}
	}
	
	</script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="/resources/assets/js/ie10-viewport-bug-workaround.js"></script> -->
  </body>
</html>