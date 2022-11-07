<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign IN</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container pt-5">
		<h2>SIGN UP</h2>
		<div class="row">
			<div class="col-5">
				<form action="/login" method="post">
					<div class="mb-3">
						<label for="loginId">Login ID</label> <input type="text"
							id="loginId" name="loginId" placeholder="Enter Login Id"
							class="form-control" />
					</div>
					<div class="mb-3">
						<label for="password">Password</label> <input type="password"
							id="password" name="password" placeholder="Enter Password"
							class="form-control" />
					</div>
					<div class="mb-3">
						<button type="submit" class="btn btn-primary">Sign In</button>
						<a href="/signup" class="btn btn-primary"> Sign UP</a>
					</div>

				</form>

			</div>
		</div>
	</div>
</body>
</html>