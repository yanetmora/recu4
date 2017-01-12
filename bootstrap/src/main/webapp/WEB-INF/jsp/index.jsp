<%@page language="java" contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-canche">
<meta http-equiv="Cahe-Control" content="no-canche">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
<title>Boot Sample | Home</title>
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="#" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				<!-- 	
					<li><a href="food">Food</a></li>
					<li><a href="descriptorType">Descriptor Types</a></li>
					<li><a href="sing">Sing</a></li>
					
					
					<li><a href="martial">Martial Art</a></li>
					<li><a href="book">Book</a></li>
					<li><a href="sitePersonnelRole">Site Personnel Role</a></li>
					<li><a href="peer">Peer</a></li>
					<li><a href="picture">Picture</a></li> 
					<li><a href="review">Review</a></li>-->
					<li><a href="assoc">Assoc</a></li>
					<li><a href="task">Task</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	<c:choose>
		<c:when test="${mode == 'MODE_HOME' }">
			<div class="container">
				<div class="jumbotrom text-center" id="homeDiv">
					<h1>Welcome</h1>
				</div>
			</div>
		</c:when>

	</c:choose>

	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
</body>

</html>