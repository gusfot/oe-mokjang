<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>52소프트 - 목장원 목록</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/css/responsive-tables.css" />
<style>
.swipe {
	overflow: hidden;
	visibility: hidden;
	position: relative;
}

.swipe-wrap {
	overflow: hidden;
	position: relative;
}

.swipe-wrap>div {
	float: left;
	width: 100%;
	position: relative;
}
</style>

<!--<link rel="stylesheet" type="text/css" href="css/popup.html"/>-->
<%--<script type="text/javascript" src="/resources/jquery.js"></script>--%>
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
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
			<li class="side_profie"><a href="#"><img
					src="/resources/images/button/profile_bg.png" alt="개인프로필"
					style="background: url('images/button/profile.png') 0 0 repeat-x;" /></a><br />
				<a href="#">${sessionUserVO.deptName}</a></li>
			<li><a href="#">목장보고서 작성</a></li>
			<li><a href="#">목장보고서 관리</a></li>
			<li><a href="#">목장원 관리</a></li>
			<li><a href="/logout.oe">로그아웃</a></li>
		</ul>
	</div>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Wrap -->
		<div id="wrap">
			<!-- Header -->
			<div id="header-wrap">
				<div id="header">
					<h1>
						<a href="#"><img
							src="/resources/images/common/logo_oneguard.png"
							alt="CELL PLUS 목장보고 서비스" /></a>
					</h1>
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
						<h2 class="h2 tit0">
							<a href="#"><img src="/resources/images/button/btn_back.gif"
								alt="이전으로 이동" /></a>목장원 목록
						</h2>
						<!--<ul class="location">
						<li>HOME</li>
						<li>목장보고서 작성</li>						
					</ul>-->
					</div>
					<!-- //Top -->
					<!-- Article -->
					<div id="content">
						<div class="cont-body">
							<div class="cont-tit">
								<h2>${sessionUserVO.deptName}</h2>
							</div>
							<div class="cont-tit">
								<h5 class="h5">목장원</h5>
							</div>
							<div class="list-wrap">
								<!-- List -->
								<div class="list-view">
									<table>
										<colgroup>
											<col width="15%">
											<col width="30%">
											<col width="*">
										</colgroup>
										<tr>
											<th>구분</th>
											<th>이름</th>
											<th>관리</th>
										</tr>
										<c:forEach var="list" items="${pageList.items}" varStatus="s">
											<tr>
												<td align="center">${list.roleName}</td>
												<td align="center"><a href="detail.oe?userId=${list.userId}">${list.userName}</a></td>
												<c:choose>
													<c:when test="${list.roleSeq eq 5}">
														<td align="center"><a href="/user/registForm.oe" class="btn type6"><span>목장원추가</span></a></td>
													</c:when>
													<c:otherwise>
														<td align="center"><a href="#" class="btn type6"><span>파송</span></a>
															<a href="#" class="btn type6"><span>전출</span></a> <ahref="#" class="btn type6"><span>제적</span></a></td>
													</c:otherwise>
												</c:choose>
											</tr>
										</c:forEach>
									</table>
								</div>
								<!-- //List -->
							</div>

							<div class="cont-tit">
								<h5 class="h5">파송목장</h5>
							</div>
							<div class="list-wrap">
								<!-- List -->
								<div class="list-view">
									<table>
										<colgroup>
											<col width="15%">
											<col width="30%">
											<col width="20%">
											<col width="*">
										</colgroup>
										<tr>
											<th>구분</th>
											<th>이름</th>
											<th>목장수</th>
											<th>관리</th>
										</tr>
										<tr>
											<td align="center">1</td>
											<td align="center">박은진 목장</td>
											<td align="center">3명</td>
											<td align="center"><a href="#" class="btn type6"><span>보기</span></a>
											</td>

										</tr>
										<tr>
											<td align="center">2</td>
											<td align="center">김세진 목장</td>
											<td align="center">5명</td>
											<td align="center"><a href="#" class="btn type6"><span>보기</span></a>
											</td>
										</tr>
										<tr>
											<td align="center">3</td>
											<td align="center">정선영 목장</td>
											<td align="center">3명</td>
											<td align="center"><a href="#" class="btn type6"><span>보기</span></a>
											</td>
										</tr>
										<tr>
											<td align="center">4</td>
											<td align="center">오세정 목장</td>
											<td align="center">3명</td>
											<td align="center"><a href="#" class="btn type6"><span>보기</span></a>
											</td>
										</tr>


									</table>
								</div>
								<!-- //List -->
							</div>

							<!--//Button -->
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


<!-- Mirrored from 112.216.117.106:16682/html/_dm/dm_admin_form_register.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 03 Apr 2015 06:58:35 GMT -->
</html>
