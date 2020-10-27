package com.java.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.DaoImpl.StdDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome To Delete Page </h1>");
		int id = Integer.parseInt(request.getParameter("sid"));
		StdDaoImpl impl = new StdDaoImpl();
//PERFORMING DAO OPERATION:		
		impl.DeleteStd(id);
//AFTER PERFORMING OPERATION REDIRTECTING TO THE VIEW SERVLET 
		response.sendRedirect("view");
	}

}
