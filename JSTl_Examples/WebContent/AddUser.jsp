<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting tag</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
</head>
<body>
<fmt:setLocale value="fr"/>
<fmt:setBundle basename="MessageResource" var="msg"/>
<form>
	<label><fmt:message key="forms.label.userName" bundle="${msg}"/> </label>
		<input type="text" name="userName">
	<label><fmt:message key="forms.label.passWord" bundle="${msg}"/></label>
		<input type="password" name="passWord">
	
	<jsp:useBean id="currentDate" class="java.util.Date"></jsp:useBean>
	
	Indian Time
	
		<fmt:formatDate value="${currentDate}" type="both"/>
	
	
	America Los angeles
	<fmt:timeZone value="America/LosAngeles">
		<fmt:formatDate value="${currentDate}" type="both"/>
	</fmt:timeZone>
	
	America Eastern Standard times
	<fmt:timeZone value="America/New_York">
		<fmt:formatDate value="${currentDate}" type="both"/>
	</fmt:timeZone>
</form>
</body>
</html>