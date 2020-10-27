<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- BOOTSTRAP-04 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" 
  integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" 
  crossorigin="anonymous"></head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script> 
</head>
<body>
<a href = "/CRUD_SpringMVC_JDBC/home">GoHome</a>
<h1 style = "text-align: center;">Welcome To View Page</h1>
<h2 style = "text-align: center;">List Of Companies :${ecount}</h2>
<table class = "container">
<tr style = "text-align: center;">
<th  class = "table-dark"style = "padding: 15px;">CmpId</th>
<th  class = "table-dark"style = "padding: 15px;">CmpName</th>
<th  class = "table-dark"style = "padding: 15px;">CmpType</th>
<th  class = "table-dark"style = "padding: 15px;">CmpBranch</th>
<th  class = "table-dark"style = "padding: 15px;">Edit</th>
<th  class = "table-dark"style = "padding: 15px;">Delete</th>
</tr>
<c:forEach var = "cmp" items = "${clist}">
<tr  style = "text-align: center;" >
<td class = "table-active"style = "padding: 15px;">${cmp.cid}</td>
<td class = "table-light"style = "padding: 15px;">${cmp.cname}</td>
<td class = "table-active"style = "padding: 15px;">${cmp.ctype}</td>
<td class = "table-light"style = "padding: 15px;">${cmp.cbranches}</td>
<td class = "table-active"style = "padding: 15px;"><a href = "/CRUD_SpringMVC_JDBC/update/${cmp.cid}">Edit</a></td> 
<td class = "table-light"style = "padding: 15px;"><a href = "/CRUD_SpringMVC_JDBC/delete/${cmp.cid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>