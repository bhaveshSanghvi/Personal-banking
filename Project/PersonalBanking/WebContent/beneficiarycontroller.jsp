<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%try { %>
<jsp:include page="block.jsp"></jsp:include>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
session = request.getSession(true);
Integer customerID = (Integer)session.getAttribute("customerID");
System.out.println(customerID);
String str1 = request.getParameter("BENEFACNO");
long bAccountNo = Long.parseLong(str1);
String bName = request.getParameter("BENEFNAME");
String bBankName = request.getParameter("BENEFbname");
String bBankIfsc = request.getParameter("BANKIFSC");
BeneficiaryDao bd = new BeneficiaryDaoImpl();
 BranchDao brd = new BranchDaoImpl();
boolean ispresent = brd.searchBranchIfsc(bBankIfsc);
if(ispresent) {
	bd.insertBeneficiary(customerID,bAccountNo, bName, bBankName, bBankIfsc);
} else {
	%><jsp:forward page="branchnotfound.jsp"></jsp:forward> <%
} 
%>
<jsp:forward page="beneficiaryadded.jsp"></jsp:forward>
<%}
catch(Exception e){
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>