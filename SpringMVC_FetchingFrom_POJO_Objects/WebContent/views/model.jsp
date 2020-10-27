<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Model Page</h1>
<h2>Employee Details : </h2>
<table border = "1px">
         <c:if test="${not empty Emp}">
        <caption style = color : :#000000 ;">Employee Details</caption>
         <tr>
         <th>EmpId</th>
         <td>${Emp.eid}</td>
         </tr>
         <tr>
         <th>EmpName</th>
         <td>${Emp.ename}</td>
         </tr><tr>
         <th>EmpRole</th>
         <td>${Emp.erole}</td>
         </tr>
          </c:if><br>
 </table>
<h2>Employee Address Details :</h2>
 <table border = "1px">
         <c:if test="${not empty Emp}">
        <caption style = color : :#000000 ;">Employee Address Details</caption>
         <tr>
         <th>EmpCity</th>
         <td>${Emp. getEmpAddress().city}</td>
         </tr>
         <tr>
         <tr>
         <th>EmpDoornNo</th>
         <td>${Emp. getEmpAddress().doorNo}</td>
         </tr>
         <tr>
         <th>EmpStreet</th>
         <td>${Emp. getEmpAddress().street}</td>
         </tr>   
          </c:if>
 </table>
</body>
</html>