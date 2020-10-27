<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
</head>
<body>
<header style = " color: black;font-family: Times New Roman;min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"><h1 style = "color: white;">Plaza Management System</h1></header>
<br><br><br><br><br><br><br><br>

<a href = "/Demo/user">
<img src = "https://cdn.clipart.email/9dd8a12324af3318cf416a5f35f35ade_iconsetc-flat-circle-white-on-black-bootstrap-font-awesome-user-icon_512-512.png" alt = "MyACCOUNT" width="60px" height="60px" style = "position: fixed; margin-left: 32cm; bottom : 14.65cm;">
<center>
<form action="user" method="POST" modelAttribute="user"> 
</form>
</a>
<input type = "text" id = "search" name="id">
<input type = "submit" value ="Go" id = "go" style ="border-radius : 10px;"><br><br>
 
<img src = " https://imageog.flaticon.com/icons/png/512/75/75825.png?size=1200x630f&pad=10,10,10,10&ext=png&bg=FFFFFFFF" width="150px" height="150px" style = "position: absolute; margin-left : -2.09cm; " alt = "oops" >
</center>

</body>
</html>