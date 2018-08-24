<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">

</style>
</head>
<body>
<%try{ %>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
session = request.getSession(true);
List<Account> accounts=(List<Account>)session.getAttribute("accounts");%>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<form method="post" action="http://172.17.111.142:8085/PersonalBanking/intrafundtransfercontroller2.jsp">
<h1 id="fundtransferheader">Intra Fund Transfer</h1>
<section id="displaycenter1">
<label for="fromaccount">From Account</label> 
<select name="fromaccount" id="fromaccount" class="input">
<option value="select" disabled="disabled">select</option>
<%for(Account x:accounts){%>
<option value="<%=x.getAccountNo()%>"><%=x.getAccountNo() %></option>
<%}%>
</select><BR><BR><BR>
<label for="toaccount">To account</label> 	
<select name="toaccount" id="toaccount" class="input">
<option value="select" disabled="disabled">select</option>
<%for(Account x:accounts){%>
<option value="<%=x.getAccountNo()%>"><%=x.getAccountNo() %></option>
<%}%>
</select><BR><BR><BR>
<label for="amount">Enter Amount(INR) </label>
<INPUT TYPE="number"  name="amount" id="amount" min=1 autocomplete="off" class="input" required><BR><BR><BR>
<INPUT TYPE="submit" VALUE="transfer" id="submit">
</section>
<%}
catch(Exception e) {
	%><jsp:forward page="iteerror.jsp"></jsp:forward> <%
}
%>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>