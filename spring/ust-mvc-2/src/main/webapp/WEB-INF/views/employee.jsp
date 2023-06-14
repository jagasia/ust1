<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
      
    </div>
    <div class="col-sm-4">
      <h3>Employee Form</h3>
      <form:form modelAttribute="employee" method="post" action="/employee/dml">
      	Id: <form:input path="id" class="form-control" />
      	First Name: <form:input path="firstName" class="form-control" />
      	Last Name: <form:input path="lastName" class="form-control" /><br/>
      	<input type="submit" value="Add" class="btn btn-success" name="btnAdd" />&nbsp;
      	<input type="submit" value="Update" class="btn btn-warning" name="btnUpdate" />&nbsp;
      	<input type="submit" value="Delete" class="btn btn-danger" name="btnDelete" />&nbsp;
      </form:form>
    </div>
    <div class="col-sm-4">
              
      
    </div>
  </div>
  <div class="row">
  	<div class="col-sm-2"></div>
  	<div class="col-sm-8">
  		<table class="table table-striped table-bordered table-hover">
  			<thead>
  				<tr>
  					<th>Id</th><th>First Name</th><th>Last Name</th><th></th>
  				</tr>
  			</thead>
  			<tbody>
  				<c:forEach var="e" items="${employees }">
  					<tr>
  						<td>${e.id }</td>
  						<td>${e.firstName }</td>
  						<td>${e.lastName }</td>
  						<td>
  							<a class="btn btn-info" href="/employee/select?id=${e.id }">Select</a>
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