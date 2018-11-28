<%@page import="com.havmore.model.Cake"%>
<%@page import="com.havmore.model.User"%>
<%@page import="com.havmore.model.Icecream"%>
<%@page import="java.util.List"%>

<jsp:include page="header.jsp">
	<jsp:param value="Products" name="title" />
</jsp:include>




<jsp:include page="/ListCakesServlet"></jsp:include>


<%
	List<Cake> cakes = (List) request.getAttribute("cakesList");
	System.out.println(cakes.size());
%>
<br>
<div class="container">
	<div class="row">

		<%
			User user = (User) session.getAttribute("user");
			if (user != null) {
				if (user.getType().equals("customer")) {
		%>
		<button type="button" class="btn-sm btn-primary" data-toggle="modal"
			data-target="#PlaceOrder">Place your Order</button>

		<%
			} else {
		%>
		<a href="addCake.xhtml" class="btn-sm btn-primary">Add Cake</a>

		<%
			}
			}
		%>

	</div>
	<br>
	<div class="row">

		<div class="card bg-success text-white" style="width: 350px;">

			<div class="card-header" align="center">Cakes</div>
			<div class="card-body" align="center"></div>
			<div class="card-footer">
				<table class="table table-borderless">
					<tbody>
						<%
							for (Cake cake : cakes) {
						%>
						<tr class="">
							<td><%=cake.getName()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>