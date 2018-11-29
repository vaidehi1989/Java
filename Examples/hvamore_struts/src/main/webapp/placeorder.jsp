<%@page import="java.util.List"%>
<%@page import="com.havmore.model.Icecream"%>
<jsp:include page="/ListProductsServlet"></jsp:include>

<%
	List<Icecream> products = (List<Icecream>) request.getAttribute("products");
	pageContext.setAttribute("products", products);
%>

<div class="modal" id="PlaceOrder">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<form action="processorder.jsp" method="post">
				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Place your Order!</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">

					<div id="accordion">
						<div class="card bg-success text-white">
							<div class="card-header" align="center">
								<a class="card-link text-white" data-toggle="collapse"
									href="#collapseOne">Candies </a>
							</div>
							<div id="collapseOne" class="collapse show"
								data-parent="#accordion">
								<div class="card-body" align="center">
									<table class="table table-borderless">
										<tbody>
											<c:forEach var="ic" items="${products}">
												<c:if test='${ic.getCategory().equals("candy")}'>
													<tr class="">
														<td><c:out value="${ic.getName()}" /></td>
														<td><input type="checkbox"
															class="form-check-input form-control-lg" name="products"
															value="${ic.getPid()}"></td>
													</tr>
												</c:if>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="card bg-info text-white">
							<div class="card-header" align="center">
								<a class="collapsed card-link text-white" data-toggle="collapse"
									href="#collapseTwo"> Cups </a>
							</div>
							<div id="collapseTwo" class="collapse" data-parent="#accordion">
								<div class="card-body" align="center">
									<table class="table table-borderless">
										<tbody>
											<c:forEach var="ic" items="${products}">
												<c:if test='${ic.getCategory().equals("cups")}'>
													<tr class="">
														<td><c:out value="${ic.getName()}" /></td>
														<td><input type="checkbox"
															class="form-check-input form-control-lg" name="products"
															value="${ic.getPid()}"></td>
													</tr>
												</c:if>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="card bg-warning text-white">
							<div class="card-header" align="center">
								<a class="collapsed card-link text-white" data-toggle="collapse"
									href="#collapseThree"> Combo Packs </a>
							</div>
							<div id="collapseThree" class="collapse" data-parent="#accordion">
								<div class="card-body" align="center">
									<table class="table table-borderless">
										<tbody>
											<c:forEach var="ic" items="${products}">
												<c:if test='${ic.getCategory().equals("combopacks")}'>
													<tr class="">
														<td><c:out value="${ic.getName()}" /></td>
														<td><input type="checkbox"
															class="form-check-input form-control-lg" name="products"
															value="${ic.getPid()}"></td>
													</tr>
												</c:if>
											</c:forEach>

										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>

				</div>
				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Order</button>
				</div>
			</form>
		</div>

	</div>
</div>