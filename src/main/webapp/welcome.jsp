<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<style>
img {
	width: 100%;
	height: 100%;
	background-size: cover;
}
#max {
	
	position:absolute;
	top:200px;
	right:750px;
		border: 2px red solid;
		padding: 20px;
		margin: auto;
		border-radius: 5px;
		background-color: blue;
		text-decoration: none;
		color: black;
		
}
#max:hover{
   color: orange;
}
#dis {
	
	position:absolute;
	top:200px;
	right:550px;
		border: 2px red solid;
		padding: 20px;
		margin: auto;
		border-radius: 5px;
		background-color: red;
		text-decoration: none;
		color: black;
		border: 2px solid black;
		
}
#dis:hover{
color: white;
}

h1 {
	position:absolute;
	top:200px;
	right:900px;
		border: 2px blue solid;
		padding: 20px;
		margin: auto;
		border-radius: 5px;
		
}
</style>
</head>
<body>

	<img alt="welcome page"
		src="https://spreadsheetweb.com/wp-content/uploads/2021/07/How-to-show-a-welcome-message-in-Excel-00-min.png"
		width="600" height="800">
		
		<h1>UserManagement</h1>
		
		
	<a id="max" href="add.jsp">AddUser</a>
	
	<form action="display">
	 <!-- <a id="dis" href="display.jsp">DisplayUser</a> -->
	 <button id="dis" type="submit" value="Display">Display</button>
	 
	 </form>
	
</body>
</html>
