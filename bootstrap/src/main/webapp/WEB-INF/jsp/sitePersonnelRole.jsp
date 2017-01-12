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
					<li><a href="new-site-personnel-roles">New Site Personnel Role</a></li>
					<li><a href="all-site-personnel-roles">All Site Personnel Roles</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Site Personnel Role Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_SITE_PERSONNEL_ROLES'}">
			<div class="container text-center" id="sitePersonnelRolesDiv">
				<h3>My Site Personnel Roles</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Personnel Id</th>
								<th>Role Id</th>
								<th>Module Id</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="sitePersonnelRole" items="${sitePersonnelRoles}">
								<tr>
									<td>${sitePersonnelRole.id}</td>
									<td>${sitePersonnelRole.personnelId}</td>
									<td>${sitePersonnelRole.roleId}</td>
									<td>${sitePersonnelRole.moduleId}</td>
									<td><a href="update-site-personnel-roles?id=${sitePersonnelRole.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-site-personnel-roles?id=${sitePersonnelRole.id}"> <span
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
				<h3>Manage Site Personnel Role</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-site-personnel-roles">
					<input type="hidden" name="id" value="${sitePersonnelRole.id}" />
					
					
					<div class="form-group">
						<label class="control-label col-sm-3">Personnel Id:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="personnelId"
								value="${sitePersonnelRole.personnelId}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Role Id:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="roleId"
								value="${sitePersonnelRole.roleId}" />
						</div>
					</div>
				
				<div class="form-group">
						<label class="control-label col-sm-3">Module Id:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="moduleId"
								value="${sitePersonnelRole.moduleId}" />
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