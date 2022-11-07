<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security || Admin Demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container pt-4 ">
		<h3>ADMIN DEmo</h3>
		
		<div class="mt-4">
		<a href="/" class="btn btn-primary">Home</a>
		<a href="/logout" class="btn btn-warning">SignOut</a>
		
		</div>
		<app:access list="${listAll }"></app:access>
	</div>

</body>
</html>