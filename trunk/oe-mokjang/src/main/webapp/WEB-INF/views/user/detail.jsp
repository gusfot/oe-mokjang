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
function parent(){
	greeting();
}
$(document).ready(function(){
	parent();
});

function cancel(){
	yesorno = confirm("이페이지에서 나가시겠습니까?")
	if(yesorno == true){
	if('${sessionId.roleSeq}'<=4){
	 location.href='/user/saintList.oe'; 
	}else{
	 	location.href='/user/list.oe';
		}
	}
	 
}
function modify(){
 	var jsuserId = $("input[name=userId]").val();
	var jsuserName = $("input[name=userName]").val();
	var jsaddr = $("input[name=addr]").val();
	var jscellPhone = $("input[name=cellPhone]").val();
	var jshomePhone = $("input[name=homePhone]").val();
	var jsjob = $("input[name=job]").val();
	var jsroleSeq = $("select[name=role]").val();
	var jsbirth = $("input[name=birth]").val();
	var jsemail = $("input[name=email]").val();
	 var jsflag = $("input[name=flag]").val();
 
	 yesorno = confirm("정보를 수정하시겠습니까?");
	if(yesorno == true) {
		$.ajax({
			type : "POST",
			url : "modify.oe",
			data : ({ userId : jsuserId, addr : jsaddr,	cellPhone : jscellPhone, homePhone : jshomePhone, job : jsjob, 
						birth : jsbirth, email : jsemail , flag : jsflag, roleSeq : jsroleSeq }),
			dataType:'json',
			success : function(result) {
				if(result==true){
					alert('수정되었습니다');
					location.href = "list.oe";
				}
				else{
					alert("실패하였습니다");
					exit;
				}
				}
		});
	document.modify_form.submit();
	}
}

</script>
</head>
<body>
<%-- <%@ include file="../include/header.jsp"%> --%>
<!-- 	<div class="layerPopupDetail"> -->
	<div class="layerPopup">
	<div class="layerHead">
						<h2>회원정보</h2>
						<c:if test="${sessionId.roleSeq<=4}">
						<a href="saintList.oe"><span>×</span></a>
						</c:if>
						<c:if test="${sessionId.roleSeq>4}">
						<a href="list.oe"><span>×</span></a>
						</c:if>
						<div class="line"></div>
					</div>
	<div class="container">
		<div class="page-header">
			<form class="form-horizontal" role="form" action="/user/modify.oe"method="post"name="modify_form">
				<div class="form-group">
					<label class="col-sm-2" for="email">이메일 주소</label>
					<div class="col-sm-10">
						<input type="email" class="col-sm-10 form-control" id="email"	name="email" value="${user.email}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberId">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userId" name="userId" value="${user.userId }" readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="memberName">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userName" name="userName"value="${user.userName }">
					</div>
				</div>
				<div class="form-group">	
					<label class="col-sm-2" for="exampleInputPassword1">직업</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="job" name="job"value="${user.job }">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="address">집주소</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="addr"name="addr" value="${user.addr}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="birthday">생일</label>	<div class="col-sm-10">
						<input type="date" class="form-control" id="birth"	name="birth" value="${birth}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="mobilePhone">휴대폰</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="mobilePhone"
							name="cellPhone" value="${user.cellPhone}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="homePhone">집전화번호</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="homePhone"name="homePhone" value="${user.homePhone}">
					</div>
				</div>
			 <div class="form-group">
					<label class="col-sm-2" for="gyogu">목장</label>
					<div class="col-sm-10">
					<input type="text" class="form-control" id="gyogu"name="gyogu" value="${user.department.deptName}" readonly="readonly">
					</div> 
				</div>
				<div class="form-group">
					<label class="col-sm-2" for="flag">제적상태</label>
					<div class="col-sm-10">
						<select class="form-control" id="flag" name="flag">
						<c:if test="${user.flag==0 }">
							<option value=0>등록</option>
							<option value=1>제적</option>
   						</c:if>
   						<c:if test="${user.flag==1}">
							<option value=1>제적</option>
    						<option value=0>등록</option>
   						</c:if>
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
				<input type="button" class="btn btn-default" onclick="modify()"value="수정">
				<input type="button" class="btn btn-default" onclick="cancel()" value="취소">
		</div>
	</div>
	</div>
</body>
</html>