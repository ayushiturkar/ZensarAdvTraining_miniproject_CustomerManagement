<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>

<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>


</head>
<body>
<div>
<c:if test="${empty customer}">
<h1>Add Customer</h1>
<form action="add" method="get">
</c:if> 

<c:if test="${not empty customer}">
<h1>Edit customer</h1>
<form action="save" method="post">
</c:if>


Id : <input type='text' name="cid" value="${customer.getCid()}" placeholder="Customer Id">
<br>
Name : <input type='text' name="cname" value="${customer.getCname()}" placeholder="Customer Name.." >
<br>
MobileNo: <input type='text' name="mobileno" value="${customer.getMobileno()}" placeholder="Mobile No">
<br>
City : <input type='text' name="city" value="${customer.getCity()}" placeholder="City Name.." >
<br>

<button type="submit">Save</button>
</form>
</div>

</body>
</html>