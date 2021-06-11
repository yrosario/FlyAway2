package com.flyaway.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.helpers.FlightManager;

@WebServlet("/add-flight")
public class FlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//Get params from form
			String from = request.getParameter("from");
			String to = request.getParameter("to");
			String departingDate = request.getParameter("departingDate");
			String departingTime = request.getParameter("departingTime");
			String arrivalDate = request.getParameter("arrivalDate");
			String arrivalTime = request.getParameter("arrivalTime");
			String airline = request.getParameter("airline");
			int capacity = Integer.parseInt(request.getParameter("capacity"));
			int seatsLeft = Integer.parseInt(request.getParameter("seatsLeft"));
			float price = Float.parseFloat(request.getParameter("price"));
			
			PrintWriter out = response.getWriter();
			
			out.println("from : " + from + " to : " + to + " departingDate " +
					departingDate + " Departing time : " + departingTime + 
					" ArrivaDate : " + arrivalDate +
					" arrivalTime : " + arrivalTime + " airline : " + airline +
					" capacity : " + capacity + " seatsLeft : " + seatsLeft);
			
			FlightManager manager = new FlightManager();
			if(manager.addFlight(from, to, departingDate, departingTime, arrivalDate, arrivalTime, airline,
								capacity, seatsLeft, price))
				out.println("Flight added successfully");
			else
				out.println("Failed to add flight");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
