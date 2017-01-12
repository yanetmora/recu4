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
					<li><a href="new-picture">New Picture</a></li>
					<li><a href="all-pictures">All Pictures</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Picture Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_PICTURES'}">
			<div class="container text-center" id="picturesDiv">
				<h3>My Pictures</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>picture Id</th>
								<th>Description</th>
								<th>Width</th>
								<th>Heigth</th>
								<th>Artist</th>
							
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="picture" items="${pictures}">
								<tr>
									<td>${picture.pictureId}</td>
									<td>${picture.description}</td>
									<td>${picture.width}</td>
									<td>${picture.heigth}</td>
									<td>${picture.artist}</td>
									
									<td><a href="update-pictures?pictureId=${picture.pictureId}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-picture?pictureId=${picture.pictureId}"> <span
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
				<h3>Manage Picture</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-picture">
					<input type="hidden" name="picture" value="${picture.pictureId}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Description:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="desc"
								value="${picture.description}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Width:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="width"
								value="${picture.width}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Heigth:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="heigth"
								value="${picture.heigth}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Artist:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="artist"
								value="${picture.artist}" />
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