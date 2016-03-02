<%@ page import="java.util.*,com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selected book</title>
</head>
<body>
<h3>Book details</h3>
<table border='1' cellspacing='0'>
	<tr>
		<th>Book Id</th>
		<th>Book name</th>
		<th>Book author</th>
		<th>Price</th>
	<tr>
<%
	 Book bk = (Book)request.getAttribute("foundBook");
	
%>

	<tr>
		<td><% out.println(bk.getBookNumber()); %></td>
		<td><% out.println(bk.getBookName());%></td>
		<td><% out.println(bk.getAuthor()); %></td>
		<td><% out.println(bk.getPrice()); %></td>
	<tr>

	
</table>
</body>
</html>