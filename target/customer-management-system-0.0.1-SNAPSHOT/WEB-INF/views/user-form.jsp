<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Customer Management System</title>

</head>
<body>

	<header>
	</header>
	<div class = "container ">
	<%@ include file="/WEB-INF/views/header.jsp" %>
	
			
		<c:if test ="${customer ==null}">
			<form  action="add" method = "post" onsubmit="return validate();">
			
		</c:if>
		<c:if test = "${customer != null}">
			<form action="update" method = "post" onsubmit="return validate();">
		</c:if>
		
		
			<caption>
				<h2>
					<c:if test = "${customer == null }"> 
						Add Customer
					</c:if>
					
					<c:if test = "${customer != null} }"> 
						Edit Customer
					</c:if>
				</h2>
			</caption>
		
				<c:if test="${customer != null}">
	               <input type="hidden" name="id" value="<c:out value='${customer.id}' />" />
	          	</c:if>
			
	    		<fieldset class="form-group">
                <label>First Name</label> 
                <input  type="text" id = "firstName" value="<c:out value='${customer.firstName}' />" class="form-control" name="firstName" required="required">
              
              </fieldset>
              
              <fieldset class="form-group">
                <label>Last Name</label> 
                <input type="text" id ="lastName" value="<c:out value='${customer.lastName}' />" class="form-control" name="lastName" required="required">
              
              </fieldset>
              
              <fieldset class="form-group">
                <label>Email Address</label> 
                <input type="email" id ="emailAddress" value="<c:out value='${customer.emailAddress}' />" class="form-control" name="emailAddress" required="required">
                
              </fieldset>
              
              <fieldset class="form-group">
                <label>Phone No.</label> 
                <input type="text" id ="phoneNumber value="<c:out value='${customer.phoneNo}' />" class="form-control" name="phoneNumber" required="required">
              
              </fieldset>
              
              <button type="submit" class="btn btn-primary">Save</button>
  		</form>
	</div>
</body>
</html>