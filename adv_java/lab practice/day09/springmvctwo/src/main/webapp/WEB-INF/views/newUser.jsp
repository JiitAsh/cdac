<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<form:form action="register" modelAttribute="objUser">
	UserName: <form:input path="userName" />
	Password: <form:input path="password" />
	Name: <form:input path="name" />
	Email: <form:input path="email" />
		<form:button value="submit">Register</form:button>
	</form:form>
</body>
</html>