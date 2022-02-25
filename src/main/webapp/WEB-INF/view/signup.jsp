<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Form</title>
</head>
<body>
	<h1>Signup Here !</h1>
	<form:form action="process-signup" method="post"
		modelAttribute="signupdto">

	Username: <form:input path="username" />
		<br>
	Password: <form:password path="password" />
		<br>
		<input type="submit" value="signup">

	</form:form>
</body>
</html>