<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Ticket</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
</head>
<body>


	<!-- Main div -->
	<div class="container">
	
		<!-- Header div -->
		<div><h1>Create Flight</h1></div>
		
		<!-- Form div -->
		<div class="row">
			<form action="/FlyAway2/add-ticket" method="POST">
			
				<div class="form-group">
					<label>flight number</label>
					<input type="number" name="flightNum" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>price</label>
					<input type="text" name="price" class="form-control" placeholder="0" required>
				</div>
				
				<div class="form-group">
					<button class="btn btn-success"> Search</button>
				</div>
				

			</form>
		</div>
	</div>
</body>
</html>