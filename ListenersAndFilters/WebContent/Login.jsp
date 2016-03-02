<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
		<div id="hdleft"></div>
			<img alt="logc" src="images/kopal1.jpg">
		<div id="hdright">
			<h1>Floral Restaurant</h1></div>
	</header>

	<div id="nav">
		<ul>
		<li><a href="home.html"><span style ="padding-left:5px">home</span></a></li>
		<li><a href="book.html">book</a></li>
		<li><a href="order.html">order</a></li>
		<li><a href="review.html">reviews</a></li>
		<li><a href="contact.html">contact</a></li>
		</ul>
	</div>
	
	<section>
		<form action = "SecondServlet" method = "post">
			<table>
				<tr>
					<td><label>Username</label></td>
					<td><input type = "text" id="userText" name="userName" required="required" placeholder="username"></td>
				</tr>
				
				<tr>
					<td><label>Password</label></td>
					<td><input type = "password" name="passWord"></td>
				</tr>
				
				<tr>
					<td><label>Role</label></td>
					<td>
						<select name = "role">
							<option value ="ADM">Administrator</option>
							<option value ="CHF">Chef</option>
							<option value ="WAI">Waiter</option>
							<option value ="MGR">Manager</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value = "Login" name="submit">
					</td>
				<tr>
			</table>
		</form>
	</section>
</body>
</html>