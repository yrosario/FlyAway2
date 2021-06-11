package com.flyaway.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.helpers.TicketManager;

@WebServlet("/add-ticket")
public class TicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out = response.getWriter();
		//out.print("flightNo " + no + " price " + price);
		try {
			
			HttpSession session = request.getSession(true);
			Integer firstFlight = Integer.parseInt(session.getAttribute("firstFlightId").toString());
			Integer secondFlight = Integer.parseInt(session.getAttribute("secondFlightId").toString());
			Integer numPassengers = (Integer)session.getAttribute("numPassengers");
		
			Integer userId = (Integer)session.getAttribute("userId");
	
			response.setContentType("text/html");
			
			//add ticket
			TicketManager tckMngr = new TicketManager();
			if(tckMngr.addTicket(firstFlight, secondFlight, numPassengers, userId))
				out.println("<h1>You have Successfully purchased the tickets!</h1>");
			else
				out.println("failed");
				
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
