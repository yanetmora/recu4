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
					<li><a href="new-review">New Review</a></li>
					<li><a href="all-reviews">All Reviews</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Review Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_REVIEWS'}">
			<div class="container text-center" id="reviewsDiv">
				<h3>My Reviews</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>DocumentKey</th>
								<th>CrestionData</th>
								<th>Userkey</th>
								<th>Rating</th>
								<th>Comments<th>
								<th>Data</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="review" items="${reviews}">
								<tr>
									<td>${review.id}</td>
									<td>${review.documentKey}</td>
									<td>${review.crestionData}</td>
									<td>${review.userKey}</td>
									<td>${review.rating}</td>
									<td>${review.comments}</td>
									<td>${review.data}</td>
									<td><a href="update-review?id=${review.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-review?id=${review.id}"> <span
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
				<h3>Manage Review</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-review">
					<input type="hidden" name="id" value="${review.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">DocumentKey:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="documentKey"
								value="${review.documentKey}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">CrestionData:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="crestionData"
								value="${review.crestionData}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Userkey:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="userKey"
								value="${review.userKey}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Rating:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="rating"
								value="${review.rating}" />
						</div>
					</div>
				     
				     <div class="form-group">
						<label class="control-label col-sm-3">Comments:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="comments"
								value="${review.comments}" />
						</div>
					</div>
					 <div class="form-group">
						<label class="control-label col-sm-3">Data:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="data"
								value="${review.data}" />
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