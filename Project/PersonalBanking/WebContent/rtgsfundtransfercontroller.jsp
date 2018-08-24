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

AccountDao a = new AccountDaoImpl(customerID);
List<Account> accounts = a.getAllAccounts();
session.setAttribute("accounts", accounts);
for(Account x: accounts) {
	System.out.println("Accounts: "+x);
}

BeneficiaryDao b = new BeneficiaryDaoImpl(customerID);
List<Beneficiary> beneficiaries = b.getAllBeneficiaries();
session.setAttribute("beneficiaries",beneficiaries);
for(Beneficiary x: beneficiaries) {
	System.out.println("Beneficiary: "+x);
}
%>
<jsp:forward page="rtgs.jsp"></jsp:forward>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>