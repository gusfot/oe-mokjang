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
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function checkfield(){
		alert($('#gyogu').val());
		var userId = $("input[name=userId]").val();
	     var phonestr = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
		
		if(document.regist_form.email.value==""){
			alert("이메일주소를 입력하세요");
			document.regist_form.email.focus();
			exit;
			
		}else if(document.regist_form.userId.value==""){
			alert("아이디를 입력하세요");
			document.regist_form.userId.focus();
			exit;
			
		}else if(document.regist_form.password.value==""){
			alert("비밀번호를 입력하세요");
			document.regist_form.password.focus();
			exit;
			
		}else if(document.regist_form.name.value==""){
			alert("이름을 입력하세요");
			document.regist_form.name.focus();
			exit;
			
		}else if(document.regist_form.job.value==""){
			alert("직업을 입력하세요");
			document.regist_form.job.focus();
			exit;
			
		}else if(document.regist_form.address.value==""){
			alert(" 주소를 입력하세요");
			document.regist_form.address.focus();
			exit;
			
		}else if(document.regist_form.birthday.value==""){
			alert(" 생일을 입력하세요");
			document.regist_form.birthday.focus();
			exit;
			
		}else if(document.regist_form.mobilePhone.value==""){
			alert(" 핸드폰 번호를 입력하세요");
			document.regist_form.mobilePhone.focus();
			exit;
			
		}else if(document.regist_form.homePhone.value==""){
			alert(" 집전화 번호를 입력하세요");
			document.regist_form.homePhone.focus();
			exit;
			
		}
	     
	     if(phonestr.test(document.regist_form.mobilePhone.value)==false){
	    	 alert("핸드폰번호 형식이 맞지않습니다 ");
	    	 document.regist_form.mobilePhone.focus();
				exit;
	     }
	     if(phonestr.test(document.regist_form.homePhone.value)==false){
	    	 alert(" 전화번호 형식이 맞지않습니다 ");
	    	 document.regist_form.homePhone.focus();
				exit;
	     } 
		$.ajax({
					type : "GET",
					url : "overlapUserId.oe?userId=" + userId,
					success : function(result) {
						if(result==true){
							alert('success');
						document.regist_form.submit();
						}
						else{
							alert("아이디가 이미 존재합니다");
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
	<%@ include file="../../include/header.jsp"%>
	<header class="jumbotron subhead" id="overview"> </header>

	<div class="container">
		<div class="page-header">
			<form class="form-horizontal" role="form" action="/user/regist.oe"	method="post" name="regist_form">
				<div class="form-group">
					<label class="col-sm-2" for="email">이메일 주소</label>
					<div class="col-sm-10">
						<input type="email" class="col-sm-10 form-control" id="email"name="email" placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberId">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userId" name="userId"placeholder="Id 입력">
					</div>
	
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="password">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password"name="password" placeholder="비밀번호">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberName">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" name="name"placeholder="이름">
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
						<input type="text" class="form-control" id="job" name="job"placeholder="직업">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="address">집주소</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="address"name="address" placeholder="집주소">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="birthday">생일</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="birthday"	name="birthday" placeholder="생일">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="mobilePhone">휴대폰</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="mobilePhone"	name="mobilePhone" placeholder="휴대폰(010-0000-000)형식에 맞춰서입력해주세요">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="homePhone">집전화번호</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="homePhone"name="homePhone" placeholder="집전화번호(000-0000-0000)형식에 맞춰서 입력해주세요">
					</div>
				</div>
						<div class="form-group">
					<label class="col-sm-2" for="regDate">등록일</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="regDate"	name="regDate" value="${regdate}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="gyogu">목장</label>
					<div class="col-sm-10">
						<select class="form-control" id="gyogu" name="gyogu">
							<c:forEach var = "list" items="${deptList}" varStatus="s">
							<option value="${list.deptSeq}">${list.deptName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="role">직분</label>
					<div class="col-sm-10">
						<select class="form-control" id="role" name="role">
							<option value="5">목자</option>
							<option value="6">예비목자</option>
							<option value="7">목장원</option>
							<option value="8">새신자</option>
						</select>
					</div>
						<input type="hidden" value="0" id="flag" name="flag">
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
				<input type="button" class="btn btn-default" onclick="checkfield()" value="등록">
				<a href="list.oe"><intput type="button" class="btn btn-default" />취소</a>
		</div>
	</div>
</body>
</html>