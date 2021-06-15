package com.Servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.Factoryprovider;

import myproject.note;

/**
 * Servlet implementation class updateServlet
 */
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t=request.getParameter("title");
		String c=request.getParameter("content");
		int id=Integer.parseInt(request.getParameter("id"));
		note note=new note();
		note.setName(request.getParameter("title"));
		note.setContent(request.getParameter("content"));
		note.setAdddate(new Date());
		note.setId(id);
		
		
		
		Factoryprovider.updateDetail(note);
		response.sendRedirect("all_notes.jsp");

	}

}
