package com.flyaway.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get parameters from search form
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String departing = request.getParameter("departing");
		String returning = request.getParameter("returning");
		String numPassangers = request.getParameter("numPassangers");
		

	}

}
