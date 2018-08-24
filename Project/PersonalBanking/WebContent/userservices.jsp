<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<h2>Services</h2><br>
	<ul>
		<li><a href="usercreatenewaccountcontroller.jsp">Apply for New Account</a></li>
		<li><a href="userdeleteaccount.jsp">Apply for Account Deletion</a></li>
		<li><a href="applyfordebitcard.jsp">Apply for Debit Card</li>
	</ul>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>