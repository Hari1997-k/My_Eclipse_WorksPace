<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<a href = "/CRUD_Servlet_Jsp/view">ViewStudents</a>
<form action = "create">
<h1 style = "text-align : center;">Welcome To SmartStudents&reg;.com </h1>
<h2 style = "text-align : center;">Fill Student Form</h2>
<div style = "margin-left :37%; margin-right : 36%">
<input style = "text-align : center;" type = "text" name = "sid" placeholder = "Enter Student Id" class ="form-control input-lg"><br>
<input style = "text-align : center;"type = "text" name = "sname" placeholder = "Enter Student Name" class ="form-control input-lg"><br>
<input style = "text-align : center;"type = "text" name = "sbranch" placeholder = "Enter Student Branch" class ="form-control input-lg"><br>
<input style = "text-align : center;"type = "text" name = "saddress" placeholder = "Enter Student Address" class ="form-control input-lg"><br>
<input style = "text-align : center;"type = "submit" value  = "Create" class = "btn btn-primary">
</div>
</form>
</body>
</html>