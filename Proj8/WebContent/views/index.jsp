<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"	href="css/plaza.css" 	type="text/css" />
<title>TollBooth</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>
<body  >
<div class="header" ><h1 style="display:inline;">Plaza Management System</h1>
</div>
<div class="container">
    
  
			
		<%	if(session.getAttribute("user")!=null)
		{
	        session.removeAttribute("user");
	
		} %>
		
                <center>
                   <div class="login-box">
                    <div class="heading">
                        Sign In
                     </div>     
                       <hr>       
                      <form id="loginform" class="form-horizontal"  action="loginUser.do" method="post">
                                    
                            <div id="error">${error}</div>       
                                    
                                     Username:  <input id="login-userName" type="text" name="userName" value="" placeholder="Username">                                        
                                         <br><br>
                                     Password: <input id="login-password" type="password"  name="password" placeholder="Password">
                                         <br><br>
                                       
                                       <button type="submit" id="login">Login</button>
                                        <br><br>
                                        <hr>
                                            Don't have an account! 
                                        <a href="signup.do" id="signupLink">
                                            Sign Up Here
                                        </a>    
                            </form>     

                       </div>
                        </center>       

</div>                          
    

</html>























