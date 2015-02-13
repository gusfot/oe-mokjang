
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />

<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function cancel() {
		yesorno = confirm("이페이지에서 나가시겠습니까?")
		if (yesorno == true) {
			location.reload();
		}
	}

	function reload() {
		location.reload();
	}
	function modify() {
		var deptName = $("input[name=deptName]").val();
		var highDept = $("select[name=highDept]").val();
		yesorno = confirm("정보를 수정하시겠습니까11?");
		if (yesorno == true) {
			$.ajax({
				type : "POST",
				url : "modify.oe",
				data : ({
					deptName : deptName,
					parentSeq : highDept,
					deptSeq : '${dept.deptSeq}'
				}),
				success : function(response) {
					if (response==true) {
						alert('정보가 수정되었습니다');
						location.href = "list.oe?group=${group}";
					} else {
						alert('실패하였습니다');	
						location.href = "list.oe?group=${group}";

					}
				}
			});
		}
	}
	function removeDept() {
		yesorno = confirm("삭제 하시겠습니까?");
		if (yesorno == true) {
			$.ajax({
				type : "GET",
				url : "remove.oe?deptSeq=${dept.deptSeq}",
				success : function(response) {
					alert(response);
					if (response == true) {
						alert('삭제되었습니다');
						location.href = "list.oe?group=${group}";
					} else {
						alert('실패_하였습니다');
						location.href = "list.oe?group=${group}";
					}
				}
			});
		}
	}
</script>
</head>
<body>
	<%-- <%@ include file="../include/header.jsp"%> --%>
	<!-- 	<div class="layerPopupDetail"> -->
	<div class="layerPopup">
		<div class="layerHead">
			<h2>부서정보</h2>
			<a href="#" onclick="reload()"><span>×</span></a>
			<div class="line"></div>
		</div>
		<div class="container">
			<div class="page-header">
				<form class="form-horizontal" role="form" action="/user/modify.oe"
					method="post" name="modify_form">

					<div class="form-group">
						<label class="col-sm-2" for="deptName">교구이름</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="deptName"
								name="deptName" value="${dept.deptName}">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2" for="memberName">하위그룹개수</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="deptTotalNum"
								name="deptTotalNum" value="${deptTotalNum}개" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2" for="gyogu">담당 교구장</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="roleName"
								name="roleName" value="OOO" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2" for="highDept">상위부서</label>
						<div class="col-sm-10">
							<select class="form-control" id="highDept" name="highDept">
								<option value="${parentDept.deptSeq}">${parentDept.deptName}
								</option>
								<c:forEach var="list" items="${pageList.items}" varStatus="s">
									<option value="${list.deptSeq}">${list.deptName}</option>
								</c:forEach>
							</select>
						</div>
					</div>

	<!-- 
		  <div class="form-group">
		  	<label class="col-sm-2" >직분</label>
		    <div class="col-sm-10">
			   <label class="radio-inline">
				  <input type="radio" name="role" id="role1" value="1"> 교구장 
				</label>
					<label class="radio-inline">
					  <input type="radio" name="role" id="role2" value="2"> 목자
					</label>
					<label class="radio-inline">
					  <input type="radio" name="role" id="role3" value="3"> 목장원 
					</label>
			</div>
		  </div>
		-->
				</form>
				<input type="button" class="btn btn-default" onclick="modify()"	value="수정"> 
				<input type="button" class="btn btn-default" onclick="removeDept()" value="삭제"> 
				<input type="button" class="btn btn-default" onclick="cancel()" value="취소">

			</div>
</body>
</html>