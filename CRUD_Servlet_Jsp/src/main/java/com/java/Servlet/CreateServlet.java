package com.java.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.DaoImpl.StdDaoImpl;
import com.java.pojo.Student;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("sname");
		String branch = request.getParameter("sbranch");
		String address = request.getParameter("saddress");
		
		Student std = new Student();
		std.setSaddress(address);
		std.setSbranch(branch);
		std.setSid(id);
		std.setSname(name);
		StdDaoImpl impl = new StdDaoImpl();
		//CALLING DAO METHOD:	
		impl.CreateStudent(std);
		//AFTER PERFORMING OPERATION REDIRTECTING TO THE VIEW SERVLET 
		response.sendRedirect("view");

		
	}
		
		}
	


