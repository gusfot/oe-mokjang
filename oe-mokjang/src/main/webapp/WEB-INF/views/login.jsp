<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>52소프트 - 목장등록</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" type="text/css" href="/resources/css/common.css"/>
<link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
<link rel="stylesheet" type="text/css" href="/resources/css/responsive-tables.css"/>
<style>
.swipe {overflow: hidden; visibility: hidden; position: relative; }
.swipe-wrap {overflow: hidden; position: relative; }
.swipe-wrap > div { float:left; width:100%; position: relative; }
</style>

<!--<link rel="stylesheet" type="text/css" href="css/popup.html"/>-->
<script type="text/javascript" src="/resources/js/jquery.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="/resources/js/selectric.js"></script>
<script type="text/javascript" src="/resources/js/icheck.js"></script>
<script type="text/javascript" src="/resources/js/ui.js"></script>
<script type="text/javascript" src="/resources/js/responsive-tables.js"></script>
    
</head>

<body>

<!-- Wrapper -->
<div id="wrapper">

	<!-- Wrap -->
	<div id="wrap">
		<!-- Header -->
		<div id="header-wrap">		
			<div id="header">
				<h1><a href="#"><img src="/resources/images/common/logo_oneguard.png" alt="CELL PLUS 목장보고 서비스"/></a></h1>
				<div class="head-info">				
					<button id="sidebar-btn" type="button" class="btn-menu">메뉴</button>				
				</div>		
			</div>
		</div>
		<!-- //Header -->
		<!-- Body-->
		<div id="container">
			
			
			<!-- Content -->
			<div id="contents">
				<!-- Top -->

				<!-- //Top -->
				<!-- Article -->
				<div id="content">
					<p id="cont-left-top"></p><p id="cont-left-btm"></p><p id="cont-right-top"></p>
					<div class="cont-body">
					
					<!-- List -->
					<div class="list-view form">
						<div class="box-point2">

광고						
						</div>
					</div>
					<div class="cont-tit"><h4 class="h4">로그인</h4></div>
					<!-- List -->
					<div class="list-view form">
						<div class="box-point2">
							<ul>
								<li style="width:30%; padding-top:6px;">아이디</li>
								<li style="width:70%; text-align:left;"><input type="text" onkeypress="return enterLogin(event)" name="userId" id="userId" style="width:90%; "/></li>
							</ul>
							<ul>
								<li style="width:30%; padding-top:6px;">패스워드</li>
								<li style="width:70%; text-align:left;"><input type="password" onkeypress="return enterLogin(event)"  name="userPw" id="userPw" style="width:90%;"/></li>
							</ul>
							<ul>
								<li style="width:30%; padding-top:6px;"></li>
								<li style="width:70%; text-align:left;"><input type="checkbox"/> 자동로그인</li>
							</ul>							
						</div>
					</div>
					<!-- //List -->	

					<!-- //List -->						
					<!-- Button -->
					
							<ul class="btn-list">
								<a href="#" onclick="login()">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img01.gif"></li>
									<li class="btn-width">로그인</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>								
							</ul>
														
							<ul class="btn-list2">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img09.gif"></li>
									<li class="btn-width">아이디/패스워드 분실</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end2.gif"></li>
								</a>
							</ul>							
							<ul class="btn-list2">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img09.gif"></li>
									<li class="btn-width">회원가입 요청</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end2.gif"></li>
								</a>
							</ul>
					</div>
				</div>

				
				
				
				<!-- //Article -->
			</div>
			<!-- //Content -->
		</div>
		<!-- //Body -->
	</div>
	<!-- //Wrap -->
</div>
<!-- //Wrapper -->
		
	<script type="text/javascript">
	$(document).ready(function(){
		$("input[name=userId]").focus();
	});
	
	function login(){
		
		var $userId = $("input[name=userId]"),
			$userPw= $("input[name=userPw]");
		
		if($userId.val()===''){
			alert('아이디를 입력하세요');
			$userId.val('');
			$userId.focus();
			return;
		}
		
		if($userPw.val()===''){
			alert('비밀번호를 입력하세요');
			$userPw.val('');
			$userPw.focus();
			return;
		}
		
		 $.ajax({
			type:"POST",
			url : "/login.oe",
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
		if(e.keyCode==13) {
			login();
			return false;
		} else{
			return true;			
		}
	}
	</script>
	</body>
</html>


