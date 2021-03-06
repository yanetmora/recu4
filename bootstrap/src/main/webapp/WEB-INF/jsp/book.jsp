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
					<li><a href="new-book">New Book</a></li>
					<li><a href="all-books">All Books</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Book Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_BOOKS'}">
			<div class="container text-center" id="booksDiv">
				<h3>My Books</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Author</th>
								<th>Pages</th>
								<th>Editorial</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="book" items="${books}">
								<tr>
									<td>${book.id}</td>
									<td>${book.name}</td>
									<td>${book.author}</td>
									<td>${book.pages}</td>
									<td>${book.editorial}</td>
									<td><a href="update-book?id=${book.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-book?id=${book.id}"> <span
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
				<h3>Manage Book</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-book">
					<input type="hidden" name="id" value="${book.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								value="${book.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Author:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="author"
								value="${book.author}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Pages:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="pages"
								value="${book.pages}" />
						</div>
					</div>
					
						<div class="form-group">
						<label class="control-label col-sm-3">Editorial:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="editorial"
								value="${book.editorial}" />
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