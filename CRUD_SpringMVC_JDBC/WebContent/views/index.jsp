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
</head>
<body>
<a href = "/CRUD_SpringMVC_JDBC/emplist">ViewCompanies</a>

<h1 style = "text-align: center;" >Welcome To NASCAM.COM&reg;</h1>
<h2 style = "text-align: center;" >Create Company</h2>
<div style = "margin-left : 35%; margin-right : 35%">
<form action = "view" method = "post">

<input style = ""class="form-control input-lg" type = "text" name = "cid" placeholder = "Enter Company ID"><br>

<input class="form-control input-lg" type = "text" name = "cname" placeholder = "Enter Company Name"><br>

<input class="form-control input-lg"type = "text" name = "ctype" placeholder = "Enter Company Type"><br>

<input class="form-control input-lg" type = "text" name = "cbranch" placeholder = "Enter Company Branch"><br>

<input class="btn btn-primary" type = "submit" value = "create">
</form>
</div>
</body>
</html>