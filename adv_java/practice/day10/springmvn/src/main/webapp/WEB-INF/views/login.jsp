<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
	<form:form action="authenticate" modelAttribute="objUser">
	UserName:<form:input path="userName"/><br/>
	Password: <form:input path="password"/><br/>
	<form:button value="submit">Login</form:button>
	
	</form:form>
</body>
</html>