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

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StdDaoImpl imp = new StdDaoImpl();
		List<Student> slist = imp.getSTudents();
		request.setAttribute("slist", slist);
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Welcome To View Page</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<a href = '/CRUD_Servlet_Jsp/index.jsp'>GoHome</a>");

		out.print("<h2 style = 'text-align:center;'> Students List </h2>");
		out.print("<h3 style = 'text-align:center;'><a href = '/CRUD_Servlet_Jsp/pagination?page=1'>Pagination-View-Of-StudentList</a></h3>");

		out.print("<table  border = 1px cellpadding = 10px cellspacing = 5px "
				+ "style = 'text-align : center; margin-left :23%;'>");
		out.print("<tr style = 'background-color : #bec3cc;'> "
				+ "<th>StudentId</th> "
				+ "<th>StudentName</th>	"
				+ "<th>StudentBranch</th> "
				+ "<th>StudentAddress</th>"
				+ "<th>EditStudent</th>"
				+ "<th>DeleteStudent</th>"
				+ "</tr>");
		for (Student ss : slist) {
			out.print("<tr> "
					+ "<td>" + ss.getSid() +"</td> "
					+ "<td>" + ss.getSname() + "</td>"
					+ "<td>" + ss.getSbranch()+ "</td> "
					+ "<td>" + ss.getSaddress() +"</td>"
					+"<td><a href = '/CRUD_Servlet_Jsp/edit?sid="+ss.getSid()+"'>Edit</a></td>"
					+"<td><a href = '/CRUD_Servlet_Jsp/delete?sid="+ss.getSid()+"'>Delete</a></td>"
					+"</tr>");

		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		

		
	}
}