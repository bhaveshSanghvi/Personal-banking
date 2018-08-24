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
<%System.out.println("report controller 2"); %>

<%
session = request.getSession(true);
System.out.println("report controller 2"); 
String account = request.getParameter("accounts");
System.out.println("report controller 2"); 
System.out.println(account); 
System.out.println("report controller 2"); 
long a = Long.parseLong(account);
TransactionDaoImpl td = new TransactionDaoImpl(a);
List<Transaction> transactions = td.getAllTransactions();
request.setAttribute("transactions",transactions);
System.out.println("report controller 2 bye bybe"); 
%>
<jsp:forward page="finalreport.jsp"></jsp:forward>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>