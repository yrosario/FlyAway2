<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Flight</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>

	<!-- Main div -->
	<div class="container">
	
		<!-- Header div -->
		<div><h1>Selected Tickets</h1></div>
			<p>${sessionScope.firstFlightId}</p>
			<p>${sessionScope.secondFlightId}</p>
			<br>
		          <c:forEach var="flightList" items="${sessionScope.depFlight}">
                     
			                    
			                  <p>${flightList.departingTime}</p>
			                    		${flightList.arrivalTime}
			                    		<br>
			                    		${flightList.leavingFrom}
			                    		<br>
			                    		${flightList.arrivingAt}
			                    		<br>
			                    		${flightList.seatsLeft}
		
							</c:forEach>
		
		<!-- div containing flight details -->
		<div>
			<div class="row">
				<div class="col-sm">
					<div class="row">
						
						<!-- Print ticket detais -->
						<div class="col-sm">
							
							<c:forEach var="flightList" items="${sessionScope.depFlight}">
                     
			                     <!-- Print flight detail infomation -->
			                    <div class="row">
			                    	<div class="col">
			                    		${flightList.departingTime}
			                    		${flightList.arrivalTime}
			                    		<br>
			                    		${flightList.leavingFrom}
			                    		<br>
			                    		${flightList.arrivingAt}
			                    		<br>
			                    		${flightList.seatsLeft}
			                    	</div>	    
								</div>
								
							</c:forEach>
						</div>
				 </div>
			</div>
			
			
				<div class="col-sm">
					<p>test</p>
				</div>
				
			</div>
		
		</div>

		
	</div>

</body>
</html>