<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	
   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header active">
		      <a class="navbar-brand active" href="" >Payment</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="search.jsp">Search</a></li>
		    </ul>
		  </div>
		</nav>
	</div>
		
		<!-- Form div -->
		<div class="row container-fluid">
			<form action="/FlyAway2/add-ticket" method="POST">
			
				<div class="form-group">
					<label>firstname</label>
					<input type="text" name="fname" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>lastname</label>
					<input type="text" name="lname" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>credit card number</label>
					<input type="number" name="creditNum" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>Expiration Date</label>
					<input type="date" name="street" class="form-control" required>
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Buy</button>
				</div>
				

			</form>
		</div>
	</div>

</body>
</html>