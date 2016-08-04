<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello.jsp</title>
</head>
<body>
	<h1>Login</h1>
	<form action="loginProcess.jsp" method="POST">
		<label>ID :</label>
		<input type="text" name="id"/><br>
		<label>PW :</label>
		<input type="text" name="pw"/><br>
		<input type="submit" value="login"/>
		<sec:csrfInput/>
	</form>
</body>
</html>