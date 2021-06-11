<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
</head>
<body>

	<!-- Main div -->
	<div class="container">
	
		<!-- Header div -->
		<div><h1>Admin Login</h1></div>
		
		<!-- Form div -->
		<div class="row">
			<form class="form"  action="/FlyAway2/login" method="POST">
			
				<div class="form-group">
				   <label>Login</label>
					<input type="text" name="username" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>Password</label>
					<input type="password" name="password" class="form-control" required>
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Search</button>
				</div>
				

			</form>
		</div>
	</div>
</body>
</html>