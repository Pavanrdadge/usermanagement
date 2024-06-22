<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete user</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>

<h1>Welcome to Delete Page</h1>

<form action="delete" style="border: 2px solid black; padding: 20px; border-radius: 10px; margin: 50px;">
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Enter Id: </label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
  </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>
  

</body>
</html>