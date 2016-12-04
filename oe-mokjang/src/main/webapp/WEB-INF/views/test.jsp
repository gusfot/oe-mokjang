<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="/resources/js/jquery.js"></script>
<script type="text/javascript">

function testAjax() {
	/* $.ajax({
		type:"POST",
		url : "/ajaxTest.oe",
	 	//data : ({userId : $userId.val(), pw : $userPw.val()}),
		dataType : 'json',
		success:function(result){
		 	
		}
	});  */
	
	location.href='/testPop.oe';
}

</script>
</head>
<body>
<div>
email : ${email} <br />
passwore : ${pw }
</div>
<div id = "testDiv">

</div>
</body>
</html>