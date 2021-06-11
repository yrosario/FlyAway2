<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	
   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header active">
		      <a class="navbar-brand active" href="" >User Registration</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="search.jsp">Search</a></li>
		    </ul>
		  </div>
		</nav>
	</div>
		
		<!-- Form div -->
		<div class="row container-fluid">
			<form action="/FlyAway2/register" method="POST">
			
				<div class="form-group">
					<label>firstname</label>
					<input type="text" name="fname" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>lastname</label>
					<input type="text" name="lname" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>age</label>
					<input type="number" name="age" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>street</label>
					<input type="text" name="street" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>city</label>
					<input type="text" name="city" class="form-control">
				</div>
				
				<div class="form-group">
					<label>state</label>
					<input type="text" name="state" class="form-control">
				</div>
				
				<div class="form-group">
					<label>country</label>
					<input type="text" name="country" class="form-control">
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Add</button>
				</div>
				

			</form>
		</div>
	</div>

</body>
</html>