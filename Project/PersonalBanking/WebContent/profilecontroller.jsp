<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%try{ %>
<jsp:include page="block.jsp"></jsp:include>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
session = request.getSession(true);
//int customerID= 25001;
Integer customerID = (Integer)session.getAttribute("customerID");
System.out.println(customerID);
AddressDao a = new AddressDaoImpl(customerID);//getInstance(customerID);
List<Address> addresses = a.getAllAddress();
for(Address x: addresses) {
	System.out.println("Address: "+x);
}
session.setAttribute("addresses", addresses);
%>
 <jsp:forward page="profile.jsp"></jsp:forward>
</body>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}%>
</html>