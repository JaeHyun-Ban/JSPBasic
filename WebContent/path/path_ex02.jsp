<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>path_ex02</h2>
	
	<a href="test/path_ex03.jsp">path_ex03(상대경로)</a><br>
	<a href="/JSPBasic/path/test/path_ex03.jsp">path_ex03(절대경로)</a><br>
	<!-- 자동 경로 -->
	<a href="<%=request.getContextPath() %>/path/test/path_ex03.jsp">path_ex03(리퀘스트로 path얻어옴)</a>
	
	
	
</body>
</html>