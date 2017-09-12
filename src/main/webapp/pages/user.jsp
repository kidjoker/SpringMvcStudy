<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validate user</title>
</head>
<body>
	<form:form commandName="user" action="/SpringMvcStudy/valid/signup"
		method="POST">
		<form:errors path="*" />
		<br />
		用户名<form:input path="userName" />
	</form:form>
</body>
</html>