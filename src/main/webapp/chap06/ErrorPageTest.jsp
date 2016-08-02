<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage = "/chap06/errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ErrorPageTest.jsp</title>
</head>
<body>
	<h1>ErrorPageTest.jsp</h1>
	<%
		int num=10;
		num =num / 0;
	%>
</body>
</html>