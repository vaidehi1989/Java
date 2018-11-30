<%@page
	import="com.bookstore.demos.profiles_jdbctemplating.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:if test="${not empty studentList}">
			<tr>
				<td>Roll NO.</td>
				<td>Name</td>
				<td>Marks</td>
			</tr>

			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.getRno() }</td>
					<td>${student.getName()}</td>
					<td>${student.getMarks()}</td>

				</tr>
			</c:forEach>
		</c:if>
	</table>
	<%-- <%
		List<Student> list = (List) request.getAttribute("studentList");

		for (Student s : list) {
	%>
	<%=s%>
	<%
		}
	%>
 --%>

</body>
</html>