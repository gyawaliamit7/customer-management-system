<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
	<title>List of Customers</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>


<body>
	
	<div class = "container">
	   <%@ include file="/WEB-INF/views/header.jsp" %>
		
		<h3 class ="text-center"> Customer List</h3>
	
		
		<br>
		
		<table class ="table table-bordered">
			<thead>
				<tr>
					<th> ID </th>
					<th> First Name</th>
					<th> Last Name</th>
					<th> Email Address </th>
					<th> Phone No. </th>
					<th> Actions </th>
				</tr>
			</thead>
				
				<c:forEach var = "customer" items = "${customerList}">
					
					<tr>
						<td>
							<c:out value ="${customer.id}" />
						</td>
						
						<td>
							<c:out value ="${customer.firstName}" />
						</td>
						
						<td>
							<c:out value ="${customer.lastName}" />
						</td>
						
						<td>
							<c:out value ="${customer.emailAddress}" />
						</td>
						
						<td>
							<c:out value ="${customer.phoneNo}" />
						</td>
						
						<td>
						<a href="edit?id=<c:out value='${customer.id}' />">Edit</a> 
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="delete?id=<c:out value='${customer.id}' />">Delete</a></td>
							
						</td>
					</tr>
				
				</c:forEach>
			
			
			<tbody>
				
			</tbody>
		</table>
	
	</div>

</body>
</html>