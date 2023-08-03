<!DOCTYPE html>
<%@page import="com.Air.Model.Contact"%>
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

<h2>Zebra Striped Table</h2>
<p>For zebra-striped tables, use the nth-child() selector and add a background-color to all even (or odd) table rows:</p>

<table>
  <tr>
  <th>Name</th>
    <th>email</th>
    <th>message</th>
    <th>Phone</th>
    <th>delete></th>
  </tr>
  
  
  <%  
  List<Contact> l1=(List<Contact>) request.getAttribute("l1");
  

  
  %>
    <%
  for(Contact c1 : l1){
  %>
  <tr>
    <td><%out.print(c1.getName()); %></td>
    <td><%out.print(c1.getEmail()); %></td>
    <td><%out.print(c1.getMessage()); %></td>
    <td><%out.print(c1.getPhone()); %></td>
  </tr>
 <%
  }
  %>
</table>

</body>
</html>
