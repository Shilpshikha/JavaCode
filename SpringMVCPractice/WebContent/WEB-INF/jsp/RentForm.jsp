<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<h2>Car Rental Form</h2>
<form:form method="POST" action="ShowForm" >

	<form:errors path="*"></form:errors>
	
	
	<label>Name</label>
		<form:input path="name"/>
	<label>Mobile Number</label>
		<form:input path="mobileNum"/>
	<label>Email</label>
		<form:input path="email"/>
	<label>Type</label>
		<form:select path="type" items="${carType}" />
		
	<input type="submit" value="Submit">
</form:form>
</body>
</html>