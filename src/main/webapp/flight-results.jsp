<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
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
		<div id="header"><h1 id="headerTitle">Flight Results</h1></div>
	
		<!-- Body div -->
		<div class="container" id="body">
				<!-- check if first flight has been selected -->
				<c:choose>
					 <c:when test="${empty sessionScope.firstFlightId}">
						<c:set var="tempFlightList" value="${sessionScope.depFlights}" />
					</c:when>
					
					<c:when test="${empty sessionScope.secondFlightId}">
						<c:set var="tempFlightList" value="${sessionScope.retFlights}" />
					</c:when>
				</c:choose>
				
				<p>${sessionScope.firstFlightId}</p>
				<p>${sessionScope.secondFlightId}</p>
				
				<!-- Check if the user has selected to flights and redirect if the user has -->
				<script type="text/javascript">
					
					if((${sessionScope.firstFlightId} != null) && (${sessionScope.secondFlightId} != null)){
							location.replace("ticket-view.jsp");
							console.log("Is working");
					}else{
						console.log("Is not working");
					}
					
				</script>
				
				
			    <!-- Print flight list -->
				<c:forEach var="flightList" items="${tempFlightList}">
                     
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
	    				
	    			<!-- Print flight cost -->
	    			<div class="col">
	    					<label>$</label>${flightList.price}
	    			</div>
	    				
	    			<!-- Select flight button -->
	    			<div class="col">
	    					<form action="/FlyAway2/search" method="GET" >
	    						<input type="hidden" name="flightId" value="${flightList.flightId}">
	    						<button class="btn btn-success">select</button>
	    					</form>
	    				</div>
	    			</div>
	    			
	    			
				</c:forEach>
		</div>
		

  			


	
	</div>
</body>
</html>