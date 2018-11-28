<jsp:useBean id="icecream" class="com.havmore.model.Icecream"
	scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="icecream" />
<jsp:forward page="AddProductServlet"></jsp:forward>