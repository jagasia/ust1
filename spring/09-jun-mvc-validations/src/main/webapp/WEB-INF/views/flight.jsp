<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<form:form class="container" method="post" action="/flight/addFlight" modelAttribute="flight">
			Id: <form:input type="number" path="id" class="form-control" /><br/>
			Name: <form:input type="text" path="name" class="form-control" />
			<form:errors style="color:red" path="name" /><br/>
			Capacity: <form:input type="number" path="capacity" class="form-control" />
			<br/>
			<input type="submit" value="Add" class="btn btn-success" name="btnAdd" />&nbsp;
			<input type="submit" value="Update" class="btn btn-warning" name="btnUpdate" />&nbsp;
			<input type="submit" value="Delete" class="btn btn-danger" name="btnDelete" />&nbsp;
		</form:form>
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
  				<th>Id</th><th>Name</th><th>Capacity</th><th></th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach var="f" items="${flights }">
  				<tr>
  					<td>${f.id }</td>
  					<td>${f.name }</td>
  					<td>${f.capacity }</td>
  					<td><a href="/flight/select?id=${f.id }" class="btn btn-info">Select</a>
  					</td>
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