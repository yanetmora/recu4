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
					<li><a href="new-assoc">New Assoc</a></li>
					<li><a href="all-assocs">All Assocs</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Assoc Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_ASSOCS'}">
			<div class="container text-center" id="assocsDiv">
				<h3>My Assocs</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>From</th>
								<th>To</th>
								<th>Relationship</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="assoc" items="${assocs}">
								<tr>
									<td>${assoc.id}</td>
									<td>${assoc.froom}</td>
									<td>${assoc.too}</td>
									<td>${assoc.relationship}</td>
									<td><a href="update-assoc?id=${assoc.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-assoc?id=${assoc.id}"> <span
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
				<h3>Manage Assoc</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-assoc">
					<input type="hidden" name="id" value="${assoc.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">From:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="froom"
								value="${assoc.froom}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">To:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="too"
								value="${assoc.too}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Relationship:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="relationship"
								value="${assoc.relationship}" />
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