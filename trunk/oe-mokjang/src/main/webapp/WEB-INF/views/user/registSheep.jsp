<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<script type="text/javascript" src="/js/paging-1.js"></script>
<!-- <script type="text/javascript" src="/js/paging-1.js"></script> -->

<script type="text/javascript">
	function modal(){
		$('#myModal').modal('toggle');
	}
</script>

</head>
<body>
		<!--레이어팝업-->
		<div class="layerpopupBack">
			<div class="layerPopupWrap">
				<div class="layerPopup">
					<div class="layerHead">
						<h2>목장원 추가</h2>
						<a href="#"><span>×</span></a>
						<div class="line"></div>
					</div>
					<div class="layerContent">
						<div class="listSearch">
							<span>목장명</span>
							<input type="text" id="" name="" class="text" title="검색조건 입력" value="홍길동" onfocus="this.value=''" style="width:100px;" />
							<span>등록일</span>
							<input type="text" id="" name="" class="text" title="검색조건 입력" value="20130101" onfocus="this.value=''" style="width:80px;" />
							 ~ 
							<input type="text" id="" name="" class="text" title="검색조건 입력" value="20131231" onfocus="this.value=''" style="width:80px;" />
							<span class="btn3"><a href="#" >검색 </a></span>
							<span class="btn3"><a href="registForm.oe" >직접입력 </a></span>
						</div>
						<span class="total">총 50건의 목장원이 검색되었습니다.</span>
						<!--리스트영역-->
						<table cellpadding="0" cellspacing="0" class="list">
							<caption>테스트</caption>
							<colgroup>
								<col style="width:50px;">
								<col style="width:80px;">
								<col style="width:100px;">
								<col style="width:100px">
								<col style="width:80px;">
							</colgroup>
							<thead>
								<th scope="col" class="first"><input type="checkbox" id="" /></th>
								<th scope="col">성도명</th>
								<th scope="col">목장명</th>
								<th scope="col">생년월일</th>
								<th scope="col">성별</th>
							</thead>
							<c:forEach var = "list" items="${pageList.items}" begin="0" end="4"  varStatus="s">
							<tr>
								<td ><input type="checkbox" id="" /></td>
								<td>${list.userName}</td>
								<td>${list.roleName}</td>
								<td>${list.birth }</td>
								<c:if test="${list.gender==1}">
								<td> 남</td>
								</c:if>
								<c:if test="${list.gender==2}">
								<td> 여</td>
								</c:if>
							</tr>
							</c:forEach>
							<tr>
								<td class="first" colspan="5">검색된 항목이 없습니다.</td>
							</tr>							
							<tr>
								<td class="list_paging" colspan="5">
								<div class="paging">									
										<a href="#"><span class="btn4"> << </span></a>
										<a href="#"><span class="btn4"> < </span></a>
										<a href="#"><span class="btn4">1 </span></a>
										<a href="#"><span class="btn4">2 </span></a>
										<a href="#"><span class="btn4">3 </span></a>
										<a href="#"><span class="btn4">4 </span></a>
										<a href="#"><span class="btn4">5 </span></a>
										<a href="#"><span class="btn4"> > </span></a>
										<a href="#"><span class="btn4"> >> </span></a>						
								</div>									
								</td>
							</tr>
							</table>

					</div>
					<div class="layerTail">
						<div class="layerBtn">
							<a href="#"><span class="btn2">선택 항목 추가</span></a>
							<a href="list.oe"><span class="btn2">취소</span></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		
</body>
</html>