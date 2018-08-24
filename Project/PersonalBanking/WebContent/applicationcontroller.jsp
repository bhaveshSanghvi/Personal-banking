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
<%@page import="com.model.pojo.*" %>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<% 
String name = request.getParameter("name");
System.out.println(name);
String age = request.getParameter("age");
System.out.println(age);
String gender = request.getParameter("gender");
System.out.println(gender);
String emailId = request.getParameter("email");
System.out.println(emailId);
String aadharstr = request.getParameter("aadhar");
long aadhar = Long.parseLong(aadharstr);
System.out.println(aadhar);
String panstr = request.getParameter("pan");
long pan = Long.parseLong(panstr);
System.out.println(pan);
String mobstr = request.getParameter("mob");
long mob = Long.parseLong(mobstr);
System.out.println(mob);
String flatstr = request.getParameter("flat");
long flat = Long.parseLong(flatstr);
System.out.println(flat);
String street = request.getParameter("street");
System.out.println(street);
String city = request.getParameter("city");
System.out.println(city);
String state = request.getParameter("state");
System.out.println(state);
String pinn= request.getParameter("pin");
Integer pin = Integer.parseInt(pinn);
System.out.println(pin);
%>

<%
ApplicationDao ad = new ApplicationDaoImpl();

ad.insertApplication(name,age,gender, emailId,aadhar,pan, mob,flat,street, city, state,pin);
%>
<jsp:forward page="applicationsubmitted.jsp"></jsp:forward>
<%}
catch(Exception e){
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>