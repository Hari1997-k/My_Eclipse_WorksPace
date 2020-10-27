package com.java.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.DaoImpl.StdDaoImpl;
import com.java.pojo.Student;

/**
 * Servlet implementation class EditSave
 */
@WebServlet("/editsave")
public class EditSave extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StdDaoImpl impl = new StdDaoImpl();
		int id =Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("sname");
		String branch = request.getParameter("sbranch");
		String address = request.getParameter("saddress");
		
		Student std = new Student();
		std.setSaddress(address);
		std.setSbranch(branch);
		std.setSid(id);
		std.setSname(name);
		impl.Update(std);
		response.sendRedirect("view");
	}

}
