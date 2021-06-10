<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
	
</head>
<body>

	<!-- Main div -->
	<div class="container">
	
		<!-- Header div -->
		<div><h1>Search flights</h1></div>
		
		<!-- Form div -->
		<div class="row">
			<form class="form-inline"  action="SearchServlet" method="POST">
			
				<div class="form-group">
						<label>Departing From</label>
					  	<select id="from" name="airline" class="form-control" required>
    						<option value="1" selected>Boston</option>
    						<option value="2">NY City</option>
    						<option value="3">LA</option>
    						<option value="4">Miami</option>
 						 </select>
				</div>
				
				<div class="form-group">
						<label>Destination</label>
						<select id="to" name="airline" class="form-control" required>
    						<option value="1">Boston</option>
    						<option value="2" selected>NY City</option>
    						<option value="3">LA</option>
    						<option value="4">Miami</option>
 						 </select>
				</div>
				
				<div class="form-group">
					<input type="date" name="departing" class="form-control" required>
				</div>
				
				<div class="form-group">
					<input type="date" name="returning" class="form-control" required>
				</div>
				
				<div class="form-group">
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
     					<path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
    				</svg>
					<input type="number" name="numPassangers" class="form-control" min = 1 required>
				</div>
				
				<div class="form-group">
					<button type="submit" class="btn btn-success"> Search</button>
				</div>
				

			</form>
		</div>
	</div>
</body>
</html>