<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Online - Insert Book</title>

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
		<h3>Welcome User, please add book details below</h3>

		<s:form action="insertbook" cssClass="form-group">

			<s:textfield name="title" label="Book Title " cssClass="form-control"></s:textfield>

			<s:select name="author.id" type="number" list="authors"
				cssClass="form-control" label="Author" listKey="id" listValue="name"></s:select>


			<s:textfield name="publication" label="Publication "
				cssClass="form-control"></s:textfield>
			<s:textfield name="edition" label="Edition " cssClass="form-control"></s:textfield>
			<s:textfield name="price" label="Price " type="number"
				cssClass="form-control"></s:textfield>


			<s:submit value="ADD" cssClass="btn btn-info"></s:submit>


		</s:form>



	</div>
</body>
</html>




