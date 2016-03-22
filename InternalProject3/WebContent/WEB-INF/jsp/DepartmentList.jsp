<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department List</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
</head>
<body>
<h2>Department List</h2>
<table>
	<c:forEach items="${deptlist }" var="studs">
		<tr>
			<td>
				<spring:url value="/topperList/${studs }" var="url" htmlEscape="true"></spring:url>
				<a href="${url }">${studs}</a>
			</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>