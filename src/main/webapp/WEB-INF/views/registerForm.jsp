<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittr</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/style.css' />">
</head>
<body>
	<h1>Register</h1>
	
	<sf:form method="POST" commandName="spitter">
		First Name: <sf:input path="firstName"/><sf:errors path="firstName"/><br/>
		Last Name: <sf:input path="lastName"/><sf:errors path="lastName"/><br/>
		Email: <sf:input type="email" path="email"/><sf:errors path="email"/></br>
		Username: <sf:input path="username"/><sf:errors path="username"/><br/>
		Password: <sf:password path="password"/><sf:errors path="password"/><br/>
		<input type="submit" value="Register"/>
	</sf:form>
</body>
</html>