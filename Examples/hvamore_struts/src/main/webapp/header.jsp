<%@page import="com.havmore.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Havmor - <%=request.getParameter("title")%></title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style>
/* Make the image fully responsive */
.carousel-inner img {
	width: 100%;
	height: 100%;
}
</style>

<style>
.footer {
	position: relative;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: red;
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-info navbar-dark sticky-top">
		<div class="navbar-nav mr-auto">
			<ul class="navbar-nav" style="padding-left: 120px">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="listproducts.jsp">Products</a></li>
				<li class="nav-item"><a class="nav-link" href="listcoffees">Coffees</a></li>


				<%
					User user = (User) session.getAttribute("user");
					if (user != null) {
				%>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Logout</a></li>

				<%
					} else {
				%>
				<li class="nav-item ml-auto"><a class="nav-link"
					href="login.jsp">Login</a></li>
				<%
					}
				%>

			</ul>
		</div>
		<a href="index.html"
			style="left: 1050px; height: 80px; visibility: visible; float: right; z-index: 100;"><img
			src="images/havmor-logo.png" /></a>
	</nav>