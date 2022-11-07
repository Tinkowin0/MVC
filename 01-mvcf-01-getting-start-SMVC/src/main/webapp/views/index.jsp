<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello MVC</title>
</head>
<body>
	
	<h1>Hello Spring MVC</h1>
	
	<p>
	<c:out value="${hi }"></c:out>
	
	</p>
	
	<ul>
		<li><c:url value="/leg" var="first"></c:url>
		
			<a href="${first }">Go to Legacy Controller</a>
		</li>
	</ul>
	

</body>
</html>