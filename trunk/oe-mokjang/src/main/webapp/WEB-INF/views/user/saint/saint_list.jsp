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
	function expelSaint(userId,userName,userFlag){
		yesorno = confirm(userName+"님을 제적하시겠습니까?");
		if(yesorno == true){
			$.ajax({
				type:"GET",
				url:'removeSheep.oe?userId='+userId+'&flag='+userFlag,
				success : function(result) {
					location.reload();
				}
			});
		}
	}
	
		$(document).ready(function() {
			 
		var page = '${pageList.page}';
		var pageSize = '${pageList.pageSize}';
		var totalNumOfItems = '${pageList.totalNumOfItems}';
		var page = paging(page,pageSize,totalNumOfItems);
		$('#page-bar').html(page);
			});
		
		function removeSaint(userId,userName){
			yesorno = confirm(userName+"님을 삭제하시겠습니까? (완전삭제후에는 복구가 안됩니다)");
			if(yesorno == true){
				$.ajax({
					type:"GET",
					url:'removeUser.oe?userId='+userId,
					success : function(result) {
						location.reload();
					}
				});
			}
		}
		function enterSerch(e) {
			if(e.keyCode==13){
				serch();
			return false;
			}
			else{
			return true;			
			}
		}
		function serch(){	
			var keyword = $("input[name=keyword]").val();
			location.href="saintList.oe?keyword="+keyword;
		}	
		function pageR(param){
			location.href="saintList.oe?page="+param;
		}
		
</script>
</head>
<body>
	<div class="containerWrap">
			<div class="headWrap">
			<%@ include file="../../include/header.jsp" %>
			</div>
			<div class="contentsWrap">
				<div class="contents">
					<!--검색-->
						<div class="saintListSearch">
							<span>이름</span>
							<input type="text" id="keyword" name="keyword" class="text" title="검색조건 입력"  onkeypress="return enterSerch(event)" onfocus="this.value=''" style="width:100px;" />
							<span class="btn3"><a href="#" onclick="serch()" >검색 </a></span>
						<a href="registForm.oe" ><span class="btn3">성도 등록</span></a>
						</div>
					
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
							<th scope="col">주소</th>
							<th scope="col">핸드폰번호</th>
							<th scope="col">등록일</th>
							<th scope="col">상태</th>
							<th scope="col">제적</th>
						</thead>
						
						<tr>
							<c:forEach var = "list" items="${pageList.items}" varStatus="s">
							<td>${s.count}</td>
							<td>${list.roleName}</td>
							<td><a data-toggle="modal" href="detail.oe?userId=${list.userId}" data-target="#myModal">${list.userName}</a></td>
							<td>${list.birth}</td>
							<td>${list.addr}</td>
							<td>${list.cellPhone	}</td>
							<td>${list.regDt}</td>
						<c:if test="${list.flag==0 }">
    						<td>등록</td>
- 							<td><a href="#" ><input class="btn3"' type="button" onclick="expelSaint('${list.userId}','${list.userName}',${list.flag})" value="제적"/></a></td> 
   						</c:if>
						<c:if test="${list.flag==1}">
    						<td>제적</td>
- 							<td><a href="#" ><input class="btn3"' type="button" onclick="removeSaint('${list.userId}','${list.userName}')" value="완전삭제"/></a></td> 
   						</c:if>
						</tr>
							</c:forEach>
							<tr>
								<td class="list_paging" colspan="10">
									<ul class="pagination" id="page-bar">
											<li><a href="#">5</a></li>
											<li><a href="#">5</a></li>
											<li><a href="#">&raquo;</a></li>
										</ul>					
								</td>
							</tr>
							<tr>									
						</tr>
					</table>
				
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