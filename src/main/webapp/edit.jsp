<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<h1> welcome to edit page</h1>

  <form action="editUser" style="border: 2px solid black; padding: 20px; border-radius: 10px; margin: 50px;">
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Id: </label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Name: </label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Age: </label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="age">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter MobileNumber: </label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="number">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
  

</body>
</html>