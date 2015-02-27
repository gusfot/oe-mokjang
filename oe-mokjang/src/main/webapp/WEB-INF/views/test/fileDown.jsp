<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>파일 다운로드 테스트(SpringMVC Annotation)</h1>
	파일첨부:<a href="download.file?saveFileName=${saveFileName}&originalFileName=${originalFileName}">${originalFileName}</a><br>
	파일설명:${content}<br>
	파일종류:${contentType}<br>
</div>

</body>
</html>