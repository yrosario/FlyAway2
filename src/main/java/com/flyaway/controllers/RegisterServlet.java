package com.flyaway.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.helpers.RegisterPassenger;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		
		PrintWriter out = response.getWriter();
		RegisterPassenger register = new RegisterPassenger();
		if(register.add(fname,lname,age,street,city,state,country)) {
			HttpSession session = request.getSession(true);
			System.out.println("REGISTER USER ID " + register.getUserId() );
			session.setAttribute("userId", register.getUserId());
			response.sendRedirect("payment.jsp");
		}
		else {
			out.println("Registration failed");
		}
		
	}

}
