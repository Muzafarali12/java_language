<%@ page import="model.Car" %>
<%
    Car car = (Car) request.getAttribute("car");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Box</title>
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
        width: 400px;
    }
    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }
    label {
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
        color: #444;
    }
    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 8px;
        outline: none;
        font-size: 15px;
        transition: border 0.2s;
    }
    input[type="text"]:focus {
        border-color: #2563eb;
    }
    input[readonly] {
        background: #f0f0f0;
        cursor: not-allowed;
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
    p {
        text-align: center;
        font-size: 16px;
        color: red;
        font-weight: bold;
    }
</style>
</head>
<body>

<div class="box">
    <h2>Update Record</h2>
    <% if (car != null) { %>
    <form action="UpdateRecordServlet" method="post">
        <label>Engine Number:</label>
        <input type="number" name="c_engineNumber" value="<%= car.getCarEngineNumber() %>" readonly>

        <label>Vehicle Name:</label>
        <input type="text" name="c_name" value="<%= car.getName() %>">

        <label>Vehicle Model:</label>
        <input type="text" name="c_model" value="<%= car.getModel() %>">

        <label>Vehicle Color:</label>
        <input type="text" name="c_color" value="<%= car.getColor() %>">

        <label>Vehicle Body Type:</label>
        <input type="text" name="c_bodyType" value="<%= car.getBodyType() %>">

        <label>Vehicle Company:</label>
        <input type="text" name="c_company" value="<%= car.getCompany() %>">

        <input type="submit" value="Update Record">
    </form>
    <% } else { %>
        <p>Record not found with this engine number.</p>
    <% } %>
</div>

</body>
</html>
