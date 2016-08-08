<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello.jsp</title>
</head>
<body>
<form action="/Detail" method="post">
	<sec:csrfInput/>
	<input type="submit"/>
</form>
</body>
</html>