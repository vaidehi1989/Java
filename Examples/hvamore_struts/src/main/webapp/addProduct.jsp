<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<div class="modal" id="AddInventory">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<form action="AddProductServlet" method="post">
				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Add new Product</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">

					<div class="form-group">
						<label for="name">Name:</label> <input type="text"
							class="form-control" id="name" name="name">
					</div>
					<div class="form-group">
						<label for="category">Category:</label>
						<div class="radio">
							<label><input type="radio" name="category" value="candy">Candy</label>
						</div>
						<div class="radio">
							<label><input type="radio" name="category" value="cups">Cups</label>
						</div>
						<div class="radio">
							<label><input type="radio" name="category"
								value="combopacks">Combo Packs</label>
						</div>
					</div>
					<div class="form-group">
						<label for="price">Price:</label> <input type="number"
							class="form-control" id="price" name="price">
					</div>

				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="submit" class="btn btn-success">ADD</button>
				</div>
			</form>
		</div>
	</div>
</div>