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
 * Servlet implementation class EditServlet
 */
@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<a href = '/CRUD_Servlet_Jsp/index.jsp'>GoHome</a>");
		out.print("<h1 style = 'text-align : center;'>Welcome To Edit Page </h1>");
		StdDaoImpl impl = new StdDaoImpl();
		int sid = Integer.parseInt(request.getParameter("sid"));
		Student std =  impl.getStdById(sid);
		out.print("<form action='editsave'>");
		out.print("<div style = 'margin-left : 39%;'>");
		out.print("<table>");
		out.print("<tr><th></th><td><input type = 'hidden' name = 'sid'value ='"+std.getSid()+"'</td></tr>");
		out.print("<tr><th>Sname:</th>		<td><input style = 'padding : 10px;'type = 'text'name = 'sname' value ='"+std.getSname()+"'</td></tr>");
		out.print("<tr><th>Sbranch:</th>	<td><input style = 'padding : 10px;' type = 'text'name = 'sbranch' value ='"+std.getSbranch()+"'</td></tr>");
		out.print("<tr><th>Saddress:</th>	<td><input  style = 'padding : 10px;'type = 'text'name = 'saddress'  value ='"+std.getSaddress()+"'</td></tr>");
		out.print("<td><input style = 'padding : 10px; background-color : #00b524;'type = 'submit' value = 'SaveChanges'</td>");
		out.print("</form>");
		out.print("</table>");
		out.print("</div>");
		


		
		
		
	}

}
