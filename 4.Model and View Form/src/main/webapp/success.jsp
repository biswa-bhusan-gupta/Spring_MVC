<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model User</title>
</head>
<body>
 <h2>Model and View</h2>
 <h3>Name : ${User.name} </h3>
 <h3>Email : ${User.email} </h3>
 <h3>Password : ${User.password} </h3>
  <h3>Language : ${User.language} </h3> 
 <h3>District : ${User.address.district} </h3> 
 <h3>State : ${User.address.state} </h3> 
  <h3>Pincode : ${User.address.pincode} </h3> 
 
</body>
</html>