<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<h5>Student Form</h5>
<form:form method="POST" action="PostDetails">
<table>
	<tr>
		<td><label>Student Roll No.</label></td>
			<td><form:input path="rollNo"/></td>
	</tr>
	<tr>
		<td><label>Student Name</label></td>
			<td><form:input path="name"/></td>
	</tr>	
	<tr>	
		<td><label>Department</label></td>
			<td><form:select path="department" items="${dept }"></form:select></td>
	</tr>
	<tr>	
		<td><label>Academic marks</label></td>
			<td><form:input path="academics"/></td>
	</tr>
	<tr>
		<td><label>Academic events</label></td>
			<td><form:input path="acadEvents"/></td>
	</tr>
	<tr>
		<td><label>Sports events</label></td>
			<td><form:input path="sportsEvents"/></td>
	</tr>	
	<tr>
		<td><label>Cultural Events</label></td>
			<td><form:input path="culturalEvents"/></td>
	</tr>
	<tr>
	<td><label>Select Image</label></td>
		<td><input name="image" type="file"></td>
	</tr>
	<tr>	
		<td><input type="submit" value="Add"></td>
	</tr>
</table>		
</form:form>
</body>
</html>