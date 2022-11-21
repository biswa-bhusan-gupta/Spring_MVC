<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test WebPage</title>
</head>
<body>
 <h3>Name : ${Name} , Email : ${Email} , Password : ${Password}</h3>
 <h3>UserName : ${User.getName()} , userEmail : ${User.getEmail()} , UserPassword : ${User.getPassword()}</h3>
 
</body>
</html>