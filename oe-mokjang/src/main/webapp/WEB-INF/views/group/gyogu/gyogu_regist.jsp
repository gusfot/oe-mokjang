	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
function regist(){
	var groupName = $("input[name=groupName]").val();
	var parish = $("input[name=parish]").val();
	var highDept =$("select[name=highDept]").val();
	$.ajax({
		
		type:"POST",
		url:"regist.oe",
		data:({deptName : groupName , parentSeq: highDept, }),
		success:function(response){
			location.href = "list.oe?group=${groupName}";
		}
	});

}

function cancel(){
	yesorno = confirm("이페이지에서 나가시겠습니까?")
	if(yesorno == true){
			history.go(-1);
	}
	 
}
</script>
</head>
<body>
	<div class="layerPopup">
	<div class="layerHead">
						<h2>부서정보</h2>
						<div class="line"></div>
					</div>
	<div class="container">
		<div class="page-header">
			<form class="form-horizontal" role="form" action="/user/modify.oe"method="post"name="modify_form">
			
				<div class="form-group">
					<label class="col-sm-2" for="groupName">${group}이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="groupName" name="groupName" >
					</div>
				</div>
			<div class="form-group">
					<label class="col-sm-2" for="gyogu">담당 ${group}장</label>
					<div class="col-sm-10">
					<input type="text" class="form-control" id="parish"name="parish">
					</div> 
				</div>	
			 
				
			<div class="form-group">
					<label class="col-sm-2" for="highDept">상위부서</label>
					<div class="col-sm-10">
						<select class="form-control" id="highDept" name="highDept">
							<option value="0"></option>
							<c:forEach var = "list" items="${pageList.items}" varStatus="s">
							<option value="${list.deptSeq}">${list.deptName}</option>
							</c:forEach>
						</select>
					</div>
				</div>				
		
				<input type="button" class="btn btn-default" onclick="regist()"value="추가">
				<input type="button" class="btn btn-default" onclick="cancel()" value="취소">
		</div>
</body>
</html>