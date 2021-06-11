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
			int firstFlight = Integer.parseInt((String)session.getAttribute("firstFlightId"));
			int secondFlight = Integer.parseInt((String)session.getAttribute("secondFlightId"));
			
			int numPassengers = Integer.parseInt((String)session.getAttribute("numPassengers"));
		
			int userId = Integer.parseInt(session.getAttribute("userId").toString());
				
				
			System.out.println("RUNNING WELLLLLLLLLLLLLLLLLLLLLLLL");
			
			//PrintWriter out = response.getWriter();
			//add ticket
			TicketManager tckMngr = new TicketManager();
			if(tckMngr.addTicket(firstFlight, secondFlight, numPassengers, userId))
				out.println("Successful");
			else
				out.println("failed");
				
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
