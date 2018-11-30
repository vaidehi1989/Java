<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<sf:form method="post"
	action="${pageContext.request.contextPath}/insertstudent"
	modelAttribute="student">


	<label>Name</label>
	<sf:input path="name" />
	<sf:errors path="name" cssStyle="color:red;"></sf:errors>
	<br>
	<label>Marks</label>
	<sf:input path="marks" />
	<sf:errors path="marks" cssStyle="color:red;"></sf:errors>
	<br>
	<sf:button class="btn btn-primary">Add</sf:button>
</sf:form>
