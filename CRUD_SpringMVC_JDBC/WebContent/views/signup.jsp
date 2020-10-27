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
<h1 style = "text-align: center ;">Sorry!U Dont Have Account</h1>
<h1 style = "text-align: center ;">NASCAM.COM&reg;</h1>
<div style = "box-sizing:border-box; border-radius:20px; background-color :grey; ; width: 9cm; height: 10cm;box-shadow : 2px 30px 60px 2px rgba(0,0,0,0.3); margin-left:37%;margin-right:37% " >
<form action = "signin" method = "post">
<h2 style = "text-align: center ;padding :10px;" class = "bg-primary">SignUp Here</h2>
<input style = "text-align: center;" class="form-control input-lg" 
type = "text" name = "cid" placeholder = "Enter Company ID"><br>

<input style = "text-align: center; "class="form-control input-lg"
 type = "text" name = "cname" placeholder = "Enter Company Name"><br>

<input style = "text-align: center;" class="form-control input-lg"
type = "text" name = "ctype" placeholder = "Enter Company Type"><br>

<input style = "text-align: center; " class="form-control input-lg"
type = "text" name = "cbranch" placeholder = "Enter Company Branch"><br>

<input  style = "text-align: center; width: 9cm;" type = "submit" value = "SignUp" class = "btn btn-primary">
</form>

</div>
</body>
</html>