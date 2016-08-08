<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.button {
		display: inline-block;
		background-color: #F0F0F0;
		border: 1px solid #E75C37;
		border-radius: 5px;
		line-height: 1;
		padding: 3px;
		font: 14px 'Nanum Gothic';
		font-weight: 800;
		color:#E75C37;
		text-decoration: none;
	}
</style>
<title>index.html</title>
</head>
<body>
	<h1>설정 확인</h1>
	<ol>
		<li><a href = "Hello.html">HTML 확인</a></li>
		<li><a href = "Hello.jsp">JSP 확인</a></li>
		<li><a href = "HelloServlet">Servlet 확인</a></li>
		<li><a href = "Dept.jsp">Mybatis Dept 확인</a></li>
		<li><a href = "Emp.jsp">Mybatis Emp 확인</a></li>
		<li><a href = "cookie/Dept.jsp">Cookie 로그인</a></li>
		<li><a href = "session/Dept.jsp">Session 로그인</a></li>
		<li><a href = "logout.jsp">로그아웃</a></li>
	</ol>
</body>
</html>