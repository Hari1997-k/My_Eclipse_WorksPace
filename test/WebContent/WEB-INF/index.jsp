<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel ="stylesheet" type = "text/css" href = "css/plaza.css"/>
</head>
<body>
<header class = "header" style = " color: black; min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"><h1 style = "align : center; color : white ;">Plaza Management System</h1></header>
<br><br><br><br><center>
<h3>Entry Form</h3>
<table border = 1px;>
<tr>
<th>Select vehicle type</th>
<td><select id = "vehicleType">
<option>2 Whelers</option>
<option>4 Whelers</option>
</select></td>
</tr>
<tr>
<th>Vehicle Number</th>
<td><input type = "text" id = "vehicleNumber"></td>
</tr>
<tr>
<th>Select plaza</th>
<td><select id = "plazaType">
<option>L And T</option>
<option>P And Q</option>
</select></td>
</tr>
<tr>
<th>Select Lane Number</th>
<td><select id = "laneNumber">
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
</select></td>
</tr>
<tr>
<th>Select Journey Type</th>
<td><select id = "journeyType">
<option>Single</option>
<option>Doubles</option>
</select></td>
</tr>
</table><br>
<a href = "/TollEntryHibe/recipt">
<input type = "submit" value = "ADD">
</a>
</center>

</body>
</html>
 --%>
 
 
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header class = "header" style = " color: black; min-width: 100%;top: 0%;left: 0%;
position: fixed;background-color: black;text-align: center;"><h1 style = "align : center; color : white ;">Plaza Management System</h1></header>
<br><br><br><br><br><br>
<center>
<div align = "center" style= "box-sizing:border-box; box-shadow: 7px 7px 5px 5px rgb(136, 136, 136); height :400px; width :350px; border-radius:20px;">
	<h2>TOLL RECEIPT</h2>
<h4>National Toll Plaza Ltd.</h4>	
<hr>
<table>
<tr>
<th>Plaza Name :</th>
<td></td>
</tr>
<tr>
<th>Lane Number:</th>
<td></td>
</tr> 
<tr>
<th>Date/Time:</th>
<td></td>
</tr>
<tr>
<th>Vehicle No</th>
<td>______________</td>
</tr>
<tr>
<th>Vehicle Type</th>
<td></td>
</tr>
<tr>
<th>Journey Type</th>
<td></td>
</tr>
<tr>
<th>Fare</th>
<td></td>
</tr>
</table>
<br>
<h3>Thank you</h3> 
<h5>Have a happy and safe journey</h5>
</center>
</body>
</html>