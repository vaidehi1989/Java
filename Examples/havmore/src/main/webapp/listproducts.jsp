
<%@page import="com.havmore.model.Icecream"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Our Products</h1>
	<%
		List<Icecream> icecreams = (List) request.getAttribute("icecreamList");
	%>
	<table border="1px">
		<tr>
			<td>Name</td>
			<td>Category</td>
			<td>Price</td>
		</tr>
		<%
			for (Icecream icecream : icecreams) {
		%>
		<tr>
			<td><%=icecream.getName()%></td>
			<td><%=icecream.getCategory()%></td>
			<td><%=icecream.getPrice()%></td>

		</tr>
		<%
			}
		%>

	</table>



</body>
</html>