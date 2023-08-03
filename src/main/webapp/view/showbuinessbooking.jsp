<!DOCTYPE html>
<%@page import="com.Air.Model.Buisnessclass"%>
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

<h2>Buisness Class Bookings</h2>

<table>
  <tr>
  <th>Passportnumber</th>
    <th>Fullname</th>
    <th>Last Name</th>
    <th>Nationality</th>
    <th>Mobinum</th>
    <th>DOB</th>
    <th>Age</th>
    <th>Emailid</th>
  </tr>
  
  
  <%  
  List<Buisnessclass> k45=(List<Buisnessclass>) request.getAttribute("k45");
  

  
  %>
    <%
  for(Buisnessclass c1 :k45){
  %>
  <tr>
    <td><%out.print(c1.getPassportNo()); %></td>
    <td><%out.print(c1.getFirstname()); %></td>
    <td><%out.print(c1.getLastname()); %></td>
    <td><%out.print(c1.getNationality()); %></td>
    <td><%out.print(c1.getMobinum()); %></td>
    <td><%out.print(c1.getDOB()); %></td>
      <td><%out.print(c1.getAge()); %></td>
       <td><%out.print(c1.getEmailid()); %></td>
  </tr>
 <%
  }
  %>
</table>

</body>
</html>
