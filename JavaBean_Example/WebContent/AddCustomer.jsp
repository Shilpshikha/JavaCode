<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<%@ include file= "Header.jsp" %>
	</header>
	
	<section>
		<form action="ProcessCustomer.jsp">
			<label>Customer Id</label>
				<input type= "text" name="customerId">
			<label>Customer Name</label>
				<input type= "text" name="customerName">
			<label>Email</label>
				<input type= "email" name="email">
			<label>HandPhone</label>
				<input type= "tel" name="handPhone" pattern="\d{10}">
				
			<input type="submit" value= "Add">
		</form>
	</section>

	<footer>
		<%@ include file ="Footer.jsp"  %>
	</footer>
</body>
</html>