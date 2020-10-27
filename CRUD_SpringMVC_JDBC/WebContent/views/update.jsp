<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<div style = "margin-left : 35%; margin-right : 35%">
<h1>Edit Company </h1>
<form:form action = "/CRUD_SpringMVC_JDBC/uview" commandName="command">
<form:hidden path="cid"/>
<form:input path="cname" class="form-control input-lg"/><br>
<form:input path="ctype" class="form-control input-lg"/><br>
<form:input path="cbranches" class="form-control input-lg"/><br>
<input type = "submit" value = "Save Changes" class = "btn btn-success">
</form:form>
</div>
</body>
</html>