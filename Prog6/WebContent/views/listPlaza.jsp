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
<center>
<h2>Plaza List</h2>
       <table class="table table-bordered" style="width: 300px" border = 1px;>
       <tr>
       		<th>S.No</th><th>Plaza Name</th><th>Description</th><th>Action</th>
       	</tr>
       	<c:forEach items="${list}" var="plaza">
       	<tr>
       		<td>${plaza.getId()}</td>
       		<td>${plaza.getName()}</td>
       		<td>${plaza.getDescription()}</td>
       		<td><a href="editPlaza?id=${plaza.getId()}&name=${plaza.getName()}&description=${plaza.getDescription()}">Edit</a> <a href="deletePlaza?id=${plaza.getId()}&name=${plaza.getName()}&description=${plaza.getDescription()}">Delete</a> </td>
		</tr>       
       	</c:forEach>
       </table>
              
    
</center>
     
    </form>
    </body>
    </html>
    
    
    