<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<header style = " color: black;font-family: Times New Roman;min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"><h1 style = "color: white;">Plaza Management System</h1></header>
<br><br><br><br><br><br><br><br><br><br>
<a href = "/TollLoginHibe/user">
<img src = "https://cdn.clipart.email/31ea8639ec591a3e58ee94f8468e195b_user-icon-clipart_600-600.svg"  alt = "USER" width="34px"  height="36px" style = "filter : white ; position: fixed;  margin-left: 34cm; bottom : 14.94cm;">
</a>
<a href = "/TollLoginHibe/homepage">
<img src = "https://cdn.clipart.email/7a751932e02ff115bd27ba61e7ed6914_home-icon-clip-art-at-clkercom-vector-clip-art-online-royalty-_297-298.png" alt = "HOME" width="32px" height="29px" style = " color: white;position: fixed; margin-left: 32cm; bottom : 15.01cm;">
</a>

<center>
<form action="edit" method="post" modelAttribute="user">
<h2>Edit Your Account</h2>
<table border = 1px; style = "border-color: threedlightshadow;width: 5.7cm;" >
<tr>
<th>UserName</th>
<td><input type = "text"  id = "userName" name = "name"style = "border-color: threedlightshadow; width: 5.7cm" ></td>
</tr>

<tr>
<th>Gender</th>
<td><input type = "radio" name="gender" id = "gender" value = "Male" style = "border-color: threedlightshadow;">Male<br>
<input type = "radio" name ="gender" id="gender" value = "Female" style = "border-color: threedlightshadow;">Female
</td>
</tr>

<tr>
<th>DOB</th>
<td><input type ="text" name="dob" id ="dob" style = "border-color: threedlightshadow; width: 5.7cm"></td>
</tr>

<tr>
<th>ContactNumber</th>
<td><input type = "text" id ="mobile" name="mobile" style = "border-color: threedlightshadow; width: 5.7cm"></td>

</tr>
<tr>
<th>Password</th>
<td><input type = "text" id ="password" name="password" style = "border-color: threedlightshadow; width: 5.7cm" ></td>

<tr>
<th>Email</th>
<td><input type ="text" name="email" id ="email" style = "border-color: threedlightshadow; width: 5.7cm"></td>
</tr>

</tr>
<tr>
<th>Address</th>
<td><input type = "text" id ="address" name="address" style = "border-color: threedlightshadow; width: 5.7cm"></td>

</tr>

</table><br>
<input  type = "submit"  value = "Update" style = "background-color:threedlightshadow;  ;  width : 75px; height : 35px; border-radius: 10px;" >
</form>
</body>
</html>