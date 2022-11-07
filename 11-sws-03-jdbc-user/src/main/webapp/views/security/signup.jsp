<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign UP</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container pt-5">
		<h2>MEMBER SIGN UP</h2>
		<div class="row">
			<div class="col-5">
			
					<sf:form action="/signup" modelAttribute="dto">
					<div class="mb-3">
						<label for="name">Name</label>
						<sf:input path="name" placeholder="Enter Name" class="form-control"/>
						<sf:errors path="name" ></sf:errors>
					</div>

					<div class="mb-3">
						<label for="loginId">Login Id</label>
						<sf:input path="loginId" placeholder="Enter Login Id" class="form-control"/>
						<sf:errors path="loginId"></sf:errors>
					</div>
					
					<div class="mb-3">
						<label for="password">Password</label>
						<sf:password path="password" placeholder="Enter Password" class="form-control" />
						<sf:errors path="password"></sf:errors>
					</div>
					
					<div>
						
						<button type="submit" class="btn btn-primary">Sign Up</button>
						
						<a href="/" class="btn btn-secondary">Home</a>
					
					</div>				
				</sf:form>


			</div>
		</div>
	</div>
</body>
</html>