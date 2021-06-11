<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Flight</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>

   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header active">
		      <a class="navbar-brand active" href="" >Search Flights</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="search.jsp">Search</a></li>
		    </ul>
		  </div>
		</nav>
	</div>
	
		<hr>
		<h2>Departure Flight</h2>
		<c:forEach var="flightList" items="${sessionScope.depFlights}">

			<!-- Print flight detail infomation -->		
			
			<c:if test="${flightList.flightId == sessionScope.firstFlightId}">
	
						${flightList.departingTime} 
						${flightList.arrivalTime} 
						<br>
						${flightList.leavingFrom} 
						<br> ${flightList.arrivingAt} 
						<br>
						<label>$</label>${flightList.price} <label> X </label> ${numPassengers}
						
						<!-- capture the price for flight one -->
						<c:set var="price1" value="${flightList.price}"/>
				
			</c:if>
	
	</c:forEach>
	<hr>
	
	<hr>
		<h2>Return Flight</h2>
		<c:forEach var="flightList" items="${sessionScope.retFlights}">

			<!-- Print flight detail infomation -->
			<c:if test="${flightList.flightId == sessionScope.secondFlightId}">
	
						${flightList.departingTime} 
						${flightList.arrivalTime} 
						<br>
						${flightList.leavingFrom} 
						<br> ${flightList.arrivingAt} 
						<br>

						<label>$</label>${flightList.price} <label> X </label> ${numPassengers}
						
						<!-- capture the price for flight two -->
						<c:set var="price2" value="${flightList.price}"/>
			</c:if>
	
	</c:forEach>
	<hr>
	<hr>

		<h2 id="total">Total:</h2>$<span id = "price"></span> 
		
		<br>
		<hr>
		<form action="register.jsp" method="get">
			<button class="btn btn-success">Buy!</button>
		</form>
		
		<!-- Sum total price -->
		<script type="text/javascript"> 
		
			document.getElementById("price").innerHTML = (${price1} + ${price2}) * ${numPassengers};
			
		</script>
	
	</div>
</body>
</html>