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

System.out.println("report controller 1");
session = request.getSession(true);
//int customerID= 25001;
Integer customerID = (Integer)session.getAttribute("customerID");
System.out.println(customerID);
AccountDao a = new AccountDaoImpl(customerID);//getInstance(customerID);
List<Account> accounts = a.getAllAccounts();
for(Account x: accounts) {
	System.out.println("Accounts: "+x);
}
session.setAttribute("accounts", accounts);
System.out.println("going to report.jsp");


%>
<jsp:forward page="report.jsp"></jsp:forward>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>