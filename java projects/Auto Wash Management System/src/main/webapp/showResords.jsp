<%@ page import="java.util.List" %>
<%@ page import="model.Car" %>
<html>
<head>
    <title>All Vehicles Box</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
            margin: 0;
            padding: 40px;
        }
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
            background: #fff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        th, td {
            padding: 12px 15px;
            text-align: center;
        }
        th {
            background: #2563eb;
            color: #fff;
            font-size: 15px;
        }
        tr:nth-child(even) {
            background: #f9fafb;
        }
        tr:hover {
            background: #e5edff;
        }
        td {
            color: #333;
            font-size: 14px;
        }
        .empty {
            text-align: center;
            padding: 20px;
            font-style: italic;
            color: #777;
        }
    </style>
</head>
<body>
    <h2>Vehicle List</h2>
    <table>
        <tr>
            <th>Engine No</th>
            <th>Name</th>
            <th>Model</th>
            <th>Color</th>
            <th>Body Type</th>
            <th>Company</th>
        </tr>
        <% 
            @SuppressWarnings("unchecked")
            List<Car> cars = (List<Car>) request.getAttribute("cars");
            if (cars != null && !cars.isEmpty()) {
                for (Car car : cars) {
        %>
        <tr>
            <td><%= car.getCarEngineNumber() %></td>
            <td><%= car.getName() %></td>
            <td><%= car.getModel() %></td>
            <td><%= car.getColor() %></td>
            <td><%= car.getBodyType() %></td>
            <td><%= car.getCompany() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="6" class="empty">No Record available!</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
