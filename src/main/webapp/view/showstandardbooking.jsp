<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
<!DOCTYPE html>


<%@page import="com.Air.Model.Standard"%>
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

<h2>Standard Bookings</h2>

<table>
  <tr>
   <th>Passport Number</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email Id</th>
    <th>Nationality</th>
    <th>Mobile Number</th>
    <th>Age</th>
    <th>DOB </th>
  </tr>
  
  
  
  <%
  List<Standard> k46=(List<Standard>) request.getAttribute("k46");
  %>
  
  
  <%
  for(Standard s1:k46){
  %>
  

               <tr>

                <td><%out.println(s1.getPassportNo());%></td>
                 <td><%out.println(s1.getFirstname()); %></td>
                <td><%out.println(s1.getLastname()); %></td>
                <td><%out.println(s1.getEmailid()); %></td>
                <td><%out.println(s1.getNationality()); %></td>
                <td><%out.println(s1.getMobinum()); %></td>
                <td><%out.println(s1.getAge()); %></td>
                <td><%out.println(s1.getDOB()); %></td>
                 
               </tr>  
  
  
  
  
  
  
  
  <%
  }
  %>
  
  
  
  
  
</table>

</body>
</html>









