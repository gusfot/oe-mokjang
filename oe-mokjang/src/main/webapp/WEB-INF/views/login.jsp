<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>로그인</title>
<!-- Latest compiled and minified CSS -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<!-- Optional theme -->
	<!-- Latest compiled and minified JavaScript -->
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<!-- Custom styles for this template -->
    <link href="/resources/bootstrap/css/signin.css" rel="stylesheet">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

	<script type="text/javascript">
	function login(){
		var $userId = $("input[name=userId]"),
			 $userPw= $("input[name=password]");
		
		if($userId===''){
			alert('아이디를 입력하세요');
			$userId.val('');
			$userId.focus();
			return;
		}
		
		if($userPw===''){
			$password.val('');
			$password.focus();
			return;
		}
		
		 $.ajax({
			type:"POST",
			url : "/login/login.oe",
		 	data : ({userId : $userId.val(), pw : $userPw.val()}),
			dataType : 'json',
			success:function(result){
			 	if(result.success){
			 		location.href="/main.oe";
				}else{
					alert(result.message);
					$userId.val('');
					$userId.focus();
					$password.val('');
					
				}
			}
		}); 	
	}
	
	function enterLogin(e) {
		if(e.keyCode==13){
			login();
		return false;
		}
		else{
		return true;			
		}
	}
	
	
	</script>
</head>
 <body>
<%@ include file="include/header.jsp"%>
<header class="jumbotron subhead" id="overview" ></header>
    <div class="container">
      <form class="form-signin" role="form" method="post" action="#" id="form-login" name="form-login">
        <h2 class="form-signin-heading">52 목장관리시스템</h2>
        <input type="text" class="form-control" placeholder="아이디를 입력해주세요"onkeypress="return enterLogin(event)"  name="userId" id="userId" required autofocus>
        <input type="password" class="form-control" placeholder="비밀번호를 입력해주세요 "  onkeypress="return enterLogin(event)" name="password" id="password" required>
        <label class="checkbox">
          <!-- <input type="checkbox" value="remember-me"> 아이디 저장하기 -->
        </label>
        <input type="button" class="btn btn-lg btn-primary btn-block" onclick="login();" value="로그인">
        <%-- <button class="btn btn-lg btn-primary btn-block" type="button" onclick="javascript:location.href='/member/regist.oe'">회원가입 ${sessionId.userName}3</button> --%>
      </form>
    </div>
     <!-- /container -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>