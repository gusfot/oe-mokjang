<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원등록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">


<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="jquery.jstree.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function overlapId(){
		alert("in");
		var userId = $("input[name=userId]").val();
	$.ajax({
				type : "GET",
				url : "overlapUserId.oe?userId=" + userId,
				success : function(result) {
					alert("success");
					if(result==true){
						alert("사용가능한 아이디입니다");
					}
					else{
						alert("이미 존재하는 아이디입니다");
						$("input[name=userId]").val("");
						$("input[name=userId]").focus();
					}
					}
			});
	}
</script>
</head>
<body>
	<%-- <div class="headWrap">
				<div class="head">
					<!--로고-->
					<h1>회원가입</h1>
					<!--커스톰메뉴영역-->
					<ul class="customMenu">
						<li>환영합니다. <span>${pageList.items[0].userName}</span> <span>목자</span>님, 오늘은 <span>2014년 8월 13일 목요일</span>입니다.</li>
						<li>로그아웃</li>
						<li>비밀번호변경</li>
					</ul>
					<!--메인메뉴영역-->
					<ul class="gnbMenu">
						<li><a href="#"><h3>목장원관리</h3></a></li>
						<li><a href="#"><h3>목장관리</h3></a></li>
						<li><a href="list.oe"><h3>성도관리</h3></a></li>
						<li><a href="#"><h3>코드관리</h3></a></li>
						<li><a href="#"><h3>통계관리</h3></a></li>						
						<li><a href="#"><h3>공지관리</h3></a></li>
					</ul>
				</div>
			</div> --%>
	<%@ include file="../include/header.jsp"%>
	<header class="jumbotron subhead" id="overview"> </header>

	<div class="container">
		<div class="page-header">
			<form class="form-horizontal" role="form" action="/user/regist.oe"
				method="post">
				<div class="form-group">
					<label class="col-sm-2" for="email">이메일 주소</label>
					<div class="col-sm-10">
						<input type="email" class="col-sm-10 form-control" id="email"
							name="email" placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberId">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userId" name="userId"placeholder="Id 입력">
						<input type="button" class="btn btn-default" value="ID중복확인" onclick="overlapId()">
					</div>
	
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="password">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="비밀번호">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberName">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" name="name"
							placeholder="이름">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="gender">성별</label>
					<div class="col-sm-10">
						<select class="form-control" id="gender" name="gender">
							<option value="1">남자</option>
							<option value="2">여자</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="exampleInputPassword1">직업</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="job" name="job"
							placeholder="직업">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="address">집주소</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="address"
							name="address" placeholder="집주소">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="birthday">생일</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="birthday"
							name="birthday" placeholder="생일">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="mobilePhone">휴대폰</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="mobilePhone"
							name="mobilePhone" placeholder="휴대폰">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="homePhone">집전화번호</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="homePhone"
							name="homePhone" placeholder="집전화번호">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="gyogu">교구</label>
					<div class="col-sm-10">
						<select class="form-control" id="gyogu" name="gyogu">
							<option value="5">소하1교구</option>
							<option value="6">소하2교구</option>
							<option value="6">소하3교구</option>
							<option value="10">소하4교구</option>
							<option value="7">소하5교구</option>
							<option value="8">소하6교구</option>
							<option value="11">광명1교구</option>
							<option value="12">대학청년교구</option>
							<option value="13">교육부</option>
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
				<button type="submit" class="btn btn-default">등록</button>
				<a href="list.oe"><intput type="button" class="btn btn-default" />취소</a>
			</form>
		</div>
	</div>
</body>
</html>