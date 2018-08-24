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
<%@page import="java.util.*"%>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%
String submit = request.getParameter("submit");
String aplicationId = request.getParameter("radio");
int applicationId = Integer.parseInt(aplicationId); 
if(submit.equalsIgnoreCase("view")) {
	ApplicationDao a =  new ApplicationDaoImpl();
	Application app = a.getApplication(applicationId);
	request.setAttribute("application",app);
	%><jsp:forward page="viewapplication.jsp"></jsp:forward> <%
}
if(submit.equalsIgnoreCase("accept")){
	/*
	if accepted then create a new user and assign userid and password*/
	System.out.println("inside accept");
	UserDao ud = new UserDaoImpl();
	System.out.println("inside accept");
	User u = ud.createUser();
	System.out.println("inside accept");
	/* then create a new customer and copy information from application to customer and assign a customer id to that user */
	//CustomerDao c = new CustomerDaoImpl();
	System.out.println("inside accept");
	//c.createCustomer(applicationId);
	
	System.out.println("inside accept");
	
	/* after assigning a customer id create an account and assign a new account no to that user	*/
}
if(submit.equalsIgnoreCase("reject")) {
	
}
%>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}%>
</body>
</html>