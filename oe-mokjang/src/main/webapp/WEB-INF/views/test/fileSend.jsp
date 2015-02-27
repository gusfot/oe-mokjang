<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>파일 업로드 테스트</h1>
<form action="filueupTest.oe" method="post" enctype="multipart/form-data">
	<input type="hidden" name="mode" value="uploadOk">
	 <label >파일첨부</label>	<input type="file" name="upload" ><br>
	 <label >파일설명</label>	<input type="text" name="content" ><br>	
	 <input type="submit" value="전송">
</form>

</body>
</html>