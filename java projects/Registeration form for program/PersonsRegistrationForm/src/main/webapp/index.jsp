<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body style="font-family: Arial, sans-serif; margin: 50px;">

    <h2 style="color: #333;">Registration Form</h2>
    
    
    
    <form action=RegistrationServlet method="post"
    style="border:1px solid #ccc; padding: 20px; width:300px;">
    
    <div style="margin-bottom: 10px;">
  <label for="id" style="display:block;">ID</label>
  <input type="number" name="id" id="id" style="width:100%; padding:5px;"> 
</div>

<div style="margin-bottom: 10px;">
  <label for="name" style="display:block;">Name</label>
  <input type="text" name="name" id="name" style="width:100%; padding:5px;"> 
</div>

<div style="margin-bottom: 10px;">
  <label for="email" style="display:block;">Email</label>
  <input type="text" name="email" id="email" style="width:100%; padding:5px;"> 
</div>

<div style="margin-bottom: 10px;">
  <label for="age" style="display:block;">Age</label>
  <input type="number" name="age" id="age" style="width:100%; padding:5px;"> 
</div>

<div style="margin-bottom: 10px;">
  <label for="address" style="display:block;">Current Address</label>
  <input type="text" name="address" id="address" style="width:100%; padding:5px;"> 
</div>

<div style="margin-bottom: 10px;">
  <label for="password" style="display:block;">Password</label>
  <input type="password" name="password" id="password" style="width:100%; padding:5px;"> 
</div>
             
        <input type="submit" value="Regiter">
    </form>

</body>
</html>
