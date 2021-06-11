package com.flyaway.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.helpers.FlightManager;
import com.flyaway.models.Flight;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get parameters from search form
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String departing = request.getParameter("departing");
		String returning = request.getParameter("returning");
		int numPassengers;
		
		
		//PrintWriter out = response.getWriter();
		//out.println(to);

		try{
				
			//Store the flight information in a session
			HttpSession session = request.getSession();

			//Check if flights are stored in the session
			if(session.getAttribute("depFlights") == null) {
				
				numPassengers = Integer.parseInt(request.getParameter("numPassengers"));
				
				//Get a list of departing flights based on the users passed in parameters
				FlightManager manager = new FlightManager();
				List<Flight> depFlights = manager.searchFlight(from, to, departing, numPassengers);
			
				//Get a list of returning flights based on the users passed in parameters
				List<Flight> retFlights = manager.searchFlight(to, from, returning, numPassengers);
			
				session.setAttribute("depFlights", depFlights);
				session.setAttribute("retFlights", retFlights);
				session.setAttribute("numPassengers", numPassengers);
			}else {
				System.out.println("FIRST FLIGHT " + request.getParameter("flightId"));
				if(session.getAttribute("firstFlightId") == null)
					session.setAttribute("firstFlightId", request.getParameter("flightId"));
				else
					session.setAttribute("secondFlightId", request.getParameter("flightId"));
			}
			
			response.sendRedirect("flight-results.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
