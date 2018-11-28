
<%@page import="com.havmore.model.User"%>
<jsp:include page="header.jsp">
	<jsp:param value="Home" name="title" />
</jsp:include>

<div id="myCarousel" class="carousel slide" data-ride="carousel">

	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>

	<div class="carousel-inner">
		<div class="carousel-item active">
			<img src="images/Hersheys-Banner_1500-X-500-PIXEL-updated.png"
				width="1100" height="500">
		</div>
		<div class="carousel-item">

			<img src="images/Drinks-of-Summer_1500x500-1024x342.jpg" width="1100"
				height="500">
		</div>
		<div class="carousel-item">
			<img
				src="images/Web-Banner-1500-x-500-3-Chocolate-Cone-01-700x233.jpg"
				width="1100" height="500">
		</div>
	</div>

	<a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
		<span class="carousel-control-prev-icon"></span>
	</a> <a class="carousel-control-next" href="#myCarousel" data-slide="next">
		<span class="carousel-control-next-icon"></span>
	</a>
</div>
<%!int count = 1;%>
<%
	count++;
	User user = (User) session.getAttribute("user");
	if (user != null && user.getType().equals("shopkeeper")) {
%>

<div class="container">
	<div class="row">
		<h5>
			No of Hits :
			<%=count%></h5>
	</div>
</div>

<%
	}
%>






<jsp:include page="footer.jsp"></jsp:include>