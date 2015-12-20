<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=euc-kr" />
		<title>목장관리시스템 - 목장원관리</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
		<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
		<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
		<!-- jQuery Customize -->
		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	</head>
	<body>	
		<div class="container">
			<div class="header_wrap">
				<div class="header">
					<div class="header_title"><h2>${sessionUserVO.deptName}보고서</h2></div>
					<div class="header_week">
						<div class="week_prev"><a href="#" class="ui-btn ui-corner-all ui-icon-arrow-l ui-btn-icon-left ui-mini">이전주</a></div>
						<div class="week_picker" style="width:50%;"><form><input type="week" data-clear-btn="true" name="week-2" id="week-2" value="2015, 15"></form></div>
						<div class="week_next"><a href="#" class="ui-btn ui-corner-all ui-icon-arrow-r ui-btn-icon-right ui-mini">다음주</a></div>
					</div>
				</div>
			</div>
			<div class="content_wrap">
				<div class="content">
					<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini">목장보고서 저장</a>
						<div class="table_wrap">
						<table data-role="table" id="table-column-toggle" data-mode="columntoggle" class="ui-body-d table-stripe ui-responsive" data-column-btn-theme="a" data-column-btn-text="항목보기" data-column-popup-theme="a">
							<colgroup>
							</colgroup>
							<thead>
								<tr class="th-groups">
									<th style="text-align:center; width:40px;">성명</th>
									<th data-priority="1" style="text-align:center;">목장집회</th>
									<th data-priority="1" style="text-align:center;">목장<br />새등록</th>
									<th data-priority="2" style="text-align:center;">8주차참석자</th>
									<th data-priority="3" style="text-align:center;">목장등록후<br />교회등록</th>
									<th data-priority="4" style="text-align:center;">(삶)양육<br />1권수료</th>
									<th data-priority="5" style="text-align:center;">(학교)양육<br />1권수료</th>
									<th data-priority="5" style="text-align:center;">교회등록</th>
									<th data-priority="6" style="text-align:center;">교회등록후<br />목장참석</th>
									<th data-priority="6" style="text-align:center;">목장집회<br />1명감소</th>
									<th data-priority="6" style="text-align:center;">번식하여<br />나가는분</th>
									<th data-priority="6" style="text-align:center;">식당봉사</th>
									<th class="totals" style="text-align:center;">점수</th>
									<th>입력</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
								<tr>
									<td>
										<a href="#" class="ui-btn ui-corner-all ui-mini">
										<c:choose>
											<c:when test="${user.role.roleName eq '목자'}"><img src="/resources/img/icon_leader.png" alt="목자" width="14"></c:when>
											<c:when test="${user.role.roleName eq '예비목자'}"><img src="/resources/img/icon_leader.png" alt="예비목자" width="14"></c:when>
											<c:when test="${user.role.roleName eq '새가족'}"><img src="/resources/img/icon_leader.png" alt="새가족" width="14"></c:when>
											<c:otherwise></c:otherwise>
										</c:choose>
										<span>${user.userName }</span>
										</a>
									</td>
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].newMember" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].attnd8th" value="1" data-mini="true" readOnly /></td>
									<td><input type="checkbox" name="reports[${i.index}].rgstChrch" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].lifeStdy" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].shclStdy" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>							
									<td><input type="checkbox" name="reports[${i.index}].mokjangYn" value="1" data-mini="true"></td>							
									<td><a href="#" class="ui-btn ui-corner-all ui-mini">750 P</a></td>
									<td><p class="table_point"><a href="#"><img src="/resources/img/btn_plus.png" alt="점수추가"></a><p></td>
								</tr>
								</c:forEach>
											
							</tbody>
						</table>
						
						<div class="meet_info">								
							<a href="#popupDialog" data-rel="popup" data-position-to="window" data-transition="pop" class="ui-btn ui-btn-c ui-corner-all ui-icon-plus ui-btn-icon-left ui-mini" data-mini="true">목장모임 정보 입력</a>
							<a href="#" class="ui-btn ui-corner-all ui-icon-check ui-btn-icon-left ui-mini" data-mini="true" style="display:none;">목장모임 정보 입력 완료</a>
						</div>
						
						<table class="content_table">
							<tr>						
								<th>금일합계점수</th>
								<td><p class="today_point"><a href="#" class="ui-btn ui-corner-all ui-mini">42P</a></p></td>							
							</tr>
							<tr>
								<th>누적점수</th>
								<td><a href="#" class="ui-btn ui-corner-all ui-mini">1,211,342P</a></td>							
							</tr>
							<tr>
								<th>기타보고</th>
								<td style="padding:0 7px 0 7px;"><form><textarea name="textarea-1" id="textarea-1"></textarea></form></td>							
							</tr>
						</table>
						</div>
					<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini">목장보고서 저장</a>
				</div>
			</div>
			<div class="footer_wrap">
				<div class="footer">
					<div data-role="controlgroup" data-mini="true">
						<a href="#" class="ui-btn ui-icon-user ui-btn-icon-left ui-corner-all">새가족 추가</a>
						<a href="#" class="ui-btn ui-icon-bullets ui-btn-icon-left ui-corner-all">하위목장 내역</a>
						<a href="#" class="ui-btn ui-icon-power ui-btn-icon-left ui-corner-all">로그아웃</a>
						<a href="#" class="ui-btn ui-icon-edit ui-btn-icon-left ui-corner-all">내정보 수정</a>
						<a href="#" class="ui-btn ui-icon-mail ui-btn-icon-left ui-corner-all">알림내역(5)</a>
						<a href="#" class="ui-btn ui-icon-comment ui-btn-icon-left ui-corner-all">문의하기</a>
						<p class="footer_copy">Copyrightⓒ 52soft. All right reserved.</p>
					</div>
				</div>
			</div>
		</div>
		
		<div data-role="popup" id="popupDialog" data-overlay-theme="b" data-theme="a" data-dismissible="false" style="max-width:100%;">
			<div class="sub_wrapper">
				<div class="header_wrap">
					<div class="header">
						<div class="header_title"><h3>${sessionUserVO.deptName} 모임 정보 입력</h3></div>
						<div class="header_delete"><a href="#" data-rel="back" ><img src="/resources/img/btn_close.png"></a></div>
					</div>
				</div>		
				<div class="content_wrap">
					<div class="content">
						<div class="input_wrap">
							<div class="ui-grid-a ui-responsive">
								
								<div class="ui-block-a">
								<h4>기본정보</h4>
								<table class="person_info_01">
									<tr>
										<th>집회일시</th>
										<td style="padding:0 7px 0 7px;">
											<input type="date" data-clear-btn="false" name="worshipDt" id="worshipDt" value="">
										</td>
									</tr>
									<tr>
										<th>집회장소</th>
										<td>
											<div  style="padding:0 7px 0 7px;">
											<input type="text" name="worshipPlace" id="worshipPlace">
											</div>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select class="form-control" name="placeList" id="placeList" data-mini="true" onchange="setWoshipPlace(this);">
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
												<select class="form-control" name="welComeUserName" id="welComeUserName" data-mini="true">
													<option value="">선택하세요</option>
													<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
													<option>${user.userName}</option>
													</c:forEach>
												</select>
											</div>
										</td>
									</tr>
									<tr>
										<th>찬송인도</th>
										<td>										
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select class="form-control" name="worshipUserName" id="worshipUserName" data-mini="true">
													<option value="">선택하세요</option>
													<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
													<option>${user.userName}</option>
													</c:forEach>
												</select>
											</div>
										</td>
									</tr>	
									<tr>
										<th>말씀인도</th>
										<td>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select class="form-control" name="wordUserName" id="wordUserName" data-mini="true">
													<option value="">선택하세요</option>
													<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
													<option>${user.userName}</option>
													</c:forEach>
												</select>
											</div>
										</td>									
									</tr>
									<tr>
										<th>사역인도</th>
										<td>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select class="form-control" name="workUserName" id="workUserName" data-mini="true">
													<option value="">선택하세요</option>
													<c:forEach var="user" items="${mokjangUsers}" varStatus="i" >
													<option>${user.userName}</option>
													</c:forEach>
												</select>
											</div>
										</td>									
									</tr>								
								</table>
								</div>
								<!-- <div class="ui-block-b">
								<h4>기타정보</h4>
								<table class="person_info_02">
									<tr>
										<th>기타참석자</th>
										<td>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select name="select-native-fc" id="select-native-fc" data-mini="true">
													<option value="">선택하세요</option>
													<option value="정충상">정충상</option>
													<option value="홍길동">홍길동</option>
													<option value="김현래">김현래</option>
													<option value="송명섭">송명섭</option>
													<option value="안지훈">안지훈</option>
													<option value="하종수">하종수</option>
												</select>
											</div>
										</td>
									</tr>
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
											<li><p class="attend_photo"><img src="/resources/img/person.png"></p>김현래
											<div class="attend_delete"><a href="#" class="ui-btn ui-shadow ui-corner-all ui-icon-delete ui-btn-icon-notext ui-btn-inline">Delete</a></div>
											</li>										
											</ul>
										</div>
										</td>
									</tr>
									<tr>
										<th>목장헌금</th>
										<td><input type="text" data-clear-btn="true" name="text-3" id="text-3" value="10,000" data-mini="true"></td>
									</tr>
								</table>	
								</div> -->
							</div>
						</div>
						<a href="#" data-rel="back" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini">목장보고서 저장</a>
					</div>
				</div>
				<div class="footer_wrap">
					<div class="footer">

					</div>
				</div>
			
			</div>
	</div>
	<script type="text/javascript">
	
	
	
function checkfield(){
		
		var jsuserId = $("input[name=userId]").val(),
		 jsuserName = $("input[name=userName]").val(),
		jspassword = $("input[name=password]").val(),
		jsaddr = $("input[name=addr]").val(),
		jscellPhone = $("input[name=cellPhone]").val(),
		jshomePhone = $("input[name=homePhone]").val(),
		jsjob = $("input[name=job]").val(),
		jsgender = $("select[name=gender]").val(),
		jsroleSeq = $("select[name=role]").val(),
		jsbirth = $("input[name=birth]").val(),
		jsemail = $("input[name=email]").val(),
	    jsflag = $("input[name=flag]").val(),
		jsregDt =$("input[name=regDate]").val(),
		jsgyogu = $("select[name=gyogu]").val();
		jsacademic = $("select[name=academic]").val();
		jsmajor = $("select[name=major]").val();
	
	
}
$s(function(){
	$('input[type=checkbox]').click(function(){
		console.log('checkbox');
	});
});
	
	function setWoshipPlace(el) {
		$('#worshipPlace').val($(el).val());
	}
	</script>
	</body>

</html>