package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.Factoryprovider;

import myproject.note;

/**
 * Servlet implementation class editServlet
 */
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("Edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			note n=Factoryprovider.getSingleRecord(id);
			request.setAttribute("not", n);
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		}
	}

}
