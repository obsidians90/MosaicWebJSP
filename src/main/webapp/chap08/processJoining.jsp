<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="memberinfo" class="com.hybrid.domain.MemberInfo"></jsp:useBean>
<jsp:setProperty name="memberinfo" property="*"></jsp:setProperty>
<jsp:setProperty name="memberinfo" property="password" value="<%= memberinfo.getId() %>"></jsp:setProperty>
<html>
<head>
<title>가입</title>
</head>
<body>
	<table width="400" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>아이디</td>
			<td><jsp:getProperty property="id" name="memberinfo"/></td>
			<td>암호</td>
			<td><jsp:getProperty property="password" name="memberinfo"/></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><jsp:getProperty property="name" name="memberinfo"/></td>
			<td>이메일</td>
			<td><jsp:getProperty property="email" name="memberinfo"/></td>
		</tr>
	</table>
</body>
</html>