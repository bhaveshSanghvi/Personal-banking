<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="block.jsp"></jsp:include>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
try{
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	if(!(username.equals(null) || username.equals("null") || username.equals("") || password.equals("") || password.equals("null") || password.equals(null))){ 

		UserDao ud = new UserDaoImpl(); //.getInstance();
		User u = ud.authenticate(username,password);
		
		if(u!=null) {
			if(u.getUserType().equals("admin")) {
				session = request.getSession(true);
				session.setAttribute("userId",username);
				%><jsp:forward page="adminmenupage.jsp"></jsp:forward><%
			}
			else if(u.getUserType().equals("user")){
				session = request.getSession(true);
				session.setAttribute("userId",username);
				CustomerDao c = new CustomerDaoImpl(username);// .getInstance(username);
				List<Customer> list = c.getAllCustomers();
				int customerid = 0;
				String customerName = null;
				for(Customer x:list) {
					customerid=	x.getCustomerId();
					customerName = x.getCustomerName();
				}
				session.setAttribute("customers", list);
				session.setAttribute("customerID",customerid);
				session.setAttribute("customerName",customerName);
				%><jsp:forward page="usermenupage.jsp"></jsp:forward><%
			}
		}
		else { 
			%><jsp:forward page="error2.jsp"></jsp:forward><% 
		}
		
	}
	else {
		%><jsp:forward page="error1.jsp"></jsp:forward><%
	}
}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward><%
}
%>
</body>
</html>