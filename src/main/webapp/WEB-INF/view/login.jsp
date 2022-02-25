<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<c:if test="${param.error != null}">
		<i style="color: red">invalid credentials</i>
	</c:if>
	
	<c:if test="${param.logout != null}">
		<i style="color: red">you are successfully logged out</i>
	</c:if>
	<h1>My custom login page</h1>
	<form:form method="post" action="process-login">
		Username: <input type="text" placeholder="username" name="username">
		Password: <input type="password" placeholder="password" name="password">
		<input type="submit" value="login">
	</form:form>
</body>
</html>