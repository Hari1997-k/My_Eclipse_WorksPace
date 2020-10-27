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
<h1 style = "text-align: center ;" class = "bg-light">NASCAM.COM&reg;</h1>
<div style = "box-sizing:border-box;border-radius:20px; opacity:0.9; background-color :grey; ; width: 9cm; height: 8cm;box-shadow : 0 30px 60px 0 rgba(0,0,0,0.3); margin-left:37%;margin-right:37% " >
<form action = "index" method = "post">
<h2 style = "text-align: center ;padding :10px;" class = "bg-success">Login Here</h2>

<input style = " text-align: center; border-color:#14c944 ; display:inline; " 
type = "text" class = "form-control input-lg"  placeholder = "Enter Company ID" name ="lid"><br><br>

<input style = "text-align: center;;border-color:#14c944 ; " 
type = "text" class = "form-control input-lg" placeholder = "Enter Company Name" name = "lname"><br>

<input style = "text-align: center; width: 9cm;"
 type = "submit" value = "login" class = "btn btn-success">
<hr>
</form>
<p style = "text-align: center;">Don't have an account!<a style ="color: green;"href ="/CRUD_SpringMVC_JDBC/signup">Sign Up Here</a></p>

</div>
</body>
</html>