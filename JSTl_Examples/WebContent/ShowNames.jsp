<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
</head>
<body>

 
 <c:forEach var="stud" items="${requestScope.studentList}">
 <!--  	<c:out value="${stud}"/> -->
 	
 <c:if test="${stud.contains('ee')}">
	<span style="font-style:italic; transform :"><c:out value="${stud}"/></span>
 </c:if>
 
 </c:forEach>
 
 
</body>
</html>