<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch Box</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        margin: 0;
        padding: 40px;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .box {
        background: #fff;
        padding: 25px 30px;
        border-radius: 12px;
        box-shadow: 0 6px 18px rgba(0,0,0,0.1);
        width: 320px;
        text-align: center;
    }
    h2 {
        margin-bottom: 20px;
        color: #333;
    }
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 8px;
        outline: none;
        font-size: 15px;
        transition: border 0.2s;
    }
    input[type="number"]:focus {
        border-color: #2563eb;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        background: #2563eb;
        color: #fff;
        transition: background 0.3s;
    }
    input[type="submit"]:hover {
        background: #1e40af;
    }
</style>
</head>
<body>

<div class="box">
    <h2>Update Record</h2>
    <form action="fetchRecordServlet" method="get">
        <input type="number" name="c_engineNumber" placeholder="Enter Engine Number" required>
        <input type="submit" value="Fetch Record">
    </form>
</div>

</body>
</html>
