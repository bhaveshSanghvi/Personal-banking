<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.users.*" %>
<%@page import="com.model.Dao.*" %>
<body>
<%try{ %>
<%
String fromaccount = request.getParameter("fromaccount");
String toaccount= request.getParameter("toaccount");
String str= request.getParameter("amount");
System.out.println("sdhfods");
long from = Long.parseLong(fromaccount);
long to = Long.parseLong(toaccount);
double amount= Double.parseDouble(str);
String fromBank="hitech";
String toBank="hitech";
if(to!=from) {
	AccountDao a = new AccountDaoImpl();
	double balance=a.getBalance(from);
	System.out.println(balance);
	if(balance>amount) {
		SenderInterface si= new AccountDaoImpl();
		si.withdrawAmount(from, amount);
		ReceiverInterface ri = new AccountDaoImpl();
		ri.DepositAmount(to, amount);
		TransactionDao td = new TransactionDaoImpl();
		td.insertTransaction(from, to, fromBank, toBank, amount);
		%><jsp:forward page="thankyou.jsp"></jsp:forward><%	
	}
	else {
		%><jsp:forward page="insufficientbalance.jsp"></jsp:forward><%
	}
}
else{
	%><jsp:forward page="sameaccounterror.jsp"></jsp:forward> <%
}

%>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>

</body>
</html>