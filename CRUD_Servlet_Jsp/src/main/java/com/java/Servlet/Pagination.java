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
@WebServlet("/pagination")
public class Pagination extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StdDaoImpl imp = new StdDaoImpl();
		int pageid = Integer.parseInt(request.getParameter("page"));
		int start = pageid-1;
		int end = 3 ;
		List<Student> slist = null ;
		
		if(pageid == 1) 
			
			 slist = imp.pagination(start , end);
		
		else 
				start = (pageid-1)*end;
				System.out.println("Aaaaa:\t"+start);
				end = 3;
				System.out.println("Bbbbb:\t"+end);
				slist = imp.pagination(start , end);
			
		out.print("<html>");
		out.print("<head>");
		out.print("<title>PAGINATION</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<a href = '/CRUD_Servlet_Jsp/index.jsp'>GoHome</a>");
		out.print("<h2 style = 'text-align:center;'> Students List Using Pagination </h2>");

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
		out.print("<h2>"
				+ "GoToPage :<a href = '/CRUD_Servlet_Jsp/pagination?page=1'>1</a> "
				+ "<a href = '/CRUD_Servlet_Jsp/pagination?page=2'>2</a> "
				+ "<a href = '/CRUD_Servlet_Jsp/pagination?page=3'>3......</a> "
				+ "<a href = '/CRUD_Servlet_Jsp/pagination?page="+(pageid+1)+"'>Next</a>"
				+ "</h2>");
		System.out.println(slist.size());
		 if(slist.size()==0) {
			out.print("<h1>Sorry No More Records In DB</h1>");
			out.print("<a href = '/CRUD_Servlet_Jsp/view'>ClickHere</a>");

			}
		out.print("</body>");
		out.print("</html>");



		
	}
}