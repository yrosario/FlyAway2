<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Flight</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Add Flight</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="admin.jsp">Home</a></li>
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
		
		<!-- Form div -->
		<div class="row container-fluid">
			<form action="/FlyAway2/add-flight" method="POST">
			
				<div class="form-group">
					<select id="from" name="from" class="form-control" required>
    					<option value="Boston">Boston</option>
    					<option value="NY City">NY City</option>
    					<option value="LA">LA</option>
    					<option value="Miami">Miami</option>
 					</select>
				</div>
				
				<div class="form-group">
					<select id="to" name="to" class="form-control" required>
    					<option value="Boston">Boston</option>
    					<option value="NY City">NY City</option>
    					<option value="LA" selected>LA</option>
    					<option value="MIAMI">Miami</option>
 					</select>
				</div>
				
				<div class="form-group">
					<label>Departing Date</label>
					<input type="date" name="departingDate" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>Departing Time</label>
					<input type="time" name="departingTime" class="form-control" min = "00:00" max = "23:59" required>
				</div>
				
				<div class="form-group">
					<label>Arrival Date</label>
					<input type="date" name="arrivalDate" class="form-control" required>
				</div>
				
				<div class="form-group">
					<label>Arrival Time</label>
					<input type="time" name="arrivalTime" class="form-control" min = "00:00" max = "23:59" required>
				</div>
				
				<div class="form-group">
					<label>Airline</label>
					  	<select id="airline" name="airline" class="form-control" required>
    						<option value="Jet Blue">Jet Blue</option>
    						<option value="American">American</option>
    						<option value="Delta">Delta</option>
    						<option value="Spirit">Spirit</option>
 						 </select>
				</div>
				
				<div class="form-group">
					<label>capacity</label>
					<input type="number" name="capacity" class="form-control" min = 80 required>
				</div>
				
				<div class="form-group">
					<label>Seats Left</label>
					<input type="number" name="seatsLeft" class="form-control" min = 0 required>
				</div>
				
				<div class="form-group">
					<label>price</label>
					<input type="number" name="price" class="form-control" min = 0 step="0.01" required>
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Add</button>
				</div>
				

			</form>
		</div>
	</div>

</body>
</html>