<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sub.jsp</title>
</head>
<body>
	<%
		for (int i = 0; i < 4; i++) {
			out.println("sub " + i + "<br>");
		}
	%>
</body>
</html>