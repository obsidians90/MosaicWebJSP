<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.hybrid.domain.Emp"%>
<%@page import="com.hybrid.mapper.EmpMapper"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp.jsp</title>
</head>
<body>
	<h1>Emp 테스트</h1>
	<%
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		EmpMapper mapper = ctx.getBean(EmpMapper.class);
		mapper.delete(7966);
		mapper.insert(new Emp(7966, "BILLY", "CLERK", 7839, new Date("1990/04/20"), 1400.00, 550.00, 30));
		List<Emp> emps = mapper.selectAll();
		for (Emp e : emps) {
			System.out.println(e);
			out.println(e + "<br>");
		}
		System.out.println("---------------------------------------");
		out.println("<hr>");
		mapper.update(new Emp(7966, "BILLY", "CLERK", 7839, new Date("1990/04/20"), 1880.00, 900.00, 30));
		emps = mapper.selectAll();
		for (Emp e : emps) {
			System.out.println(e);
			out.println(e + "<br>");
		}
		System.out.println("---------------------------------------");
		out.println("<hr>");
		mapper.delete(7966);
		emps = mapper.selectAll();
		for (Emp e : emps) {
			System.out.println(e);
			out.println(e + "<br>");
		}
	%>
</body>
</html>