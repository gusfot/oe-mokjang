<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>���� ���ε� �׽�Ʈ</h1>
<form action="filueupTest.oe" method="post" enctype="multipart/form-data">
	<input type="hidden" name="mode" value="uploadOk">
	 <label >����÷��</label>	<input type="file" name="upload" ><br>
	 <label >���ϼ���</label>	<input type="text" name="content" ><br>	
	 <input type="submit" value="����">
</form>

</body>
</html>