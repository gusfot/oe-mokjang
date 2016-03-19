<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=euc-kr" />
		<title>목장관리시스템 - 로그인</title>
				<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
		<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
		<!-- jQuery Customize -->
		<style>
			.ui-select span{margin-right:15px; width:40px;}
			.ui-table-columntoggle-btn{box-shadow:none; position:absolute; right:0px; top: 48px}
			.ui-table-columntoggle-popup{width:150px;}
			.ui-table-columntoggle-popup label{font-size:12.5px;}			
		</style>
		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>


	</head>
	<body>	
		<div class="container">
			<div class="header_wrap">
				<div class="header">
					<div class="header_title"><h1><img src="/resources/img/logo.png" alt="로고" style="width:300px;"> </h1></div>
					<div class="header_title"><h2>목장보고서 관리 시스템</h2></div>
				</div>
			</div>
			<div class="content_wrap">
				<div class="content">					
					<div class="table_wrap">
						<input type="text" data-clear-btn="true" onkeypress="return enterLogin(event)"  name="userId" id="userId"  data-mini="true" placeholder="아이디" />
						<input type="password" data-clear-btn="true" onkeypress="return enterLogin(event)" name="password" id="password" autocomplete="off" data-mini="true" placeholder="비밀번호" />
						<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini" onclick="login();" >로그인</a>
					</div>
				</div>
			</div>
			<div class="footer_wrap">
				<div class="footer">
					<div data-role="controlgroup" data-mini="true">
						<a href="#" class="ui-btn ui-icon-user ui-btn-icon-left ui-corner-all">비밀번호 찾기</a>
						<a href="#" class="ui-btn ui-icon-bullets ui-btn-icon-left ui-corner-all">십자가의 길 안내</a>											
						<a href="#" class="ui-btn ui-icon-comment ui-btn-icon-left ui-corner-all">문의하기</a>
						<a href="#" class="ui-btn ui-icon-home ui-btn-icon-left ui-corner-all">오병이어교회 홈페이지</a>
						<p class="footer_copy">Copyrightⓒ 52soft. All right reserved.</p>
					</div>
				</div>
			</div>
		</div>
		
	<script type="text/javascript">
	$(document).ready(function(){
		$("input[name=userId]").focus();
	});
		
	
	
	function login(){
		var $userId = $("input[name=userId]"),
			$userPw= $("input[name=password]");
		
		
		
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