<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<jsp:include page="header.jsp">
	<jsp:param value="List Coffees" name="title" />
</jsp:include>

<div class="container">
	<br> <br>
	<div class="row">
		<a href="insertcoffee.jsp" class="btn btn-success btn-sm">Add
			Coffee</a> <br> <br>


		<table class="table table-hover table-striped">
			<thead class="table-warning">
				<tr>
					<td>Coffee Name</td>
					<td>Price</td>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="coffees">

					<tr>
						<td><s:property value="name" /></td>
						<td><s:property value="price" /></td>
					</tr>

				</s:iterator>
			</tbody>
		</table>
	</div>







</div>