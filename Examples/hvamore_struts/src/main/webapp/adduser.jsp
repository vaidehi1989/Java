<jsp:include page="header.jsp">
	<jsp:param value="Sign Up" name="title" />
</jsp:include>

<div class="container">

	<div class="container">
		<div class="row sm-40" style="margin: auto; max-width: 300px;">
			<div class="card bg-light text-dark">
				<div class="card-header">Sign Up!!</div>
				<div class="card-body">
					<form action="Add.jsp" method="post">
						<div class="form-group">
							<label for="name">Name:</label> <input type="text"
								class="form-control" id="name" name="name">
						</div>
						<div class="form-group">
							<label for="type">Category:</label>
							<div class="radio">
								<label><input type="radio" name="type" value="customer">Customer</label>
							</div>
							<div class="radio">
								<label><input type="radio" name="type"
									value="shopkeeper">Shopkeeper</label>
							</div>
						</div>
						<div class="form-group">
							<label for="userName">UserName:</label> <input type="text"
								class="form-control" id="userName" name="userName">
						</div>
						<div class="form-group">
							<label for="password">Password:</label> <input type="password"
								class="form-control" id="password" name="password">
						</div>
						<button type="submit" class="btn btn-success">ADD</button>
						<div class="form-group">
							<label>Already a member? <a href="login.jsp">Login!</a></label>
						</div>
					</form>
				</div>

			</div>
		</div>

	</div>

</div>
<jsp:include page="footer.jsp"></jsp:include>