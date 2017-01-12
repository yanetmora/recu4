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
					<li><a href="new-peer">New Peer</a></li>
					<li><a href="all-peers">All Peers</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Peer Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_PEERS'}">
			<div class="container text-center" id="peersDiv">
				<h3>My Peers</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>peer Id</th>
								<th>Alias</th>
								<th>Login</th>
								<th>Password</th>
								<th>Country Code</th>
								<th>Ip End Point</th>
								<th>Behind Firewall</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="peer" items="${peers}">
								<tr>
									<td>${peer.peerId}</td>
									<td>${peer.alias}</td>
									<td>${peer.login}</td>
									<td>${peer.password}</td>
									<td>${peer.countryCode}</td>
									<td>${peer.ipEndPoint}</td>
									<td>${peer.behindFirewall==true?"YES":"NO"}</td>
									<td><a href="update-peers?peerId=${peer.peerId}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-peer?peerId=${peer.peerId}"> <span
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
				<h3>Manage Peer</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-peer">
					<input type="hidden" name="peerId" value="${peer.peerId}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Alias:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="alias"
								value="${peer.alias}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Login:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="login"
								value="${peer.login}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Password:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="password"
								value="${peer.password}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Country Code:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="countryCode"
								value="${peer.countryCode}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Ip End point:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="ipEndPoint"
								value="${peer.ipEndPoint}" />
						</div>
					</div>
				<div class="form-group">
						<label class="control-label col-sm-3">Behind Firewall:</label>
						<div class="col-sm-7">
							<input type="radio" class="col-sm-1" name="behindFirewall"
								value="true" />
								<div class="col-sm-2">YES</div>
							<input type="radio" class="col-sm-1" name="behindFirewall"
								value="false" checked="checked"/>
								<div class="col-sm-2">NO</div>
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