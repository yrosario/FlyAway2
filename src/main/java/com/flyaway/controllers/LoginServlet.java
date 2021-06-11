package com.flyaway.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.helpers.AdminManager;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		       //Retrive user name and password entered by the user
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				String logout = request.getParameter("logout");
				
				//Start HttpSession
				HttpSession session = request.getSession(true);
				
				PrintWriter out = response.getWriter();
				
				//check if the user has requested to log out
				if(logout != null) {
					session.removeAttribute("userId");
					out.println("You have succesfully logout");
				}else {
					//Authenticate user. If user has already logged in foward to admin page
					AdminManager manager = new AdminManager();
					if(manager.addAdmin(username, password)) {
						session.setAttribute("userId", manager.getLastUseId());
						response.sendRedirect("admin.jsp");
					}
					else
						out.println("Wrong user or password");
				}
				out.close();
			
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Retrive user name and password entered by the user
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Start HttpSession
		HttpSession session = request.getSession(true);
		
		if(session.getAttribute("userId") == null)
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		
		PrintWriter out = response.getWriter();
		
		//Authenticate user. If user has already logged in foward to admin page
		AdminManager manager = new AdminManager();
		if(session.getAttribute("userId") == null) {
			if(manager.authenticate(username, password)) {
				session.setAttribute("userId", manager.getLastUseId());
				response.sendRedirect("admin.jsp");
			}
			else
				out.println("Wrong user or password");
		}else {
			response.sendRedirect("admin.jsp");
		}
	
	}

}
