<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%try{ %>
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="java.util.*" %>
<%
session = request.getSession(true);
List<Account> accounts=(List<Account>)session.getAttribute("accounts");%>
<form method="post" action="http://172.17.111.142:8085/PersonalBanking/reportcontroller2.jsp">
<h1 id="fundtransferheader">Report</h1>
<section id="displaycenter1">
<label for="account">Generate report for :</label> 
<select name="accounts" id="account" class="input">
<option value="select" disabled=disabled>select</option>
<%for(Account x:accounts){%>
<option value="<%=x.getAccountNo()%>"><%=x.getAccountNo() %></option>
<%}%>
</select><BR><BR><BR>
<INPUT TYPE="submit" VALUE="Show" id="submit">
</section>
<jsp:include page="footer.jsp"></jsp:include>
<%}
catch(Exception e) {
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</div>
</body>
</html>