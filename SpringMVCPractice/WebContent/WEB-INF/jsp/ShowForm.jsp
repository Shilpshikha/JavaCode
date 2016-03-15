<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rental Details</title>
</head>
<body>
	<h3> Car rental Details</h3>
	<ol>
		<li>${command.name }
		<li>${command.mobileNum }
		<li>${command.email }
		<li>${command.type }
	</ol>
	
	<section>
		<form action="check">
			Please enter your name
			<input type="text" name="name">
			<input type="submit" value="check">
			<p>${prevBooking }</p>
		</form>
	</section>
</body>
</html>