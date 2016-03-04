<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Authentication</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<!--<c:set var="loginuser" value="log" scope="session"/>-->

<%@ include file="Header.jsp" %>
<c:if test="${param.username eq 'ashish'}">
<c:out value="Welcome ${param.username}" />
<a href="Second.jsp">Next</a>
</c:if>

<c:if test="${!(param.username eq 'ashish')}">
<c:out value="Wrong username"/>
<a href="login.jsp">Login again</a>
</c:if>

</body>
</html>