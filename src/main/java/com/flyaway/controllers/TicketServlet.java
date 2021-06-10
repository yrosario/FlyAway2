package com.flyaway.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.helpers.TicketManager;

@WebServlet("/add-ticket")
public class TicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out = response.getWriter();
		//out.print("flightNo " + no + " price " + price);
		try {
			int flightNum = Integer.parseInt(request.getParameter("flightNum"));
			float price = Float.parseFloat(request.getParameter("price"));
			out.print("flightNo " + price);// + " price " + price);
			
			//PrintWriter out = response.getWriter();
			//add ticket
			TicketManager tckMngr = new TicketManager();
			if(tckMngr.addTicket(flightNum, price))
				out.println("Successful");
			else
				out.println("failed");
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
