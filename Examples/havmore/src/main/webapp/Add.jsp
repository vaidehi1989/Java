<jsp:useBean id="user" class="com.havmore.model.User" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="user" />
<jsp:forward page="AddUserServlet"></jsp:forward>



<%-- <jsp:setProperty property="name" name="user" param="name" />
<jsp:setProperty property="userName" name="user" param="userName"/>
<jsp:setProperty property="password" name="user" param="password" />
<jsp:setProperty property="type" name="user" param="category" /> --%>

<%-- Name :
<jsp:getProperty property="name" name="user" /><br>
username :
<jsp:getProperty property="userName" name="user" /><br>
password :
<jsp:getProperty property="password" name="user" /><br>
type :
<jsp:getProperty property="type" name="user" /><br>



 --%>