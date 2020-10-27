<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registraion Form :  </h1>

<form action = "welcome">
<h1>TextBox :</h1>
Name  :<br>
<input type = "text" name = "name"><br>
Password :<br>
<input type = "text" name = "pass"/><br>
Occupation :<br>
<input type = "text" name = "occ"/><br>
<h1>RadioButton</h1>
Gender :<br>
<input type = "radio" value = "Male" name = "gender">Male
<input type = "radio" value = "female" name = "gender">Female<br>
<h1>CheckBox :</h1>
Marital Status :<br>
<input type = "checkbox" name = "cbox" value = "Yes">Yes
<input type = "checkbox" name = "cbox" value = "No">No<br>
<h1>DropDown :</h1>
Hobbies :<br>
<select name  ="hob">
<option value = "select">-SELECT-</option>
<option value = " Shettle">Playing Shettle</option>
<option value = " Cricket">Playing Cricket</option>
<option value = " koko">Playing koko</option>
</select><br><br>

<input type = "submit" value = "ClickMe">
</form>
</body>
</html>