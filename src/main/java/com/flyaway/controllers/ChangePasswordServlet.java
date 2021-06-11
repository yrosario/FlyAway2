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


@WebServlet("/change-password")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String retyPassword = request.getParameter("retyPassword");
		
		
		//Check if admin has log in
		HttpSession session = request.getSession(true);
		if(session.getAttribute("userId") == null)
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			
		PrintWriter out = response.getWriter();
		
		//If passwords don't match send back to change password page
		if(!password.equals(retyPassword)) {
			out.println("password did not match");
			response.sendRedirect("change-password.jsp");
		}
		else {
			
			//Change users password
			AdminManager manager = new AdminManager();
			if(manager.changePassword(username, password))
				out.println("Password Was Successfully Change");
			else
				out.println("Password changed failed");
			
			out.close();
				
		}
		
		
	}

}
