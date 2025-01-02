<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Jsp page</title>
</head>
<body>
	<%
	System.out.println("firstjsp fired....");
	String userName=request.getParameter("userName");
	String password=request.getParameter("password");
	%>
	
	This is the first jsp page
	
	<%= userName %><br/>
	<%-- System.out.println("Checking expression in jsp....") --%><br/>
	<%-- this is comment... --%>
	<%--<jsp:forward page="second.jsp">click</jsp:forward> --%>
	
	<% response.sendRedirect("http://google.co.in"); %>
	
</body>
</html>