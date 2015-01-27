<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User 목록</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
<!-- <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css"> -->
<!-- Latest compiled and minified JavaScript -->
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/paging-1.js"></script>
<script type="text/javascript">
	
	function modal(){
		$('#myModal').modal('show');
		
	}
</script>
</head>
<body>
	<div class="containerWrap">
			<div class="headWrap">
				<div class="head">
					<!--로고-->
					<h1>목장보고서비스</h1>
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

			</div>
			<div class="contentsWrap">
				<div class="contents">
					<!--서브타이틀영역-->
					<h2>목장원관리</h2>
					<!--페이지네비게이션영역-->
					<div class="pageNavi"><a href="#">홈</a> > <a href="#">목장원관리</a> > 목록</div>
					<div class="line"></div><!--구분선-->
					<!--목장 요약영역-->
					<ul class="listSummary">
						<li><span>홍길동 목장</span>은</li>
						<li>총 <span>5명</span>의 목장원이 있으며</li>
						<li>목장의 금주점수는 <span>32,000점</span>, </li>
						<li>목장의 누적점수는 <span>99,000점</span>입니다.</li>	
					</ul>
					
					<!--검색조건입력
					<div class="listSearch">
						<span>목장명</span>
						<input type="text" id="" name="" class="text" title="검색조건 입력" value="홍길동" onfocus="this.value=''" style="width:100px;" />
						<span>등록일</span>
						<input type="text" id="" name="" class="text" title="검색조건 입력" value="20130101" onfocus="this.value=''" style="width:80px;" />
						 ~ 
						<input type="text" id="" name="" class="text" title="검색조건 입력" value="20131231" onfocus="this.value=''" style="width:80px;" />
						<span class="btn3"><a href="#" >검색 </a></span>
					</div>-->
					<!--년주영역-->
					<ul class="calCtrl">
						<li class="btn1"><a href="#"> << </a></li>
						<li class="btn1"><a href="#"> < </a></li>
						<li><h3>2013년</h3></li>
						<li><h3>32째주</h3></li>
						<li class="btn1"><a href="#"> &#62; </a></li>
						<li class="btn1"><a href="#"> &#62;&#62; </a></li>					
					</ul>
					<!--버튼영역-->
					<ul class="btnWrap">
						<li ><a data-toggle="modal" href="registSheep.oe" data-target="#myModal"><span class="btn2">목장원추가</span></a></li>
						<!-- <li><a onclick="modal()"><span class="btn2">목장원추가</span></a></li> -->
						<!--<li><a href="#"><span class="btn2">목장원추가</span></a></li>
						<li><a href="#"><span class="btn2">목장원추가</span></a></li>-->
					</ul>
					<!--리스트영역-->
					<table cellpadding="0" cellspacing="0" class="list">
						<caption>테스트</caption>
						<colgroup>
							<col style="width:50px;">
							<col style="width:100px;">
							<col style="width:80px;">
							<col style="width:100px;">
							<col style="">
							<col style="">
							<col style="width:100px;">
							<col style="width:100px;">
							<col style="width:80px;">
						</colgroup>
						<thead>
							<th scope="col" class="first">No</th>
							<th scope="col">구분</th>
							<th scope="col">성도명</th>
							<th scope="col">생년월일</th>
							<th scope="col">금주점수</th>
							<th scope="col">누적점수</th>
							<th scope="col">점수입력</th>
							<th scope="col">심방입력</th>
							<th scope="col">삭제</th>
						</thead>
						<tr>
							<c:forEach var = "list" items="${pageList.items}" varStatus="s">
							<td>${s.count}</td>
							<td>${list.roleName}</td>
							<td>${list.userName}</td>
							<td>${list.birth}</td>
							<td>999.99</td>
							<td>9999.99</td>
							<td><a href="#"><span class="btn3">점수입력</span></a></td>
							<td><a href="#"><span class="btn3">심방입력</span></a></td>
							<td><a href="#"><span class="btn3">삭제</span></a></td>
						</tr>
							</c:forEach>
						<tr>
							<td class="first" colspan="9">조회할 내용이 없습니다.</td>
						</tr>									
					</table>
				</div>
			</div>
			<div class="tailWrap">
				<div class="tail">
				COPYRIGHT @ 2014 오병이어교회, ALL RIGHTS RESERVED
				</div>
			</div>
		</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <!-- <div class="modal-content"> -->
      <!-- <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">Modal title</h4>
      </div> -->
      <div class="modal-body">
        <%-- <%@ include file="../user/registSheep.jsp" %> --%>
      </div>
      <!-- <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div> -->
    <!-- </div> --><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>