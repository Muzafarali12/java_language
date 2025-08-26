<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Management Dashbord</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        margin: 0;
        padding: 40px;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }
    .container {
        background: #fff;
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 6px 18px rgba(0,0,0,0.1);
        text-align: center;
        width: 350px;
    }
    h2 {
        margin-bottom: 20px;
        color: #333;
    }
    form {
        margin: 12px 0;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        font-size: 16px;
        border: none;
        border-radius: 8px;
        cursor: pointer;
        background: #2563eb;
        color: #fff;
        transition: 0.3s;
    }
    input[type="submit"]:hover {
        background: #1e40af;
    }
</style>
</head>
<body>
<div class="container">
 <h2>Auto Wash Service Manager</h2>
 
 <form action="DashBoardServlet.jsp" method="get"></form>

   <form action="addRecord.jsp" method="get">
       <input type="submit" value="Add New Record">
   </form>

   <form action="ShowAllRecordsServlet" method="get">
       <input type="submit" value="Show All Records">
   </form>

   <form action="deleteRecords.jsp" method="get">
       <input type="submit" value="Delete Record">
   </form>

   <form action="fetchRecord.jsp" method="get">
       <input type="submit" value="Update Record">
   </form>
</div>
</body>
</html>
