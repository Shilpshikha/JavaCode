<%@ page language="java" import="java.util.*,com.training.daos.Customer" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Customer> custlist = (List<Customer>)request.getAttribute("custList");
	
%>
<table border='1' cellspacing='0'>
<tr>
	<th><% out.println("Customer ID"); %></th>
	<th><% out.println("Customer Name"); %></th>
	<th><% out.println("Customer Phone"); %></th>
	<th><% out.println("Customer Email"); %></th>
	<th><% out.println("Customer Dob"); %></th>
	<th><% out.println("Customer LandLine"); %></th>
	<th><% out.println("Customer Date"); %></th>
	
</tr>
<%for(Customer cust : custlist){ %>
<tr>
	<td><% out.println(cust.getCusid()); %></td>
	<td><% out.println(cust.getCusname()); %></td>
	<td><% out.println(cust.getPhone()); %></td>
	<td><% out.println(cust.getEmail()); %></td>
	<td><% out.println(cust.getDob()); %></td>
	<td><% out.println(cust.getLandlineno()); %></td>
	<td><% out.println(cust.getDt());} %></td>
</tr>
</table>

</body>
</html>