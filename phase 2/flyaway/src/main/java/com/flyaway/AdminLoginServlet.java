package com.flyaway;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;



/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
			Dao dao=new Dao();
			
			if(dao.checkAdmin(email,password)) {
				response.sendRedirect("AdminLandingPage.jsp");
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("message", "Invalid Details");
				response.sendRedirect("AdminLandingPage.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}