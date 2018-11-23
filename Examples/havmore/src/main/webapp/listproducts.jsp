<%@page import="com.havmore.model.User"%>
<%@page import="com.havmore.model.Icecream"%>
<%@page import="java.util.List"%>

<jsp:include page="header.jsp">
	<jsp:param value="Products" name="title" />
</jsp:include>




<%-- <jsp:include page="/ListProductsServlet"></jsp:include> --%>


<%
	List<Icecream> products = (List) request.getAttribute("icecreamList");
%>
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
		<button type="button" class="btn-sm btn-primary" data-toggle="modal"
			data-target="#AddInventory">Add Product</button>

		<%
			}
			}
		%>

	</div>
	<br>
	<div class="row">

		<div class="card bg-success text-white" style="width: 350px;">

			<div class="card-header" align="center">Candies</div>
			<div class="card-body" align="center">
				<img src="images/almond-chocobar.png" />
			</div>
			<div class="card-footer">
				<table class="table table-borderless">
					<tbody>
						<%
							for (Icecream ic : products) {
								if (ic.getCategory().equals("candy")) {
						%>
						<tr class="">
							<td><%=ic.getName()%></td>
							<td><%=ic.getPrice()%></td>
						</tr>
						<%
							}
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
		<br>
		<div class="card bg-info text-white" style="width: 350px;">
			<div class="card-header" align="center">Cups</div>
			<div class="card-body" align="center">
				<img src="images/Rasmalai-90-ml-cup_01.png" />
			</div>
			<div class="card-footer">
				<table class="table table-borderless">
					<tbody>
						<%
							for (Icecream ic : products) {
								if (ic.getCategory().equals("cups")) {
						%>
						<tr class="">
							<td><%=ic.getName()%></td>
							<td><%=ic.getPrice()%></td>
						</tr>

						<%
							}
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
		<br>
		<div class="card bg-warning text-white" style="width: 350px;">
			<div class="card-header" align="center">Combo Packs</div>
			<div class="card-body" align="center">
				<img src="images/golden-pearl.png" />
			</div>
			<div class="card-footer">
				<table class="table table-borderless">
					<tbody>
						<%
							for (Icecream ic : products) {
								if (ic.getCategory().equals("combopacks")) {
						%>
						<tr class="">
							<td><%=ic.getName()%></td>
							<td><%=ic.getPrice()%></td>
						</tr>
						<%
							}
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
		<br>

	</div>
</div>
<jsp:include page="addProduct.jsp"></jsp:include>
<%--<jsp:include page="placeorder.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include> --%>
<jsp:include page="footer.jsp"></jsp:include>