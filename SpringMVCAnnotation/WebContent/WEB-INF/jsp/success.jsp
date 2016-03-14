<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Book Details</h4>
<b>Book 1</b>
<ol>
	<li>${command.bookNumber}
	<li>${command.bookName }
	<li>${command.subject }
	<li>${command.code.intCode}-${command.code.bookCode}-${command.code.category }
	<!--  <li>${bookObj } -->
	<!--  <li>${command } -->
</ol>
</body>
</html>