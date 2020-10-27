<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
           String vehicleType=(String)session.getAttribute("vehicleType");
           String vehicleNumber=(String)session.getAttribute("vehicleNumber");
           String plaza_name = (String)session.getAttribute("plazaName");
           String laneNumber = (String)session.getAttribute("laneNumber");
           String journeyType =(String)session.getAttribute("journeyType");
           String fare =(String)session.getAttribute("fare");
           String date =(String)session.getAttribute("date");
                   
            %>
	<header class="header"
		style="color: black; min-width: 100%; top: 0%; left: 0%; position: fixed; background-color: black; text-align: center;">
		<h1 style="align: center; color: white;">Plaza Management System</h1>
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<div align="center"
			style="box-sizing: border-box; box-shadow: 7px 7px 5px 5px rgb(136, 136, 136); height: 400px; width: 350px; border-radius: 20px;">
			<h2>TOLL RECEIPT</h2>
			<h4>National Toll Plaza Ltd.</h4>
			<hr>
			<table>
				<tr>
					<th>Plaza Name :</th>
					<td><%=plaza_name%></td>
				</tr>
				<tr>
					<th>Lane Number:</th>
					<td> Lane <%=laneNumber%> </td>
				</tr>
				<tr>
					<th>Date/Time:</th>
					<td> <%=date%></td>
				</tr>
				<tr>
					<th>Vehicle No</th>
					<td> <%=vehicleNumber%></td>
				</tr>
				<tr>
					<th>Vehicle Type</th>
					<td><%=vehicleType%></td>
				</tr>
				<tr>
					<th>Journey Type</th>
					<td><%=journeyType%></td>
				</tr>
				<tr>
					<th>Fare</th>
					<td><%=fare%></td>
				</tr>
			</table>
			<br>
			<h3>Thank you</h3>
			<h5>Have a happy and safe journey</h5>
	</center>
</body>
</html>