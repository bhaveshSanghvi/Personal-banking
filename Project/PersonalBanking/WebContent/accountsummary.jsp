<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style>
span{
color:red;
font-weight:bold;
}

#displaycenter{
font-weight:bold;
}
</style>
</head>
<body>
<%try { %>
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="usernavigation.jsp"></jsp:include>
	<%@page import="java.util.*" %>
	<%@page import="com.model.pojo.*" %>
	<%@page import="java.text.*" %>
	<div id="displaycenter">
	<%
	session = request.getSession(true);
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date today = Calendar.getInstance().getTime();
	String datetime = df.format(today);	
	List<Account> accounts = (List<Account>)session.getAttribute("accounts");%>
	<h1 id="fundtransferheader">Account Summary</h1>
	<%	for(Account x:  accounts) { %>
		Account Number: <%=x.getAccountNo()%><br>
		Account Balance: <span><%=x.getBalance()%> INR</span> as on <%=datetime %><br>
		Account type: <%=x.getType() %><br>
		IFSC-Code: <%=x.getBankIfsc()%>
		<br><br>		<br><br>
	<%}%>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}%>
</body>
</html>