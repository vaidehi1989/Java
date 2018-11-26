
<%
	session.invalidate();
%>
<jsp:include page="header.jsp">
	<jsp:param value="Login" name="title" />
</jsp:include>

<div class="container">
	<div class="row sm-40" style="margin: auto; max-width: 300px;">
		<div class="card bg-light text-dark">
			<div class="card-header">Login</div>
			<div class="card-body">
				<form action="LoginServlet" method="post">
					<div class="form-group">
						<label for="userName">UserName:</label> <input type="text"
							class="form-control" id="userName" name="userName">
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input type="password"
							class="form-control" id="password" name="password">
					</div>
					<button type="submit" class="btn btn-success">LOGIN</button>
					<div class="form-group">
						<label>Not a member yet? <a href="adduser.jsp">Sign
								up!</a></label>
					</div>
				</form>

			</div>

		</div>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>