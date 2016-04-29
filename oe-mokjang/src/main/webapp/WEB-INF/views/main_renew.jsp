<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
    <script>
    jQuery(document).ready(function($) {
        $('#sidebar-btn').click(function() {
            $('#sidebar').toggleClass('visible');
        });
    });
    </script>
</head>

<body>

	<div id="sidebar"> 
		<ul>
			<li class="side_profie">
				<a href="#"><img src="/resources/images/button/profile_bg.png" alt="개인프로필" style="background:url('images/button/profile.png') 0 0 repeat-x;"/></a><br/>
				<a href="#">김문수 목장</a> 
			</li>
			<li><a href="#">목장보고서 작성</a></li>
			<li><a href="#">목장보고서 관리</a></li>
			<li><a href="#">목장원 관리</a></li>
			<li><a href="#">로그아웃</a></li>           
		</ul>
	</div>

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

				
				<div class="cont-top-tit">				
					<h2 class="h2 tit8">${sessionUserVO.deptName} 현황</h2>
					
					<!--<ul class="location">
						<li>HOME</li>
						<li>목장보고서 작성</li>						
					</ul>-->
				</div>
				<!-- //Top -->
				<!-- Article -->
				<div id="content">
					<p id="cont-left-top"></p><p id="cont-left-btm"></p><p id="cont-right-top"></p>
					<div class="cont-body">
	
	
					<div class="cont-tit"><h4 class="h4">누적통계</h4></div>
					<!-- List -->
					<div class="list-view form">
						<div class="box-point">
							<ul>
								<li style="width:50%;">
								<em>누적점수</em>
								<p style="font-size:40px; color:#FF4800; font-family:'lato'; padding:15px;">1,321</p></li>
								<li style="width:50%;">
								<em>누적순위</em>
								<p style="font-size:40px; color:#FF7F27; font-family:'lato'; padding:15px;">22.3%</p></li>
							</ul>
						</div>
					</div>
					<!-- //List -->	

					<div class="cont-tit"><h4 class="h4">금주점수</h4></div>
					<!-- List -->
					<div class="list-view form">
						<div class="box-point">
							아직 목장보고서를 작성하지 않았습니다. <br />지금 목장보고서를 작성하시려면 아래 버튼을 선택하세요.<br>
							<a href="report_write.html" class="btn type5" style="margin-top:10px;"><span>목장보고서 작성</span></a>
						</div>
					</div>
					<!-- //List -->						
					<!-- Button -->
					
							<ul class="btn-list">
								<a href="report_list.html">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img01.gif"></li>
									<li class="btn-width">목장보고서 관리</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>								
							</ul>			

							<ul class="btn-list">
								<a href="member_list.html">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img03.gif"></li>
									<li class="btn-width">목장원 관리</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>								
							</ul>
	
							<ul class="btn-list">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img02.gif"></li>
									<li class="btn-width">목장원 출석관리</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>
							</ul>
							
							<ul class="btn-list2">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img09.gif"></li>
									<li class="btn-width">로그아웃</li>
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
</body>

</html>