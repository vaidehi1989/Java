<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="header.jsp">
	<jsp:param value="Insert Coffee" name="title" />
</jsp:include>

<div class="container">

	<s:form action="insertcoffee" cssClass="form-group">

		<s:textfield name="name" label="Name " cssClass="form-control"></s:textfield>


		<s:textfield name="price" label="Price " type="number"
			cssClass="form-control"></s:textfield>


		<s:submit value="ADD" cssClass="btn btn-info"></s:submit>


	</s:form>



</div>





