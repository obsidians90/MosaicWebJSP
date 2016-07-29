<%@page import="java.util.List"%>
<%@page import="com.hybrid.domain.Dept"%>
<%@page import="com.hybrid.mapper.DeptMapper"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept.jsp</title>
</head>
<body>
	<h1>Dept 테스트</h1>
	<%
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		DeptMapper mapper = ctx.getBean(DeptMapper.class);
		mapper.delete(65);
		mapper.insert(new Dept(65, "xxx", "yyy"));
		List<Dept> depts = mapper.selectAll();
		for (Dept d : depts) {
			System.out.println(d);
			out.println(d + "<br>");
		}
		System.out.println("---------------------------------------");
		out.println("<hr>");
		mapper.update(new Dept(65, "zzz", "www"));
		depts = mapper.selectAll();
		for (Dept d : depts) {
			System.out.println(d);
			out.println(d + "<br>");
		}
		System.out.println("---------------------------------------");
		out.println("<hr>");
		mapper.delete(65);
		depts = mapper.selectAll();
		for (Dept d : depts) {
			System.out.println(d);
			out.println(d + "<br>");
		}
	%>
</body>
</html>