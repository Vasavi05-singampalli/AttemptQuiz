<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Data</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Teacher Data</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Email</th><th>Phone number</th></tr>  
     
   <tr>  
   <td>${teacher.name}</td>  
   <td>${teacher.email}</td>  
   <td>${teacher.phonenumber}</td>  
   
   </tr>  
   
   </table>  
   <br/>  
</body>
</html>