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
					<li><a href="new-descriptor-type">New Descriptor Type</a></li>
					<li><a href="all-descriptor-types">All Descriptor Types</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Descriptor Type Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_DESCRIPTOR_TYPES'}">
			<div class="container text-center" id="descriptorTypesDiv">
				<h3>My Descriptor Types</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Code</th>
								<th>Length</th>
								<th>Unit</th>
								<th>Descr</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="descriptorType" items="${descriptortypes}">
								<tr>
									<td>${descriptorType.id}</td>
									<td>${descriptorType.code}</td>
									<td>${descriptorType.name}</td>
									<td>${descriptorType.length}</td>
									<td>${descriptorType.unit}</td>
									<td>${descriptorType.descr}</td>
									<td><a href="update-descriptor-type?id=${descriptorType.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-descriptor-type?id=${descriptorType.id}"> <span
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
				<h3>Manage Descriptor Type</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-descriptor-type">
					<input type="hidden" name="id" value="${descriptorType.id}" />
					
					<div class="form-group">
						<label class="control-label col-sm-3">Code:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="code"
								value="${descriptorType.code}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								value="${descriptorType.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Length:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="length"
								value="${descriptorType.length}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Unit:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="unit"
								value="${descriptorType.unit}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Descr:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="descr"
								value="${descriptorType.descr}" />
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