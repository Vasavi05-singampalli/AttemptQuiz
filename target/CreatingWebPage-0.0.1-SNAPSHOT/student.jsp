<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login Page</title>
</head>
<body>
<form action="taketest" method="post">
  <div class="container"> 
   Name :<input type="text" placeholder="Enter Name" name="Name" required>   
     </div> 
     <div class="container">   
    Email :<input type="email" placeholder="Enter Email" name="email" required>     
     </div>
     <div class="container">   
    PhoneNo :<input type="phoneno" placeholder="Enter PhoneNo" name="phoneno" required>     
     </div>
     <p>You can preselect an option with the selected attribute:</p>


  <label for="subjects">Choose a Subject:</label>
  <select id="subjects" name="subjects">
    <option value="maths">Maths</option>
    <option value="social">Social</option>
    <option value="science">Science</option>
    <option value="physics">Physics</option>
  </select>
  <input type="submit" value="Submit">
</form>
     
</body>
</html>