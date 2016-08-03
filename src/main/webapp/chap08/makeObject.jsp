<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" scope="request" class="com.hybrid.domain.MemberInfo"></jsp:useBean>
<% 
	member.setId("obsidians");
	member.setName("자바");
%>
<jsp:forward page="useObject.jsp" />