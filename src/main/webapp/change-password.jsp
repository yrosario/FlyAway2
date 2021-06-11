<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
	
</head>
<body>

   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Change Password</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="admin.jsp">Home</a></li>
		      <li>		
		      	<!-- Log out button -->
		      	   <form action="/FlyAway2/login">
		      	   		<input type="hidden" name="logout" value="true">
		  				<button class="btn btn-lg">
		  					<span class="glyphicon glyphicon-log-out"></span> Log out
          				</button>
          			</form>
          		
          	</li>
		    </ul>
		  </div>
		</nav>
	</div>
		
	<div class="container">	
		<!-- Form div -->
		<div class="row">
			<form class="form"  action="/FlyAway2/change-password" method="POST">
			
				<div class="form-group">
				   <label>Login</label>
					<input type="text" name="username" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>Password</label>
					<input type="password" name="password" class="form-control" required>
				</div>
				
				<div class="form-group">
			    <label>Retype Password</label>
					<input type="password" name="retyPassword" class="form-control" required>
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Change</button>
				</div>
				

			</form>
		</div>
	</div>
</div>
</body>
</html>