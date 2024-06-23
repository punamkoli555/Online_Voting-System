<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting System</title>
<body style="background-image:url(images/flag.jpg)"/>
</head>
<body>
 <div style="padding-left: 150px;">
     
    <br><br><br><br><br><br>
            <form action="adminlogin" method="post">
             <h3 >Admin Login</h3>
             
             <br>
             
             <input name="admin_name"  placeholder="User Name" type="text">
             <br><br>
             <input name="admin_pass"  placeholder="User Pass" type="password">
             
            <br><br>
                       <input value="Login"  type="submit" style="padding-bottom: 10px; width: 75px;"> 
            
                      <br><br>  
                          <a href="adminlogin.jsp"><font color="red">Admin Check Result</font></a>
            </form>
           
             
        </div>
</body>
</html>