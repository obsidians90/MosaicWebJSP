<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
	<h1>로그아웃</h1>
		<form action="/Logout" method="post">
		<sec:csrfInput/>
		<input type="submit" value="로그아웃"/>
	</form>
</body>
</html>