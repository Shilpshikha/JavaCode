<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<h3>Student List</h3>
<a href="/InternalProject3/">Home</a>
<table border="1" cellspacing="0">
	<tr>
		<th><label>Student Roll</label></th>
		<th><label>Students Name</label></th>
		<th><label>Student Department</label></th>
	<!-- <th><label>Academic marks</label></th>
		<th><label>Academic events</label></th>
		<th><label>Sports events</label></th>
		<th><label>Cultural events</label></th> -->
		<th><label>Grade</label></th>
		<th><label>Image</label></th>
	</tr>

<c:forEach items="${student}" var="student">
	<tr>	
		<td>${student.rollNo }</td>
		<td>${student.name }</td>
		<td>${student.department }</td>
	<!--  	<td>${student.academics }</td>
		<td>${student.acadEvents }</td>
		<td>${student.sportsEvents }</td>
		<td>${student.culturalEvents }</td> -->
		<td>${student.grade }</td>
		<td><img src="../resources/images/${student.image }" height="100px" width="100px"></td>

</c:forEach>	
</table>

</body>
</html>