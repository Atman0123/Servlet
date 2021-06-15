package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.helper.Factoryprovider;

import myproject.note;

/**
 * Servlet implementation class saveServlet
 */
public class saveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String title=request.getParameter("title");
			String content=request.getParameter("content");
		
			note note=new note(title, content, new Date());
			
			
			Factoryprovider.insert(note);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("<h1 style='text-align:center;'>Add Note Successfuly</h1>");
			out.print("<h1 style='text-align:center;'><a href='all_notes.jsp'>View All Notes</a></h1>");
	}

}
