<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js">
	</script>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>MVC Page for Employees!</h1>
  <p>Look at this effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
    <div class="col-sm-4">
      <h3>Employee Form</h3>
		<form method="post" action="employee/emp">
			Id: <input type="number" name="id" class="form-control" />
			First Name: <input type="text" name="firstName" class="form-control" />
			Last Name: <input type="text" name="lastName" class="form-control" />
			Department:<select name="department" class="form-control">
				<option>Choose...</option>
				<option>ECE</option>
				<option>EEE</option>
				<option>CSE</option>
				<option>MCA</option>
			</select>
			<br/>
			<input type="submit" value="Add" class="btn btn-success" name="btnAdd" />&nbsp;
			<input type="submit" value="Edit" class="btn btn-warning" name="btnEdit" />&nbsp;
			<input type="submit" value="Delete" class="btn btn-danger" name="btnDelete" />&nbsp;
			
		</form>
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>        
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
  </div>
  <div class="row">
  <div class="col-sm-2"></div>
  <div class="col-sm-8">
  	<table class="table table-bordered table-striped table-hover">
  		<thead>
  			<tr>
  				<th>Id</th><th>First Name</th><th>Last Name</th><th>Department</th><th></th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach var="e" items="${employees }">
  				<tr>
  					<td>${e.id }</td>
  					<td>${e.firstName }</td>
  					<td>${e.lastName }</td>
  					<td>${e.department }</td>
  				</tr>
  			</c:forEach>	
  		</tbody>
  	</table>
  </div>
  <div class="col-sm-2"></div>
  </div>
</div>
</body>
</html>