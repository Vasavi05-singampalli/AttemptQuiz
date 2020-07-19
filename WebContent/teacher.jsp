<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Login Page</title>
</head>
<body>
<form action="uploadfile" method="post">
  <div class="container"> 
   Name :<input type="text" placeholder="Enter Name" name="Name" required>   
     </div> 
     <div class="container">   
    Email :<input type="email" placeholder="Enter Email" name="email" required>     
     </div>
     <div class="container">   
    PhoneNo :<input type="phonenumber" placeholder="Enter PhoneNo" name="phonenumber" required maxlength="10">     
     </div>
     <h3>Show a file-select field which allows only one file to be chosen:</h3>

  <label for="myfile">Select a file:</label>
  <input type="file" id="myfile" name="myfile"><br><br>
  <input type="submit" value="Update">   
</form>
      
     </form> 
</body>
</html>