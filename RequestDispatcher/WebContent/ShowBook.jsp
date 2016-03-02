<%@ page import="java.util.*,com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing all books</title>
</head>
<body>

<table border='1' cellspacing='0'>
	<tr>
		<th>Book Id</th>
		<th>Book name</th>
		<th>Book author</th>
		<th>Price</th>
	<tr>

<%
	HashMap<Long,Book> bookList = (HashMap<Long,Book>)request.getAttribute("foundBooks");

	//out.println(bookList.toString());
	
	for(Book book : bookList.values()){ %>
	<tr>
		<td><% out.println(book.getBookNumber()); %></td>
		<td><% out.println(book.getBookName());%></td>
		<td><% out.println(book.getAuthor()); %></td>
		<td><% out.println(book.getPrice()); }%></td>
	<tr>

	
</table>

</body>
</html>