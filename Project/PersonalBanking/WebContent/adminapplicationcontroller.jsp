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
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>

<%
ApplicationDao a = new ApplicationDaoImpl();
List<Application> applications = a.getAllApplications();
request.setAttribute("a",applications);
System.out.println("before for");
for(Application x:applications) {
	System.out.println(x);
}
System.out.println("after for");
session.setAttribute("applications",applications);
%>
<jsp:forward page="applicationrequest.jsp"></jsp:forward>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}%>
</body>
</html>