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
<div class="row">
	  <div class="col-md-7 table-responsive ">
	  <table class="table table-bordered">
	  	<caption>목장집회보고서.</caption>
	  	 <colgroup>
	      	<col width="20%">
	      	<col width="30%">
	      	<col width="20%">
	      	<col width="30%">
	      </colgroup>
	    <tr>
	    	<td>목장</td>
	    	<td>${sessionUserVO.deptName}</td>
	    	<td>교구</td>
	    	<td></td>
	    </tr>
	     <tr>
	    	<td>집회일시</td>
	    	<td>${mokjangReport.worshipDt }</td>
	    	<td>집회장소</td>
	    	<td>${mokjangReport.worshipPlace }</td>
	    </tr>
	     <tr>
	    	<td>마음열기</td>
	    	<td>${mokjangReport.welcomeUserName }</td>
	    	<td>찬송인도</td>
	    	<td>${mokjangReport.worshipUserName }</td>
	    </tr>
	     <tr>
	    	<td>말씀인도</td>
	    	<td>${mokjangReport.wordUserName}</td>
	    	<td>사역인도</td>
	    	<td>${mokjangReport.workUserName}</td>
	    </tr>
	     <tr>
	    	<td>다음장소</td>
	    	<td>${mokjangReport.nextWorshipPlace}</td>
	    	<td>목장선교헌금</td>
	    	<td>${mokjangReport.offering}</td>
	    </tr>
	     <tr>
	    	<td>기타보고사항</td>
	    	<td colspan="3">${mokjangReport.etcReportContent}</td>
	    </tr>
	  </table>
	</div>
  
  <div class="col-md-7">
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
          <th class="text-center"><small>번호</small></th>
          <th class="text-center"><small>목장원<br />이름</small></th>
          <th class="text-center"><small>목장집회<br />참석</small></th>
          <th class="text-center"><small>주일예배<br />참석</small></th>
          <th class="text-center"><small>목장<br />새등록자</small></th>
          <th class="text-center"><small>8주차<br />참석자</small></th>
          <th class="text-center"><small>목장등록후<br />교회등록</small></th>
          <th class="text-center"><small>양육<br />1권수료</small></th>
          <th class="text-center"><small>학교양육<br />1권수료</small></th>
          <th class="text-center"><small>교회<br />등록</small></th>
          <th class="text-center"><small>교회등록후<br />목장참석</small></th>
          <th class="text-center"><small>번식하여<br />나가는분</small></th>
          <th class="text-center"><small>식당<br />봉사</small></th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach var="report" items="${mokjangReport.reports}" varStatus="i" >
	      	<tr>
		      <th scope="row">${i.count}</th>
	          <td><span class="label label-primary">${report.userId}</span></td>
	          <td>${report.mokjangYn}</td>
	          <td>${report.sundayYn}</td>
	          <td>
			    	<input type="number" class="form-control" name="" placeholder="목장새등록자">
	          </td>
	          <td>
	          		<input type="number" class="form-control" placeholder="8주차참석자">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="목장등록후 교회등록">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="양육1권수료자">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="학교양육1권수료">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="교회등록">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="교회등록후목장참석">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="번식하여나가는분">
	          </td>
	          <td>
	          	<input type="number" class="form-control" placeholder="식당봉사">
	          </td>
	      	</tr>
      	</c:forEach>
      </tbody>
    </table>
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