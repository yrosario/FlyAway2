<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

	
</head>
<body>

   <div class="container">	<!-- Main div -->
	<div>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header active">
		      <a class="navbar-brand active" href="" >Fligth Results</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li><a href="search.jsp">Search</a></li>
		      <li>		
          		 <a class="navbar-brand" href="admin-login.jsp" >Admin Login</a>
          	</li>
		    </ul>
		  </div>
		</nav>
	</div>
	
		<!-- Body div -->
		<div class="container" id="body">
			<table class="table">
				<!-- check if first flight has been selected -->
				<c:choose>
					 <c:when test="${empty sessionScope.firstFlightId}">
						<c:set var="tempFlightList" value="${sessionScope.depFlights}" />
					</c:when>
					
					<c:when test="${empty sessionScope.secondFlightId}">
						<c:set var="tempFlightList" value="${sessionScope.retFlights}" />
					</c:when>
				</c:choose>
				

				
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
                     <tr>
                     <!-- Print flight detail infomation -->
                    <div class="row">
                    	<div class="col">
                    		<th>
                    		${flightList.departingTime} -
                    		${flightList.arrivalTime}
                    		<br>
                    		${flightList.leavingFrom}
                    		<br>
                    		${flightList.arrivingAt}
                    		<br>
                    		${flightList.seatsLeft}
                    		</th>
                    	</div>	    	
	    				
	    			<th>
	    			<!-- Print flight cost -->
	    			<div class="col">
	    					<label>$</label>${flightList.price}
	    			</div>
	    			</th>
	    			<!-- Select flight button -->
	    			<th>
	    			<div class="col">
	    					<form action="/FlyAway2/search" method="GET" >
	    						<input type="hidden" name="flightId" value="${flightList.flightId}">
	    						<button class="btn btn-success">select</button>
	    					</form>
	    				</div>
	    			</div>
	    			</th>

	    			
	    			</tr>
				</c:forEach>
				</table>
		</div>
		<hr/>
		

  			


	
	</div>
</body>
</html>