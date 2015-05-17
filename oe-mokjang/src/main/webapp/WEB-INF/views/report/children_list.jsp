<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>목장관리시스템 - 하위목장 내역</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
		<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
		<!-- jQuery Customize -->
		<style>
		.ui-panel-wrapper{background-color:#666666;}
		</style>
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	</head>
	<body>	
		<div class="sub_container">
			<div class="sub_wrapper">
				<div class="header_wrap">
					<div class="header">
						<div class="header_title"><h3>하위목장 내역</h3></div>
						<!-- <div class="header_delete"><a href="#"><img src="./img/btn_close.png"></a></div> -->
					</div>
				</div>		
				<div class="content_wrap">
					<div class="content">
						<div class="under_wrap">
						<form><input data-type="search" id="filterControlgroup-input" /></form>
							<div data-role="controlgroup" data-filter="true" data-input="#filterControlgroup-input" data-mini="true">
							<%-- 
							<c:forEach var="child" items="${department.children}" varStatus="i">
								<a href="#" class="ui-btn ui-shadow ui-corner-all">${child.deptName }</a>
							</c:forEach>
							 --%>
							<%-- 
							<c:forEach var="child" items="${department.children}" varStatus="i">
								<a href="#" class="ui-btn ui-shadow ui-corner-all">${child.parent.parent.parent.deptName} > ${child.parent.parent.deptName} > ${child.parent.deptName} > ${child.deptName }</a>
							</c:forEach>
							 --%>	
							
							<c:forEach var="childDepth1" items="${department.children}" varStatus="i">
								<a href="#" class="ui-btn ui-shadow ui-corner-all">${childDepth1.deptName}</a>
								<c:forEach var="childDepth2" items="${childDepth1.children}" varStatus="j">
									<a href="#" class="ui-btn ui-shadow ui-corner-all">${childDepth1.deptName} > ${childDepth2.deptName }</a>
									<c:forEach var="childDepth3" items="${childDepth2.children}" varStatus="k">
										<a href="#" class="ui-btn ui-shadow ui-corner-all">${childDepth1.deptName} > ${childDepth2.deptName} > ${childDepth3.deptName} > ${childDepth3.deptName }</a>
										<c:forEach var="childDepth4" items="${childDepth3.children}" varStatus="k">
											<a href="#" class="ui-btn ui-shadow ui-corner-all">${childDepth1.deptName} > ${childDepth2.deptName} > ${childDepth3.deptName} > ${childDepth4.deptName }</a>
											<c:forEach var="childDepth5" items="${childDepth4.children}" varStatus="l">
												<a href="#" class="ui-btn ui-shadow ui-corner-all">${childDepth1.deptName} > ${childDepth2.deptName} > ${childDepth3.deptName} > ${childDepth4.deptName } > ${childDepth5.deptName }</a>
											</c:forEach>
										</c:forEach>
									</c:forEach>
								</c:forEach>
							</c:forEach>
							 
							</div>
						</div>
									
						
					</div>
				</div>
				<div class="footer_wrap">
					<div class="footer">
	
					</div>
				</div>
			
			</div>
		</div>

		
	</body>

</html>