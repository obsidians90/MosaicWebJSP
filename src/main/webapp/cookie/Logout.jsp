<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout.jsp</title>
</head>
<body>
	<%
		Cookie c = new Cookie("LOGIN", "success");
		c.setPath("/cookie");
		c.setMaxAge(0);
		response.addCookie(c);
		response.sendRedirect("/");
	%>
</body>
</html>