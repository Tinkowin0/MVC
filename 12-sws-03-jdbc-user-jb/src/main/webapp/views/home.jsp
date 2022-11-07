<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security Demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container pt-4 ">
		<h3>Security DEmo</h3>

		<div>
			
			<a href="/" class="btn btn-primary">Home</a>
			
			<sec:authorize access="hasAuthority('Admin')">
				<a href="/admin/home" class="btn btn-danger">Admin</a>
			</sec:authorize>
		
			<a href="/member/home" class="btn btn-info">Member</a>
			
			<sec:authorize access="isAnonymous()">
				<a href="/signup" class="btn btn-secondary">Sign Up</a>
			</sec:authorize>
			
			<sec:authorize access="isAuthenticated()">
				<a href="/logout" class="btn btn-secondary">Sign Out</a>
			</sec:authorize>
		</div>

		<div class="mt-4">
			<img src="/resources/img/smooth.jpg" alt="Cover Image" width="800" />
		</div>
	</div>

</body>
</html>