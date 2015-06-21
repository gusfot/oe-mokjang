<DOCTYPE html PUBLIC "-//W3C//thD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/thD/xhtml1-transitional.thd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=euc-kr" />
		<title>목장관리시스템 - 정충상 정보상세</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<link rel="stylesheet" type="text/css" href="css/common.css" />
		<link rel="stylesheet" type="text/css" href="css/layout.css" />
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
					<div class="header_delete"><a href="#"><img src="./img/btn_close.png"></a></div>
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
									<th>사진</th>
									<td><p class="person_photo"><img src="./img/person.png" style="margin:5px;"></p>
									<form><label class="attend_chk"><input type="checkbox" name="checkbox-0" data-mini="true">사진파일삭제</label></form>
									<input type="file" data-clear-btn="true" name="file-2" id="file-2" value="" data-mini="true">
									</td>
								</tr>
								<tr>
									<th>목자</th>
									<td><input type="text" data-clear-btn="true" name="text-3" id="text-3" value="장성주" data-mini="true"></td>
								</tr>
								<tr>
									<th>성명</th>
									<td><input type="text" data-clear-btn="true" name="userName" id="userName" value="정충상" data-mini="true"></td>
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
									<td><input type="date" data-clear-btn="true" name="date-2" id="date-2" value="2015-03-03" data-mini="true"></td>
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
					<a href="#" class="ui-btn ui-btn-b ui-corner-all ui-icon-check ui-btn-icon-left ui-mini">목장보고서 저장</a>
				</div>
			</div>
			<div class="footer_wrap">
				<div class="footer">

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
		
/* 	alert(jsuserId+jsuserName+jspassword+jsaddr+jscellPhone+jshomePhone+jsjob+jsgender+jsroleSeq+jsbirth+jsemail
			+jsflag+jsregDt+jsgyogu);
		 */
		
		var phonestr = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
		
		if(document.regist_form.email.value==""){
			alert("이메일주소를 입력하세요");
			document.regist_form.email.focus();
			return;
			
		}else if(document.regist_form.userId.value==""){
			alert("아이디를 입력하세요");
			document.regist_form.userId.focus();
			return;
			
		}else if(document.regist_form.password.value==""){
			alert("비밀번호를 입력하세요");
			document.regist_form.password.focus();
			return;
			
		}else if(document.regist_form.userName.value==""){
			alert("이름을 입력하세요");
			document.regist_form.userName.focus();
			return;
			
		}else if(document.regist_form.job.value==""){
			alert("직업을 입력하세요");
			document.regist_form.job.focus();
			return;
			
		}else if(document.regist_form.addr.value==""){
			alert(" 주소를 입력하세요");
			document.regist_form.addr.focus();
			return;
			
		}else if(document.regist_form.birth.value==""){
			alert(" 생일을 입력하세요");
			document.regist_form.birth.focus();
			return;
			
		}else if(document.regist_form.cellPhone.value==""){
			alert(" 핸드폰 번호를 입력하세요");
			document.regist_form.cellPhone.focus();
			return;
			
		}else if(document.regist_form.homePhone.value==""){
			alert(" 집전화 번호를 입력하세요");
			document.regist_form.homePhone.focus();
			return;
		} else if(document.regist_form.academic.value ==""){
			alert("최종학력을 입력하세요");
			document.regist_form.academic.focus();
			return;
		} else if(document.regist_form.major.value == "" ){
			alert("전공을 입력하세요");
			document.regist_form.major.focus();
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
						
						if(result==true){
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
				if(result==true){
			
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