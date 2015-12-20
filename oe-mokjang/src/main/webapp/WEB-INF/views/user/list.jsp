<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>User 목록</title>
	<meta http-equiv="Content-Type" content="text/html;charset=euc-kr" />
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
	<title>목장관리시스템 - 목장원관리</title>
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

	<script type="text/javascript" src="/resources/js/paging-1.js"></script>
	<script type="text/javascript">
	
	function modal(){
		$('#myModal').modal('show');
		
	}
	
	function removeSheep(userId,flag){
		 yesorno = confirm("목장원을 삭제하시겠습니까?")
		if(yesorno == true){
			
			$.ajax({
				type : "GET",
				url : "removeSheep.oe?userId="+userId+"&flag="+flag,
				success : function(response) {
					if (response) {
						alert('삭제되었습니다');
						window.location.reload();	
					} else {
						alert('실패하였습니다');
					}
				}
			});
		
		} 
	}
		$(document).ready(function() {
			 
			});
		
</script>
</head>
<body>
	<div class="containerWrap">
			<div class="headWrap">
			<%@ include file="../include/header.jsp" %>
			</div>
			<div class="contentsWrap">
				<div class="contents">
					<!--페이지네비게이션영역-->
					<div class="pageNavi"><a href="#">홈</a> > <a href="#">목장원관리</a> > 목록</div>
					<div class="line"></div><!--구분선-->
					<!--목장 요약영역-->
					<ul class="listSummary">
						<li><span>${pageList.items[0].userName}목장</span>은</li>
						<li>총 <span>${pageList.totalNumOfItems}명</span>의 목장원이 있으며</li>
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
						<li ><a data-toggle="modal" href="registSheepForm.oe" data-target="#myModal"><span class="btn2">목장원추가</span></a></li>
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
							<c:forEach var = "list" items="${pageList.items}" varStatus="s">
						<tr>
							<td>${s.count}</td>
							<td>${list.roleName}</td>
							<td><a data-toggle="modal" href="detail.oe?userId=${list.userId}" data-target="#myModal">${list.userName}</a></td>
							<td>${list.birth}</td>
							<td>9999.99</td>
							<td>9999.99</td>
							<td><a href="#"><span class="btn3">점수입력</span></a></td>
							<td><a href="#"><span class="btn3">심방입력</span></a></td>
<%--			     		<td><a href="removeSheep.oe?userId=${list.userId}"><span class="btn3">삭제</span></a></td> - --%>
 							<td><a href="#" onclick="removeSheep('${list.userId}',${list.flag})"><span class="btn3">삭제</span></a></td> 
						</tr>
							</c:forEach>
						<tr>
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