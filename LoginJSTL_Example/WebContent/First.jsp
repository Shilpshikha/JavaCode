<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	<c:if test="${requestScope.valid eq true}">
	<c:set var="log" value="login" scope="session"/>
	<c:redirect url="Second.jsp"/>
	</c:if>
	
	<c:if test="${!(requestScope.valid eq true)}">
	<c:out value="Wrong username"/>
	<c:redirect url="login.jsp"/>
	</c:if>
</body>
</html>