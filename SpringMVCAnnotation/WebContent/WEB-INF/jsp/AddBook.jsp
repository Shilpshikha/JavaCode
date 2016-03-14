<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri ="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
	<form:form method="post" action="addBook.htm">
		<label>Book Number</label>
		<form:input path="bookNumber"/>
		
		<label>BookName</label>
		<form:input path="bookName"/>
		
		<label>Subject</label>
		<form:select path ="subject" items="${subjectCode}"></form:select>
		
		<label>ISBN</label>
		<form:input path="code.intCode"/>
		<form:input path="code.bookCode"/>
		<form:input path="code.category"/>		
		
		<input type="submit" value="Add">
	
	</form:form>
</body>
</html>