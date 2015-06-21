<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>목장관리시스템 - 정충상 정보상세</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<link rel="stylesheet" type="text/css" href="/resources/css/common.css" />
		<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
		<!-- jQuery Customize -->
		<style>
		.ui-page-theme-a{background-color:#666666;}
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
						<div class="header_title"><h3>정충상 정보작성</h3></div>
						<!-- <div class="header_delete"><a href="#"><img src="/resources/img/btn_close.png"></a></div> -->
					</div>
				</div>		
				<div class="content_wrap">
					<div class="content">
					<form action="#" id="regist_form">
						<div class="input_wrap">
							<div class="ui-grid-a ui-responsive">
								<div class="ui-block-a">					
								<h4>기본정보</h4>
								<table class="person_info_01">
									<tr>						
										<th>사진</th>
										<td>
											<p class="person_photo"><img src="/resources/img/person.png" style="margin:5px;"></p>
											<label class="attend_chk"><input type="checkbox" name="checkbox-0ccccccccc" data-mini="true">사진파일삭제</label>
											<input type="file" data-clear-btn="true" name="file-2" id="file-2" value="" data-mini="true">
										</td>
									</tr>
									<tr>
										<th>목자</th>
										<td><input type="text" data-clear-btn="true" name="text-3" id="text-3" data-mini="true"></td>
									</tr>
									<tr>
										<th>성명</th>
										<td><input type="text" data-clear-btn="true" name="userName" id="userName"  data-mini="true"></td>
									</tr>	
									<tr>
										<th>성별</th>
										<td>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select name="gender" id="gender" data-mini="true">
													<option value="">선택하세요</option>
													<option value="1">남자</option>
													<option value="2">여자</option>
												</select>
											</div>
										</td>
									</tr>
									<tr>
										<th>생년월일</th>
										<td><input type="date" data-clear-btn="true" name="date-2" id="birth"  data-mini="true"></td>
									</tr>
									<tr>
										<th>양력/음력</th>
										<td>
											<div class="ui-field-contain" style="padding:0px; margin:0px;">
												<select name="select-native-fc" id="select-native-fc" data-mini="true">
													<option value="">선택하세요</option>
													<option value="양력">양력</option>
													<option value="음력">음력</option>
												</select>
											</div>
										</td>
									</tr>								
									<tr>
										<th>직분</th>
										<td>
										<div class="ui-field-contain" style="padding:0px; margin:0px;">
											<select name="select-native-fc" id="select-native-fc" data-mini="true">
											<option value="">선택하세요</option>
											<option value="목사">목사</option>
											<option value="강도사">강도사</option>
											<option value="전도사">전도사</option>
											<option value="장로">장로</option>
											<option value="안수집사">안수집사</option>
											<option value="권사">권사</option>
											<option value="서리집사">서리집사</option>
											<option value="권찰">권찰</option>
											<option value="성도">성도</option>
											<option value="협동장로">협동장로</option>
											<option value="협동안수집사">협동안수집사</option>
											<option value="협동권사">협동권사</option>
											<option value="협동집사">협동집사</option>
											</select>
										</div>
										</td>
									</tr>	
									<tr>
										<th>휴대폰</th>
										<td><input type="tel" data-clear-btn="true" name="cellPhone" id="cellPhone" data-mini="true"></td>
									</tr>									
								</table>
								</div>
								<div class="ui-block-b">
								<h4>선택정보</h4>
								<table class="person_info_02">
									<tr>						
										<th>주소</th>
										<td><a href="#"><input type="text" data-clear-btn="true" name="addr" id="addr"  data-mini="true"></a></td>							
									</tr>
									<tr>
										<th>이메일</th>
										<td><a href="#"><input type="email" data-clear-btn="true" name="email" id="email" data-mini="true"></a></td>
									</tr>
									<tr>
										<th>집전화</th>
										<td><a href="#"><input type="tel" data-clear-btn="true" name="homePhone" id="homePhone" data-mini="true"></a></td>
									</tr>
									<tr>
										<th>직업</th>
										<td><input type="text" data-clear-btn="true" name="job" id="job" data-mini="true"></td>
									</tr>	
									<tr>
										<th>최종학력</th>
										<td><input type="text" data-clear-btn="true" name="academic" id="academic" data-mini="true"></td>
									</tr>	
									<tr>
										<th>전공</th>
										<td><input type="text" data-clear-btn="true" name="major" id="major"  data-mini="true"></td>
									</tr>	
									<tr>
										<th>교회등록</th>
										<td><input type="date" data-clear-btn="true" name="regDate" id="regDate" data-mini="true"></td>
									</tr>	
									<tr>
										<th>메모</th>
										<td style="padding:0 7px 0 7px;"><textarea name="textarea-1" id="textarea-1" data-mini="true"></textarea></td>
									</tr>									
								</table>	
								</div>
							</div>
						</div>
						</form>
						<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini" onclick="checkfield()">목장보고서 저장</a>
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
		
		var jsuserId = $("input[name=userId]")
		 jsuserName = $("input[name=userName]"),
		jsaddr = $("input[name=addr]"),
		jscellPhone = $("input[name=cellPhone]"),
		jshomePhone = $("input[name=homePhone]"),
		jsjob = $("input[name=job]"),
		jsgender = $("select[name=gender]"),
		jsroleSeq = $("select[name=role]"),
		jsbirth = $("input[name=birth]"),
		jsemail = $("input[name=email]"),
	    jsflag = $("input[name=flag]"),
		jsregDt =$("input[name=regDate]"),
		jsgyogu = $("select[name=gyogu]");
		jsacademic = $("select[name=academic]");
		jsmajor = $("select[name=major]");
		 
 		/* alert(jsuserId+jsuserName+jspassword+jsaddr+jscellPhone+jshomePhone+jsjob+jsgender+jsroleSeq+jsbirth+jsemail
			+jsflag+jsregDt+jsgyogu); */
			console.log(jsuserId+jsuserName+jspassword+jsaddr+jscellPhone+jshomePhone+jsjob+jsgender+jsroleSeq+jsbirth+jsemail
					+jsflag+jsregDt+jsgyogu);
		
		var phonestr = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
		if(jsemail.val()==""){
		//if(document.regist_form[0].email.value==""){
			alert("이메일주소를 입력하세요");
			jsemail.focus();
			return;
			
		}else if( jsuserId.val()==""){
			alert("아이디를 입력하세요");
			jsuserId.focus();
			return;
								
		}else if(jsuserName.val()==""){
			alert("이름을 입력하세요");
			jsuserName.focus();
			return;
			
		}else if(jsjob.val()==""){
			alert("직업을 입력하세요");
			jsjob.focus();
			return;
			
		}else if(jsaddr.val()==""){
			alert(" 주소를 입력하세요");
			jsaddr.focus();
			return;
			
		}else if(jsbirth.val()==""){
			alert(" 생일을 입력하세요");
			jsbirth.focus();
			return;
			
		}else if(jscellPhone.val()==""){
			alert(" 핸드폰 번호를 입력하세요");
			jsellPhone.focus();
			return;
			
		}else if(jshomePhone.val()==""){
			alert(" 집전화 번호를 입력하세요");
			jshomePhone.focus();
			return;
		} else if(jsacademic.val() ==""){
			alert("최종학력을 입력하세요");
			jsacademic.focus();
			return;
		} else if(jsmajor.val() == "" ){
			alert("전공을 입력하세요");
			jsmajor.focus();
			return;
		}
	     
	     if(phonestr.test(document.regist_form.cellPhone.value)==false){
	    	 alert("핸드폰번호 형식이 맞지않습니다 ");
	    	 document.regist_form.mobilePhone.focus();
				return;
	     }
	     if(phonestr.test(document.regist_form.cellPhone.value)==false){
	    	 alert(" 전화번호 형식이 맞지않습니다 ");
	    	 document.regist_form.homePhone.focus();
				return;
	     } 
	
		$.ajax({
					type : "GET",
					url : "overlapUserId.oe?userId=" + jsuserId,
					success : function(result) {
						
						if(result){
							alert("사용가능한아이디입니다");
						//document.regist_form.submit();
						}
						else{
							alert("아이디가 이미 존재합니다");
							$("input[name=userId]").val("");
							$("input[name=userId]").focus();
							return;
						}
						}
				});
	 	$.ajax({
			type : "POST",
			url : "regist.oe",
			data : ({ userId : jsuserId, userName : jsuserName, password : jspassword, addr : jsaddr, 
						cellPhone : jscellPhone, homePhone : jshomePhone, job : jsjob, gender : jsgender, 
						birth : jsbirth, email : jsemail , flag : jsflag, regDt : jsregDt , 
				  	    gyogu : jsgyogu, roleSeq : jsroleSeq, academic : jsacademic, major : jsmajor }),
			dataType:'json',
			
			success : function(result) {
				if(result){
			
					location.href='/report/mokjang/regist.oe';
					
				}
				else{
					alert("실패하였습니다");
					return;
				}
				}
		});
		
	} 
	
	function cancel(){
		yesorno = confirm("이페이지에서 나가시겠습니까?")
		if(yesorno == true){
		if('${sessionId.roleSeq}'<=4){
		 location.href='/user/saintList.oe'; 
		}else{
		 	location.href='/user/list.oe';
			}
		}
	}
	
	
	</script>

		
	</body>

</html>