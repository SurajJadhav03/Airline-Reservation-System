<!DOCTYPE html>
<%@page import="com.Air.Model.Hotelbooking"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
</style>
</head>
<body>

<h2>Hotel Bookings</h2>

<table>
  <tr>
  <th>Passportnumber</th>
    <th>Flightnumber</th>
    <th>Fullname</th>
    <th>Date</th>
    <th>yes</th>
    <th>No</th>
    <th>specialrequest</th>
  </tr>
  
  
  <%  
  List<Hotelbooking> l1=(List<Hotelbooking>) request.getAttribute("l1");
  %>
  
  
  
    <%
  for(Hotelbooking c1 : l1){
  %>
  
  <tr>
    <td><%out.print(c1.getPassportnumber()); %></td>
    <td><%out.print(c1.getFlightnumber()); %></td>
    <td><%out.print(c1.getFullname()); %></td>
    <td><%out.print(c1.getRoom()); %></td>
    <td><%out.print(c1.getYes()); %></td>
    <td><%out.print(c1.getNo()); %></td>
      <td><%out.print(c1.getSpecialrequest()); %></td>
  </tr>
  
 <%
  }
  %>
</table>








</body>
</html>






















