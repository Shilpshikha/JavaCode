<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
</head>
<body>
<h1>Show All Request</h1>
<table>
	<c:forEach items="${reqList }" var="req">
		<tr>
			<td>
				<spring:url value="/findRequest/${req.name }/${req.email }" var="url" htmlEscape="true"></spring:url>
				<a href="${url }">${req.name }</a>
			</td>
			<td>
				<c:out value="${req.mobileNum }"/>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>