<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<style>
table {
  border-collapse: collapse;
  width: 50%;
  margin-left: auto;  
margin-right: auto;  
text-align: center;  
font-size: 20px;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) 
{background-color: #f2f2f2;}

h1{  
font-family: Arial, Helvetica, sans-serif; color:blue;
text-align: center; 
}

h3{ text-align: center; 

}
</style>


<body>
<h1  >Customer Management </h1>

	<table border=1>
		<tr>
			<th>Customer Id</th>
			<th>Name</th>
			<th>MobileNo</th>
			<th>City</th>
			<th>Product Id</th>
		</tr>
		<c:forEach var="sobj" items="${listCustomer}">
			<tr>
				<td>${sobj.getCid()}</td>
				<td>${sobj.getCname()}</td>
				<td>${sobj.getMobileno()}</td>
				<td>${sobj.getCity()}</td>
				<td>
				<a href="edit/${sobj.getCid()}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; 
				<a href="delete/${sobj.getCid()}">Delete</a>
				</td>
			</tr>
		</c:forEach>
		

	</table>
<h3><a href='add/'>Add Customer</a></h3>
</body>
</html>
