
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Form WebPage</title>
  </head>
  <body>
    
   <div class="container mt-5">
   <h3 class="text-center col-sm-5">Registration Form</h3>
   <p class="text-center col-sm-5">Model and View</p>
   
   
   <form action="processForm" method="post">
   
   <div class="form-group col-sm-5 alert alert-dark" role="alert">
   
   <form:errors path="user.*"></form:errors>
   
  </div>
   
   <div class="form-group col-sm-5">
    <label for="Name">Name</label>
    <input type="text" class="form-control" id="Name" name="name" placeholder="Enter Name">
  </div>
  
  <div class="form-group col-sm-5">
    <label for="Email Address">Email Address</label>
    <input type="email" class="form-control" id="Email" name="email" placeholder="Enter Email Address">
  </div>
  
  <div class="form-group col-sm-5">
    <label for="Password">Password</label>
     <input type="password" class="form-control" id="Password" name="password" placeholder="Enter Password">
   </div>
   
   <div class="form-group col-sm-5">
    <label for="Language">Select Language</label>
    <select name="language" class="form-control" id="Language" multiple>
      <option>C++</option>
      <option>Java</option>
      <option>ML</option>
      <option>React</option>
      <option>Angular</option>
    </select>
  </div>
    
   <div class="form-group col-sm-5">
     <p>Address</p>
     <div class="form-group col-sm-5">
     <label for="State">State</label>
     <input type="text" class="form-control" id="State" name="address.state" placeholder="Enter State">
     
     <label for="District">District</label>
     <input type="text" class="form-control" id="District" name="address.district" placeholder="Enter District">
  
   <label for="Pincode">Pincode</label>
     <input type="text" class="form-control" id="Pincode" name="address.pincode" placeholder="Enter Pincode">
  
   </div>
   </div>
   <div class="col-sm-5">
    <button type="submit" class="btn btn-dark">Submit</button>
   </div>
  
  
   
  </form>
  
  </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>