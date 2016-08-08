<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestHeader.jsp</title>
</head>
<body>
	<%= request.getHeader("User-Agent") %>
	${header.User-Agent }
	${header["User-Agent"]}
</body>
</html>