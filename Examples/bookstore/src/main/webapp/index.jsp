
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Online - Home</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<h3>Search Books</h3>
		<div class="row">
			<s:form action="searchbooks" cssClass="form-inline" theme="simple">
				<table>
					<tr>
						<td><s:textfield cssClass="form-control" name="title"
								placeholder="Book Name"></s:textfield></td>
						<td><s:textfield cssClass="form-control" name="author.name"
								placeholder="Author Name"></s:textfield></td>
						<td>
							<button type="submit" class="btn btn-info">Search</button>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
		<br> <br>
		<div class="row">
			<table class="table table-hover table-striped">
				<thead class="table-warning">
					<tr>
						<td>Book Title</td>
						<td>Author Name</td>
						<td>Publication</td>
						<td>Edition</td>
						<td>Price</td>
						<td colspan="2"></td>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="searchBooks">

						<tr>
							<td><s:property value="title" /></td>
							<td><s:property value="author.name" /></td>
							<td><s:property value="publication" /></td>
							<td><s:property value="edition" /></td>
							<td><s:property value="price" /></td>
							<td><s:form action="selectbooks">
									<s:hidden name="bookId" value="%{bookId}" type="number"></s:hidden>
									<s:submit cssClass="btn-info" value="BUY" />
								</s:form></td>
						</tr>

					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>