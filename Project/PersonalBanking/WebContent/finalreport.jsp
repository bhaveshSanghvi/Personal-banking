<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="table.css">
<style type="text/css">
/* h3{
background:white;	
text-align:center;
margin:auto;
margin-top:20px;
font:22px arial;
font-weight:bold;
}
 */
 
h3{
background:white;
font:30px arial;
color:#003300;
text-align:center;
margin:auto;
margin-top:10px;
margin-bottom:20px;
font-weight:bold;
letter-spacing: 1px;
}
</style>
</head>
<body>
<%try{ %>
<jsp:include page="block.jsp"></jsp:include>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
List<Transaction> t = (List<Transaction>) request.getAttribute("transactions");
%>
<div="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<h3>Transaction Report</h3>
<br>
<table id="customers">
	<tr>
		<th>Transaction ID</th>
		<th>From</th>
		<th>To</th>
		<th>From Bank</th>
		<th>To Bank</th>
		<th>Amount</th>
		<th>Time</th>
	</tr>
	<%for(Transaction x:t) {%>
	<tr>
	<td><%=x.getTransactionId() %></td>
	<td><%=x.getFromAccountNo() %></td>
	<td><%=x.getToAccountNo() %></td>
	<td><%=x.getFromBank() %></td>
	<td><%=x.getToBank() %></td>
	<td><%=x.getAmount() %></td>
	<td><%=x.getDatetime() %></td>
	</tr>
	<%} %>
	</table> 
	<jsp:include page="footer.jsp"></jsp:include>
	</div>
<%}
catch(Exception e){
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>