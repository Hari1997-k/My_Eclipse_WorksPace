<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
     <title>Insert title here</title>
   </head>
   <body>
   <header class = "" style = " color: black; min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"> <h1 style = "color: white;">Plaza Management System</h1></header>
   
<br><br><br><br><br><br><br>


        
<center>
     <form action="login" method="post" modelAttribute="user">

<div align = "center" style= "box-sizing:border-box; box-shadow: 7px 7px 5px 5px rgb(136, 136, 136); height :300px; width :350px; border-radius:20px;">
   <h2>Sign In</h2>
	<hr><br><br>
   Username: <input type="text" id="login-userName" name="userName" style ="border-radius : 5px;"  placeholder="Username"><br><br>
   Password: <input type="password" id="login-password" name="password" style ="border-radius : 5px;"  placeholder="Password"><br><br>
	
	<input type="submit" value="Login" id="login" style ="border-radius : 10px;"><br><br>
   <hr>
Don't have an account!<a href ="https://www.gmail.com">Sign Up Here</a>
  </div>
    </form>
  </center>
   </body>
   </html>