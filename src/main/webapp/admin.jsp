<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>

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
		      <li><a href="">Home</a></li>
		      <li>		
		      	<!-- Log out button -->
		      	   <form action="/FlyAway2/login" method="get">
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
          
          
		<!-- Body div -->
		<div>
			
			<div class="list-group">
			    <a href="add-flight.jsp" class="list-group-item list-group-item-action">Add Flight</a>
			    <a href="change-password.jsp" class="list-group-item list-group-item-action">Change Password</a>
			    <a href="create-admin.jsp" class="list-group-item list-group-item-action">Add Admin User</a>
			</div>
		
		</div>
	</div>
</body>
</html>