<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Welcome to Customer Management System</title>
</head>
<body>
	<div class="container">
		<%@ include file="/WEB-INF/views/header.jsp"%>

		<h3 class="text-center">Customer List</h3>
		<div class="row">
			
			
			<div class="col-8">
				Welcome to Customer Management System
			
			</div>
			<div class="col">
				<div class="container text-left">
					<form class="form-signin" action="<c:url value='login' />" method='POST' >
						<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
						<label for="inputEmail" class="sr-only">Email address</label> 
						<input
							type="text" id="text" name = "username" class="form-control"
							placeholder="Email address" required autofocus> 
						<label
							for="inputPassword" class="sr-only">Password</label>
						<input
							type="password" id="inputPassword" name ="password" class="form-control"
							placeholder="Password" required>
						<div class="checkbox mb-3">
							<label> <input type="checkbox" value="remember-me">
								Remember me
							</label>
						</div>
						<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
							in</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
</html>