<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model User</title>
</head>
<body>
 <p class="text-center col-sm-5">Model and View</p>
 <h3>UserName : ${User.name} , userEmail : ${User.getEmail()} , UserPassword : ${User.getPassword()}</h3>

 <p class="text-center col-sm-5">Saved in Database with ID : ${Id}</p>
 
</body>
</html>