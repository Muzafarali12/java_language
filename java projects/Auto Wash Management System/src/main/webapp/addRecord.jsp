<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Box</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f6f9;
        margin: 0;
        padding: 40px;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    h2 {
        color: #333;
        margin-bottom: 20px;
    }
    .form-box {
        border: 1px solid #ccc;
        padding: 20px;
        width: 340px;
        border-radius: 10px;
        background: #fff;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        margin-bottom: 25px;
    }
    .form-group {
        margin-bottom: 14px;
    }
    label {
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
        color: #444;
    }
    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #bbb;
        border-radius: 6px;
        outline: none;
        transition: border 0.2s;
    }
    input:focus {
        border-color: #2563eb;
    }
    button {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 6px;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
        color: #fff;
        margin-top: 10px;
        transition: 0.3s;
    }
    .btn-insert { background: #16a34a; }
    .btn-insert:hover { background: #15803d; }
    
    .btn-delete { background: #dc2626; }
    .btn-delete:hover { background: #b91c1c; }
    
    .btn-update { background: #f97316; }
    .btn-update:hover { background: #ea580c; }
    
    .btn-show { background: #2563eb; }
    .btn-show:hover { background: #1e40af; }

    /* Action buttons container */
    .actions {
        display: flex;
        gap: 12px;
        justify-content: center;
        margin-top: 10px;
    }
    .actions form {
        margin: 0;
        flex: 1;
    }
</style>
</head>
<body>

    <h2>Auto Wash Service Manager</h2>
     
    <form action="CRUDApplicationServlet" method="post" class="form-box">
        <div class="form-group">
            <label for="engineNumber">Vehicle Engine Number</label>
            <input type="number" name="engineNumber" id="engineNumber">
        </div>

        <div class="form-group">
            <label for="name">Vehicle Name</label>
            <input type="text" name="name" id="name">
        </div>

        <div class="form-group">
            <label for="model">Vehicle Model</label>
            <input type="number" name="model" id="model">
        </div>

        <div class="form-group">
            <label for="color">Vehicle Color</label>
            <input type="text" name="color" id="color">
        </div>

        <div class="form-group">
            <label for="bodyType">Vehicle Body Type</label>
            <input type="text" name="bodyType" id="bodyType">
        </div>

        <div class="form-group">
            <label for="company">Vehicle Company</label>
            <input type="text" name="company" id="company">
        </div>      

        <!-- Register button -->
        <button type="submit" name="actionType" value="insert" class="btn-insert">Enter Record</button>
    </form>

    <!-- Action buttons side by side -->
    <div class="actions">
        <form action="ShowAllRecordsServlet" method="get">
            <button type="submit" class="btn-show">Show Records</button>
        </form>
    </div>
   
</body>
</html>
