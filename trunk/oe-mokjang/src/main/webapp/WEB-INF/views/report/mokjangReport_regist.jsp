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
	<h2>목장집회 보고서 (하나님은 정직한 사람을 복 주십니다.)</h2>
</div>
<form class="form-horizontal" id="mokjangReportForm">
<div class="row">
  
  <div class="col-md-7 table-responsive">
	  <table class="table table-bordered">
	  	<caption>목장집회보고서.</caption>
	  	 <colgroup>
	      	<col width="20%">
	      	<col width="30%">
	      	<col width="20%">
	      	<col width="30%">
	      </colgroup>
	    <tr>
	    	<td class="text-center">목장</td>
	    	<td>
	    		<input type="text" class="form-control" id="deptName" value="${sessionUserVO.deptName}" readOnly>
          		<input type="hidden" name="deptSeq" id="deptSeq" value="${sessionUserVO.deptSeq}">
          	</td>
	    	<td class="text-center">교구</td>
	    	<td><input type="text" class="form-control" id="inputEmail3" placeholder="교구" value=""></td>
	    </tr>
	     <tr>
	    	<td class="text-center">집회일시</td>
	    	<td>
				<input type="date" class="form-control" name="worshipDt" id="worshipDt" placeholder="집회장소">
			</td>
	    	<td class="text-center">집회장소</td>
	    	<td>
				<input type="text" class="form-control" name="worshipPlace" id="worshipPlace" placeholder="집회장소">
			</td>
	    </tr>
	     <tr>
	    	<td class="text-center">마음열기</td>
	    	<td>
				<input type="text" class="form-control" name="welcomeUserName" id="welcomeUserName" placeholder="">
			</td>
	    	<td class="text-center">찬송인도</td>
	    	<td>
				<input type="text" class="form-control" name="worshipUserName" id="worshipUserName" placeholder="찬송인도">
			</td>
	    </tr>
	     <tr>
	    	<td class="text-center">말씀인도</td>
	    	<td>
				<input type="text" class="form-control" name="wordUserName" id="wordUserName" placeholder="말씀인도">
			</td>
	    	<td class="text-center">사역인도</td>
	    	<td>
				<input type="text" class="form-control" name="workUserName" id="workUserName" placeholder="사역인도">
			</td>
	    </tr>
	     <tr>
	    	<td class="text-center">다음장소</td>
	    	<td>
				<input type="text" class="form-control" name="nextWorshipPlace" id="nextWorshipPlace" placeholder="다음장소">
			</td>
	    	<td class="text-center">목장선교헌금</td>
	    	<td>
				<input type="number" class="form-control" name="offering" id="offering" placeholder="원">
			</td>
	    </tr>
	     <tr>
	    	<td class="text-center">기타보고사항</td>
	    	<td colspan="3">
				<textarea rows="" cols="" name="etcReportContent" id="etcReportContent"></textarea>
			</td>
	    </tr>
	  </table>
	</div>
	
  <div class="col-md-7">
	<table class="table table-bordered">
      <caption>개인별 보고서</caption>
      <colgroup>
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
      	<col width="5%">
      	<col width="*">
      </colgroup>
      <thead>
        <tr>
          <th><small>번호</small></th>
          <th><small>목장원이름</small></th>
          <th><small>목장집회참석</small></th>
          <th><small>주일예배참석</small></th>
          <th><small>목장새등록자</small></th>
          <th><small>8주차참석자</small></th>
          <th><small>목장등록후 교회등록</small></th>
          <th><small>양육1권수료자</small></th>
          <th><small>학교양육1권수료</small></th>
          <th><small>교회등록</small></th>
          <th><small>교회등록후목장참석</small></th>
          <th><small>번식하여나가는분</small></th>
          <th><small>식당봉사</small></th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
	      	<tr>
		      <th scope="row">${i.count}</th>
	          <td><span class="label label-primary">${user.userName}${user.role.roleName}</span>
	          	<input type="hidden" class="form-control" name="reports[${i.index}].userId" value="${user.userId}" placeholder="목장새등록자">
	          </td>
	          <td>
				<input type="checkbox" class="form-control" name="reports[${i.index}].mokjangYn" value="Y">
		      </td>
	          <td>
				<input type="checkbox" class="form-control" name="reports[${i.index}].sundayYn" value="Y">
		      </td>
	          <td>
			    	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          		<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
	          </td>
	          <td>
	          	<input type="checkbox" class="form-control" name="" value="Y">
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
							   if(result.success) {
								   location.href = '/report/mokjang/detail.oe?seq='+result.seq;;
							   }else {
								   alert(result.message);
							   }
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