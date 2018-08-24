<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.users.*" %>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<body>
<%try{ %>
<%
	session = request.getSession(true);
String fromaccount = request.getParameter("fromaccount");
String toaccount= request.getParameter("toaccount");
String str= request.getParameter("amount");
//String toBank= request.getParameter("toBank");
long from = Long.parseLong(fromaccount);
long to = Long.parseLong(toaccount);
double amount= Double.parseDouble(str);
String fromBank="hitech";

if(amount<=200000) {
	AccountDao a = new AccountDaoImpl();
	double balance=a.getBalance(from);
	System.out.println(balance);
	if(balance>amount) {
		SenderInterface si= new AccountDaoImpl();
		si.withdrawAmount(from, amount);
		
		//List<Beneficiary> beneficairy = (List<Beneficiary>) session.getAttribute("beneficiaries");
		BeneficiaryDao bd = new BeneficiaryDaoImpl();
		String toBank = bd.getToBank(to);
		TransactionDao td = new TransactionDaoImpl();
		td.insertTransaction(from, to, fromBank, toBank, amount); 
		%><jsp:forward page="thankyou.jsp"></jsp:forward><%
	}
	else {
		%><jsp:forward page="insufficientbalance.jsp"></jsp:forward><%
	}
} else {
	%><jsp:forward page="neftamountlimit.jsp"></jsp:forward><%
}

%>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>