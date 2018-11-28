<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Havmor - Order Details</title>

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

	<jsp:useBean id="order" class="com.havmore.model.Order" scope="request"></jsp:useBean>

	<jsp:setProperty property="*" name="order" />

	<jsp:include page="/ProcessOrder"></jsp:include>
	<div class="container">
		<div class="row">
			<table class="table">
				<thead class="table-success">
					<tr>
						<th>Products</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ic" items="${param.order.getItems()}">
						<tr>
							<td><c:out value="${ic.getName()}"></c:out></td>
							<td></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
 --%>