<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
 <head>
</head>
<body>
<header style = " color: black;font-family: Times New Roman;min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"><h1 style = "color: white;">Plaza Management System</h1></header>
<br><br><br><br><br><br><br><br><br><br>
<a href = "https://www.oracle.com/login">
<img src = "https://cdn.clipart.email/31ea8639ec591a3e58ee94f8468e195b_user-icon-clipart_600-600.svg"  alt = "USER" width="34px"  height="36px" style = "filter : white ; position: fixed;  margin-left: 34cm; bottom : 14.94cm;">
</a>
<a href = "/TollLoginHibe/edit">
<img src = "https://cdn.clipart.email/7a751932e02ff115bd27ba61e7ed6914_home-icon-clip-art-at-clkercom-vector-clip-art-online-royalty-_297-298.png" alt = "HOME" width="32px" height="29px" style = " color: white;position: fixed; margin-left: 32cm; bottom : 15.01cm;">
</a>
<form action = "editPage" method="POST">
<center>
<h2>User Details</h2>
       <table class="table table-bordered" style="width: 300px" border = 1px;>
         <c:if test="${not empty user}">
           <tr>
           <th>Name</th>
           <td>${user.userName}</td>
            </tr>
           <tr>
           <th>Gender:</th>
           <td>${user.gender}</td>
            </tr>
             <tr>
           <th>DOB</th>
           <td>${user.dob}</td>
            </tr>
             <tr>
           <th>Mobile</th>
           <td>${user.mobile}</td>
            </tr>
             <tr>
           <th>Email</th>
           <td>${user.email}</td>
            </tr>
            <tr>
           <th>Address</th>
           <td>${user.address}</td>
            </tr>
    </c:if>
    </table><br><br>
         <input style = " width : 75px; height : 35px; background-color:  green;  border-radius: 10px;" type = "submit" value = "Edit" id = "edit">
    
     </center>
     
    </form>
    </body>
    </html>
    
    
    