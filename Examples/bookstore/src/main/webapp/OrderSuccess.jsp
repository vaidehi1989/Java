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
		<h3>Purchased Book Details</h3>
		<div class="row">
			<s:property value="title" />
			<s:property value="author.name" />
			<s:property value="publication" />
			<s:property value="edition" />
			<s:property value="price" />
		</div>
	</div>
</body>
</html>
