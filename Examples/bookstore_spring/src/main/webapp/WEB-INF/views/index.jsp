<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>

	<h1>Welcome to spring mvc</h1>
	<a href="${pageContext.request.contextPath}/addstudent">Add student</a>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/studentdetails">View
		students</a>

</body>
</html>