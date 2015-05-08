<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
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
	</head>
	<body>	
		<div class="container">
			<div class="header_wrap">
				<div class="header">
					<div class="header_title">
					<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
							<c:if test="${user.role.roleName eq '목자' }"><h2>${user.userName } 목장보고서(<fmt:formatDate value="${firstDate}" pattern="yyyy-MM-dd" />~<fmt:formatDate value="${lastDate}" pattern="yyyy-MM-dd" />)</h2> </c:if>
						</c:forEach>
					</div>
					<div class="header_week">
						<div class="week_prev"><a href="javascript:getReport(${thisWeeks-1 });" class="ui-btn ui-corner-all ui-icon-arrow-l ui-btn-icon-left ui-mini">이전주</a></div>
						<div class="week_picker" style="width:50%;"><input type="week" data-clear-btn="true" name="week-2" id="week-2" value="2015, 15"></div>
						<div class="week_next"><a href="#" class="ui-btn ui-corner-all ui-icon-arrow-r ui-btn-icon-right ui-mini">다음주</a></div>
					</div>
				</div>
			</div>
			<form id="mokjangReportForm">
				<div class="input_wrap">
				<div class="ui-grid-a ui-responsive">
					<div class="ui-block-a">
					<h4>목장집회</h4>
					<table class="person_info_01">
						<tr>
							<th>집회일시</th>
							<td style="padding:0 7px 0 7px;"><input type="date" data-clear-btn="false" name="worshipDt" id="worshipDt"  ></td>
						</tr>
						<tr>
							<th>집회장소</th>
							<td>
								<div  style="padding:0 7px 0 7px;">
								<input type="text" name="worshipPlace" id="worshipPlace">
								<input type="hidden" name="deptSeq" id="deptSeq" value="${sessionUserVO.deptSeq}">
								</div>
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select class="form-control" id="placeList" data-mini="true" >
										<option value="">선택하세요</option>
										<option value="교회">교회</option>
										<option value="목자집">목자집</option>
										<option value="야외">야외</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<th>마음열기</th>
							<td>
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select name="welcomeUserName" id="welcomeUserName" data-mini="true">
										<option value="">선택하세요</option>
										<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
											<option value="${user.userName}">${user.userName}</option>
										</c:forEach>
									</select>
									
									
								</div>
							</td>
						</tr>
						<tr>
							<th>찬송인도</th>
							<td>										
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select name="worshipUserName" id="worshipUserName" data-mini="true">
										<option value="">선택하세요</option>
										<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
											<option value="${user.userName}">${user.userName}</option>
										</c:forEach>
									</select>
								</div></td>
						</tr>	
						<tr>
							<th>말씀인도</th>
							<td>
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select name="wordUserName" id="wordUserName" data-mini="true">
										<option value="">선택하세요</option>
										<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
											<option value="${user.userName}">${user.userName}</option>
										</c:forEach>
									</select>
								</div>
							</td>									
						</tr>
						<tr>
							<th>사역인도</th>
							<td>
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select name="workUserName" id="workUserName" data-mini="true">
										<option value="">선택하세요</option>
										<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
											<option value="${user.userName}">${user.userName}</option>
										</c:forEach>
									</select>
								</div>
							</td>									
						</tr>								
					</table>
					</div>
					<div class="ui-block-b">
					<h4>기타정보</h4>
					<table class="person_info_02">
						<%-- 
						<tr>
							<th>기타참석자</th>
							<td>
								<div class="ui-field-contain" style="padding:0px; margin:0px;">
									<select name="select-native-fc" id="select-native-fc" data-mini="true">
										<option value="">선택하세요</option>
										<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
											<option value="${user.userName}">${user.userName}</option>
										</c:forEach>
									</select>
								</div>
							</td>
						</tr>
						 --%>
						<tr>
							<th>총 참석자</th>
							<td style="padding:0 7px 0 7px;">총 참석자 <span class="total_attend">9명</span>
							<div style="min-height:100px;" class="attend_wrap">
								<ul>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>송명섭
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>정충상
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>김현래
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>송명섭
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>정충상
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>김현래
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>송명섭
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								<li><p class="attend_photo"><img src="/resources/img/person.png"></p>정충상
								<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
								</li>
								</ul>
							</div>
							</td>
						</tr>
						<tr>
							<th>목장헌금</th>
							<td><input type="text" data-clear-btn="true" name="offering" id="offering" value="" data-mini="true"></td>
						</tr>
					</table>	
					</div>
				</div>
			</div>
			
			<div class="content_wrap">
				<div class="content">
					<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini">목장보고서 저장</a>
						<div class="table_wrap">
						<table data-role="table" id="table-column-toggle" data-mode="columntoggle" class="ui-body-d table-stripe ui-responsive" data-column-btn-theme="a" data-column-btn-text="항목보기" data-column-popup-theme="a">

							<thead>
								<tr class="th-groups">
									<th style="text-align:center; width:40px;">성명</th>
									<c:forEach var="item" items="${reportItems}" varStatus="j">
										<th data-priority="${j.count}" style="text-align:center;">${item.itemName}</th>
									</c:forEach>
									<!-- 
									<th data-priority="1" style="text-align:center;">목장집회</th>
									<th data-priority="1" style="text-align:center;">목장새등록자</th>
									<th data-priority="2" style="text-align:center;">8주차참석자</th>
									<th data-priority="3" style="text-align:center;">목장등록후교회등록</th>
									<th data-priority="4" style="text-align:center;">양육1권수료자</th>
									<th data-priority="5" style="text-align:center;">학교양육1권수료</th>
									<th data-priority="5" style="text-align:center;">교회등록</th>
									<th data-priority="6" style="text-align:center;">교회등록후목장참석</th>
									<th data-priority="6" style="text-align:center;">목장집회1명감소</th>
									<th data-priority="6" style="text-align:center;">번식하여나가는분</th>
									 -->
									<th data-priority="6" style="text-align:center;">심방내용</th>
									<th class="totals" style="text-align:center;">점수</th>
									<th>입력</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
									<tr data-userseq="${i.index}" >
										<td>
											<a href="#" class="ui-btn ui-corner-all ui-mini">
											<c:choose>
												<c:when test="${user.role.roleName eq '목자'}"><img src="/resources/img/icon_leader.png" alt="리더뱃지" width="14"></c:when>
												<%-- <c:when test="${user.role.roleName eq '예비목자'}"><img src="/resources/img/icon_new.png" alt="새신자뱃지" width="14"></c:when> --%>
												<%-- <c:otherwise>label-default</c:otherwise> --%>
											</c:choose>
											${user.userName}
											</a>
											<input type="hidden" class="form-control" name="reports[${i.index}].userId" value="${user.userId}" >
										</td>
										<c:forEach var="item" items="${reportItems}" varStatus="j">
											<td>
												<label class="attend_chk">
													<input type="checkbox" data-user="user${i.index}" data-weight="${item.weight}" data-mini="true" name="reports[${i.index}].reportItemHistList[${j.index }].itemValue" value="1" >${item.itemTypeDesc}
													<input type ="hidden" name="reports[${i.index}].reportItemHistList[${j.index }].itemCode" value="${item.code }" />
												</label>
											</td>
										</c:forEach>
										<%-- 
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="5" data-mini="true" name="reports[${i.index}]['mokjangYn']" value="1" >참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true" name="reports[${i.index}]['sundayYn']" value="1" >참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>							
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>							
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>							
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>							
										<td><label class="attend_chk"><input type="checkbox" data-user="user${i.index}" data-weight="2" data-mini="true">참석</label></td>			
										 --%>				
										<td style="padding:0px;"><textarea name="textarea-1" id="textarea-1"></textarea></td>
										<td><a href="#" class="ui-btn ui-corner-all ui-mini"><span id="reports[${i.index}].points">0</span> P</a></td>
										<td><p class="table_point"><a href="#"><img src="/resources/img/btn_plus.png" alt="점수추가"></a><p></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						
						<div class="meet_info">								
							<a href="#" class="ui-btn ui-corner-all ui-icon-check ui-btn-icon-left ui-mini" data-mini="true" style="display:none;">목장모임 정보 입력 완료</a>
						</div>
						
						<table class="content_table">
							<tr>						
								<th>금일합계점수</th>
								<td><p class="today_point"><a href="#" class="ui-btn ui-corner-all ui-mini"><span id="points">0</span>P</a></p></td>							
							</tr>
							<tr>
								<th>누적점수</th>
								<td><a href="#" class="ui-btn ui-corner-all ui-mini">1,211,342P</a></td>							
							</tr>
							<tr>
								<th>기타보고</th>
								<td style="padding:0 7px 0 7px;"><textarea name="textarea-1" id="textarea-1"></textarea></td>							
							</tr>
						</table>
						</div>
					<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini" onclick="javascript:report.mokjang.regist();">목장보고서 저장</a>
				</div>
			</div>
			</form>	
			</div>
			<div class="footer_wrap">
				<div class="footer">
					<div data-role="controlgroup" data-mini="true">
						<a href="#" class="ui-btn ui-icon-user ui-btn-icon-left ui-corner-all">새가족 추가</a>
						<a href="#" class="ui-btn ui-icon-bullets ui-btn-icon-left ui-corner-all">하위목장 내역</a>
						<a href="/login/logout.oe" class="ui-btn ui-icon-power ui-btn-icon-left ui-corner-all">로그아웃</a>
						<a href="#" class="ui-btn ui-icon-edit ui-btn-icon-left ui-corner-all">내정보 수정</a>
						<a href="#" class="ui-btn ui-icon-mail ui-btn-icon-left ui-corner-all">알림내역(5)</a>
						<a href="#" class="ui-btn ui-icon-comment ui-btn-icon-left ui-corner-all">문의하기</a>
						<p class="footer_copy">Copyrightⓒ 52soft. All right reserved.</p>
					</div>
				</div>
			</div>
		</div>
	
	<script type="text/javascript">
	
	$(document).ready(function() {
		
		// 목장집회 장소 select
		$('#placeList').on('change', function(){
			$('#worshipPlace').val($(this).val());
		});
		
		// 목장원 개인 총점
		$('input[type="checkbox"]').on('click', function() {
			var $this = $(this);
			var userSeq = Number($this.parent().parent().parent().attr('data-userseq'));
			var $userPoints = $(document.getElementById('reports['+userSeq+'].points'));
			var points = 0;
			
			$('input[data-user="user'+userSeq+'"]').each(function() {
				var $this = $(this);
				var weight = Number($this.attr("data-weight"));
				points = $this.is(':checked') ? (points+weight) : points; 
			}) ;
			
			$userPoints.html(points);
		});
		
		// 금일합계점수 반영
		$('#offering').on('keyup', function() {
			todayTotalPoints();
		});
		
		$('input[type="checkbox"]').on('click', function() {
			todayTotalPoints();
		});
			
	});
	
	// 금일합계점수  = 목장원들의 개인총점을 합한다.
	function todayTotalPoints() {
		var todayPoints = 0;								// 금일합계점수
		var usersLength =$('tr[data-userseq]').length;		// 목장원수
		var $offering = $('#offering');						// 헌금
		var $points = $('#points');							// 금일합계점수 표시영역
		var offeringPoint = Math.floor(Number($offering.val())/1000);	// 헌금점수
		
		// 헌금 점수 반영
		todayPoints = offeringPoint;

		// 목장원들의 개인총점을 합한다.
		for(var i=0; i<usersLength; i++) {
			var $userPoints = $(document.getElementById('reports['+i+'].points'));
			todayPoints += Number($userPoints.html());
		}
		
		$points.html(todayPoints);
	}
	
	var report = {
		mokjang : {
			regist : function() {
				var $f = $('#mokjangReportForm'),
				 	 formData;
				 
				formData = $f.serialize();
				 
				 $.ajax({
					 url: '/report/mokjang/regist.oe',
					 type: 'POST',
					 data: formData,
					 dataType : 'json',
					 success:function(result){
					   alert(result.success);
					   if(result.success) {
						   location.href = '/report/mokjang/detail.oe?seq='+result.seq;;
					   }else {
						   alert(result.message);
					   }
					 }
					});
			
			}
		}
	}
	
	function getReport(weeks) {
		return location.href = '/report/mokjang/detail.oe?weeks='+weeks;
	}
	</script>
		
	</body>

</html>