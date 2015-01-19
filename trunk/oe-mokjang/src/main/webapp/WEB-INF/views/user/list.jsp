<%@ page language="java" contentType="text/html; charset=EUC-KR"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>User 목록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript">

/* 	var html = '';
	var item = "${userList}";
 	for (var i=0; i<"${userList}".length; i++) {
		item = "userList"+[i];
		
		html += '<tr>';
		html += '	<td>' + item.userName + '</td>';
		html += '	<td>' + item.regDy + '</td>';
		html += '	<td>' + item.userId + '</td>';
		html += '	<td>' + item.addr + '</td>';
		html += '	<td>' + item.job + '</td>';
		html += '	<td>' + item.cellPhone + '</td>';
		html += '	<td>' + item.birth + '</td>';
		html += '	<td>' + item.regTime + '</td>';
		html += '</tr>';
	} 
	
    $(document).ready(function () {
    	$('#tbody-item-list').html(html);
    	});  
 */
 
 function greeting2() {
	 
	 $.ajax({                          // 이부분부터 비동기통신을 하게 된다. 위에서 설정한 값들을 입력후
	        type: "GET",
	        url: 'register.oe',
	        success: function(msg) {  //성공시 이 함수를 호출한다.
	        	alert(msg)
	        	alert("success") ;
	       }
	    });
 }
    
 function greeting() {
			var i ="${userList}"; 	
    		var html = ''
    		  html+='	<input type = button value = ShowModalDialog onclick = showModalPop(';
    	      html+= '"son.html"';	
    	      html+=')>';
    	      $('#pagingbar').html(html);
    		alert("${userList[0].userName}");
    		}

</script>
</head>
<body>
	<div class="page-header">
	  <h1>Example page header <small>Subtext for header</small></h1>
	</div>
	<div>
		<nav class="navbar navbar-inverse" role="navigation">
  		<div class="collapse navbar-collapse navbar-ex8-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>
          </ul>
        </div>
</nav>

<div class="container">
	
	<div class="col-md-9">
		<h5>
			<span class="glyphicon glyphicon-list-alt"></span> 목록
		</h5>
		<table class="table table-bordered">
			<colgroup>
				<col width="100" id="name"/>
				<col width="200" id = "reg_datd" />
				<col width="150" id="user_id" />
				<col width="300" id="addr" align="center" />
				<col width="250" id="cell_Phone" />
				<col width="100" id="job"/>
				<col width="180" id="birth" />
				<col width="180" id="reg_itme" />
			</colgroup>
			<thead style="background-color: #efefef;">
				<tr>
					<th>이름</th>
					<th>교회등록일</th>
					<th>사용자ID</th>
					<th>주소</th>
					<th>휴대전화번호</th>
					<th>직업</th>
					<th>생년월일</th>
					<th>등록시간</th>
				</tr>
			</thead>
			<tbody id="tbody-item-list">
				
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<div id = "pagingbar" class="text-center">
			<ul class="pagination" id="ul-paging">
				<li><a href="#">&laquo;</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li class="active"><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">&raquo;</a></li>
			</ul>
		</div>
	</div>
			</div>
			<input type="button" value="AjaxTeest" onclick="greeting2()">
</div>
		
</body>
</html>