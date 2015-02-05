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
<script type="text/javascript" src="/resources/js/paging-1.js"></script>
<!-- <script type="text/javascript" src="/js/paging-1.js"></script> -->

<script type="text/javascript">
	function modal(){
		$('#myModal').modal('toggle');
	}
	//var page = paging(msg.page,msg.pageSize,msg.totalNumOfItems);
	function sheepPage(param){
		var keyword = $('#keyword').val();
		var html = '';
		var total=""
		var item = null;
		$.ajax({
			type:"GET",
			url:"rest/user/registSheep.oe?page="+param+"&keyword="+keyword,
		success : function(result) {
			 for (var i=0; i<result.items.length; i++) {
				item = result.items[i];
				html += '<tr>';
				html += '	<td><input type="checkbox" name="box" value = "'+item.userId+'"/></td>';
				html += '	<td>' + item.userName + '</td>';
				/*html += '	<td><a href="detail.oe?userId='+item.userId+'">' + item.userName + '</a></td>';  */
				html += '	<td>' + item.roleName + '</td>';
				html += '	<td>' + item.birth+ '</td>';
				if (item.gender==1) {
					html += '	<td> 남자</td>';
				};
				if (item.gender!=1) {
					html += '	<td>여자</td>';
		    	 };
				html += '</tr>';
			} 
			var page = paging(result.page, result.pageSize, result.totalNumOfItems);
			$('#tbody-item-list').html(html);
			$('#page-bar').html(page);
		}
		});
	}
	function greeting3(){
		var str = "";  
	    $("input:checkbox:checked").each(function (index) {  
	        str += $(this).val() + ",";  
	    });
	    if (str==""){
	    	alert("목장원을  선택해주세요");
	    	exit;
	    }
			location.href='registSheep.oe?userId='+str+'&farmmerId=sms';
	}
	$(document).ready(function() {
		sheepPage(1);
		});
	
</script>
</head>
<body>
		<!--레이어팝업-->
				<div class="layerPopup">
					<div class="layerHead">
						<h2>목장원 추가</h2>
						<a href="list.oe"><span>×</span></a>
						<div class="line"></div>
					</div>
					<div class="layerContent">
						<div class="listSearch">
							<span>이름</span>
							<input type="text" id="keyword" name="keyword" class="text" title="검색조건 입력" onfocus="this.value=''" style="width:100px;" />
							<span class="btn3"><a href="#" onclick="sheepPage(1)" >검색 </a></span>
							<span class="btn3"><a href="registForm.oe" >직접입력 </a></span>
						</div>
						<!--리스트영역-->
						<table cellpadding="0" cellspacing="0" class="list" >
							
							<caption>테스트</caption>
							<colgroup>
								<col style="width:50px;">
								<col style="width:80px;">
								<col style="width:100px;">
								<col style="width:100px">
								<col style="width:80px;">
							</colgroup>
							<thead>
							<tr>
								<th scope="col" ><input type="checkbox" name="box"  /></th>
								<th scope="col">성도명</th>
								<th scope="col">직분</th>
								<th scope="col">생년월일</th>
								<th scope="col">성별</th>
								</tr>
							</thead>
							<tbody id = "tbody-item-list">
							<tr >
								<td ><input type="checkbox" id="box" /></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							</tbody>
							<%-- <c:forEach var = "list" items="${pageList.items}"  varStatus="s">
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
							</c:forEach> --%>
							<tr>
								<td class="first" colspan="5">검색된 항목이 없습니다.</td>
							</tr>							
							<tr>
								<td class="list_paging" colspan="5">
								<div class="paging" id="">									
									<ul class="pagination" id="page-bar">
											<li><a href="#">5</a></li>
											<li><a href="#">5</a></li>
											<li><a href="#">&raquo;</a></li>
										</ul>					
								</div>									
								</td>
							</tr>
							</table>
					</div>
					<div class="layerTail">
						<div class="layerBtn">	
<!-- 							<a href="#"><span class="btn2" id = "checkList" >선택 항목 추가</span></a> -->
							<input type="button" class="btn2" value="확인" onclick="greeting3()">
							<a href="list.oe"><span class="btn2">취소</span></a>
						</div>
					</div>
				</div>
		
</body>
</html>