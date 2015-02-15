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
  <div class="col-md-3">
      <div class="form-group">
        <label for="inputEmail3" class="col-sm-3 control-label">교구</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputEmail3" placeholder="교구">
        </div>
      </div>
      <div class="form-group">
        <label for="deptSeq" class="col-sm-3 control-label">목장</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" name="deptSeq" id="deptSeq" placeholder="목장">
        </div>
      </div>
      <div class="form-group">
        <label for="worshipDt" class="col-sm-3 control-label">집회일시</label>
        <div class="col-sm-8">
          <input type="date" class="form-control" name="worshipDt" id="worshipDt" placeholder="집회장소">
        </div>
      </div>
      <div class="form-group">
        <label for="worshipPlace" class="col-sm-3 control-label">집회장소</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" name="worshipPlace" id="worshipPlace" placeholder="집회장소">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword6" class="col-sm-3 control-label">마음열기</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword6" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword7" class="col-sm-3 control-label">찬송인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword7" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword8" class="col-sm-3 control-label">말씀인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword8" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword9" class="col-sm-3 control-label">사역인도</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword9" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword10" class="col-sm-3 control-label">다음장소</label>
        <div class="col-sm-8">
          <input type="text" class="form-control" id="inputPassword10" placeholder="">
        </div>
      </div>
      <div class="form-group">
        <label for="offering" class="col-sm-3 control-label">목장선교헌금</label>
        <div class="col-sm-8">
          <input type="number" class="form-control" name="offering" id="offering" placeholder="원">
        </div>
      </div>
      <div class="form-group">
     	 <label for="etcReportContent" class="col-sm-3 control-label">기타보고사항</label>
        <div class="col-sm-8">
          <textarea rows="" cols="" id="etcReportContent"></textarea>
        </div>
      </div>
  </div>
  <div class="col-md-7">
	<table class="table table-bordered">
      <caption>Optional table caption.</caption>
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
          <th>번호</th>
          <th>목장원이름</th>
          <th>목장집회참석</th>
          <th>주일예배참석</th>
          <th>목장새등록자</th>
          <th>8주차참석자</th>
          <th>목장등록후 교회등록</th>
          <th>양육1권수료자</th>
          <th>학교양육1권수료</th>
          <th>교회등록</th>
          <th>교회등록후목장참석</th>
          <th>번식하여나가는분</th>
          <th>식당봉사</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
	      	<tr>
		      <th scope="row">${i.count}</th>
	          <td>${user.userName}
	          	<input type="hidden" class="form-control" name="reports[${i.index}].userId" value="${user.userId}" placeholder="목장새등록자">
	          </td>
	          <td>
	          	<select name="reports[${i.index}].mokjangYn" class="form-control">
				  <option value="Y">O</option>
				  <option value="N">X</option>
				</select>
		      </td>
	          <td>
	          	<select name="reports[${i.index}].sundayYn" class="form-control">
				  <option value="Y">O</option>
				  <option value="N">X</option>
				</select>
		      </td>
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