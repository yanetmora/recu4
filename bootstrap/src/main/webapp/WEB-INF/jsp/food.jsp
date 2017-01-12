<%@page language="java" contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Boot Sample | Home</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-food">New Food</a></li>
					<li><a href="all-foods">All Foods</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Food Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_FOODS'}">
			<div class="container text-center" id="foodsDiv">
				<h3>My Foods</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Flavor</th>
								<th>Origin</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="food" items="${foods}">
								<tr>
									<td>${food.id}</td>
									<td>${food.name}</td>
									<td>${food.flavor}</td>
									<td>${food.origin}</td>
									<td><a href="update-food?id=${food.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-food?id=${food.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Food</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-food">
					<input type="hidden" name="id" value="${food.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								value="${food.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Flavor:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="flavor"
								value="${food.flavor}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Origin:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="origin"
								value="${food.origin}" />
						</div>
					</div>
				
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>

				</form>
			</div>
		</c:when>
	</c:choose>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</body>
</html>