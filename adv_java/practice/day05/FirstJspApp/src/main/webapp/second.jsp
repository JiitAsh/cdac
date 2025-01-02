<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second Jsp page</title>
</head>
<body>
	This is the second jsp page
	<% System.out.println("Second jsp fired...."); %>
	
	<%= request.getParameter("userName")%>
	<%= request.getParameter("password") %>
</body>
</html>