<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>오병이어교회 목장보고서 시스템</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet" href="/resources/assets/css/main.css">
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body class="homepage">
	<div id="page-wrapper">

		<!-- Header -->
		<div id="header">

			<!-- Inner -->
			<div class="inner">
				<header>
				<h1>
					<a href="index.html" id="logo"><img src="/resources/img/logo.png" alt="로고" style="width:300px;"></a>
					
				</h1>
				<hr>
				<p>표어_ 하나님사랑, 이웃사랑 목표_2000명 전도하자!</p>
				</header>
				<footer> <a href="http://52ch.kr" class="button circled scrolly">CrossWay</a>
					
				</footer>
			</div>

			<!-- Nav -->
			<nav id="nav">
			<ul>
				<!-- <li style="white-space: nowrap;"><a href="#" >목장 보고서 작성하기</a></li> -->
				   <c:choose>
       		<c:when test="${isSubmited eq true }">목장보고서 제출 완료</c:when>
       		<c:otherwise><li style="white-space: nowrap;"><a href="#"onclick="javascript:location.href='/report/mokjang/regist.oe';">목장보고서 작성하기</a></li></c:otherwise>
       </c:choose>
		
				<li style="white-space: nowrap;"><a href="/report/mokjang/list.oe"">목장보고서 목록보기</a></li>
				<li style="white-space: nowrap;"><a href="#" onclick="javascript:location.href='/user/registForm.oe';">목장원 추가</a></li>
				<li style="white-space: nowrap;"><a href="#" onclick="javascript:location.href='/dept/children.oe';">하위 목장 내역</a></li>
				<li style="white-space: nowrap;"><a href="#" onclick="javascript:location.href='/attend/mokjang/regist.oe';">예배출석 여부 등록</a></li>
				<li class="opener"	style="-webkit-user-select: none; cursor: pointer; white-space: nowrap;">
				<a href="#">조직관리</a>
				<ul class=""	style="-webkit-user-select: none; display: none; position: absolute;">
						<li style="white-space: nowrap;"><a href="#"	style="display: block;">교구관리</a></li>
						<li style="white-space: nowrap;"><a href="#"	style="display: block;">교육부</a></li>
						<li style="white-space: nowrap;"><a href="#"	style="display: block;">부서관리</a></li>
						<!-- <li class="opener"	style="-webkit-user-select: none; cursor: pointer; white-space: nowrap;">
							<a href="#" style="display: block;">And a submenu …</a>
							<ul style="-webkit-user-select: none; display: none; position: absolute;"	class="dropotron">
								<li style="white-space: nowrap;"><a href="#"	style="display: block;">Lorem ipsum dolor</a></li>
								<li style="white-space: nowrap;"><a href="#"	style="display: block;">Phasellus consequat</a></li>
								<li style="white-space: nowrap;"><a href="#"	style="display: block;">Magna phasellus</a></li>
								<li style="white-space: nowrap;"><a href="#"	style="display: block;">Etiam dolore nisl</a></li>
							</ul>
						</li> -->
					</ul>
				</li>
				<li style="white-space: nowrap;"><!-- <span class="glyphicon glyphicon-off"> --><a href="/logout.oe">로그아웃</a></li>
			</ul>
			</nav>
<div class="12u">
								<!-- Copyright -->
									<div class="copyright">
										<ul class="menu">
											<li>Copyrightⓒ 52soft. All right reserved.</li><li>52ch.kr</li>
										</ul>
									</div>

							</div>
		</div>

	<!-- Scripts -->
	<script src="/resources/assets/js/jquery.min.js"></script>
	<script src="/resources/assets/js/jquery.dropotron.min.js"></script>
	<script src="/resources/assets/js/jquery.scrolly.min.js"></script>
	<script src="/resources/assets/js/jquery.onvisible.min.js"></script>
	<script src="/resources/assets/js/skel.min.js"></script>
	<script src="/resources/assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="/resources/assets/js/main.js"></script>


	<ul class="dropotron level-0"
		style="-webkit-user-select: none; display: none; position: absolute; z-index: 1000;">
		<li style="white-space: nowrap;"><a href="#"
			style="display: block;">Lorem ipsum dolor</a></li>
		<li style="white-space: nowrap;"><a href="#"
			style="display: block;">Magna phasellus</a></li>
		<li style="white-space: nowrap;"><a href="#"
			style="display: block;">Etiam dolore nisl</a></li>
		<li class="opener"
			style="-webkit-user-select: none; cursor: pointer; white-space: nowrap;">
			<a href="#" style="display: block;">And a submenu …</a>
			<ul
				style="-webkit-user-select: none; display: none; position: absolute; z-index: 1001;"
				class="dropotron level-1">
				<li style="white-space: nowrap;"><a href="#"	style="display: block;">Lorem ipsum dolor</a></li>
				<li style="white-space: nowrap;"><a href="#"	style="display: block;">Phasellus consequat</a></li>
				<li style="white-space: nowrap;"><a href="#" style="display: block;">Magna phasellus</a></li>
				<li style="white-space: nowrap;"><a href="#" style="display: block;">Etiam dolore nisl</a></li>
			</ul>
		</li>
		<li style="white-space: nowrap;"><a href="#"
			style="display: block;">Veroeros feugiat</a></li>
	</ul>
	<div id="navButton">
		<a href="#navPanel" class="toggle"></a>
	</div>
	
</body>
</html>