<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User 목록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/paging-1.js"></script>
<script type="text/javascript">
 	var item = null
	var html = '';
	function greeting2() {
		$.ajax({ // 이부분부터 비동기통신을 하게 된다. 위에서 설정한 값들을 입력후
			type : "GET",
			url : 'rest/user/list',
			success : function(msg) { //성공시 이 함수를 호출한다.
				for (var i = 0; i < msg.items.length; i++) {
					item = msg.items[i];
					html += '<tr>';
					html += '	<td >' + item.userName + '</td>';
					html += '	<td>' + item.regDt + '</td>';
					html += '	<td>' + item.userId + '</td>';
					html += '	<td>' + item.addr + '</td>';
					html += '	<td>' + item.cellPhone + '</td>';
					html += '	<td>' + item.job + '</td>';
					html += '	<td>' + item.birth + '</td>';
					html += '	<td>' + item.regTime + '</td>';
					html += '</tr>';
					$('#tbody-item-list').html(html);
				}
				var page = paging(msg.page,msg.pageSize,msg.totalNumOfItems);
				$('#ul-paging').html(page);
			}
		});
	};
	$(document).ready(function() {
		greeting2();
	});
	
	function modal(){
		$('#myModal').modal('show');
		
	}
</script>
</head>
<body>
	<div class="page-header">
		<h1>
			Example page header <small>Subtext for header</small>
		</h1>
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
				<table class="table table-hover">
					<thead style="background-color: #efefef;">
						<tr >
							 <th >이름</th>
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
				<div class="text-center">
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
	</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">Modal title</h4>
      </div>
      <div class="modal-body">
        <%@ include file="../user/regist.jsp" %>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>