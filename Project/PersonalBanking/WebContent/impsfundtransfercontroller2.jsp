<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="com.model.users.*" %>
<%
String fromaccount = request.getParameter("fromaccount");
String toaccount= request.getParameter("toaccount");
String str= request.getParameter("amount");

long from = Long.parseLong(fromaccount);
long to = Long.parseLong(toaccount);
double amount= Double.parseDouble(str);

AccountDao ad = new AccountDaoImpl();
if(ad.checkAccount(to)) {
	SenderInterface si= new AccountDaoImpl();
	si.withdrawAmount(from, amount);
	ReceiverInterface ri = new AccountDaoImpl();
	ri.DepositAmount(to, amount);
}else {
	%><jsp:forward page="accountnotfound.jsp"></jsp:forward> <%
}


%>
<jsp:forward page="thankyou.jsp"></jsp:forward>

</body>
</html>