<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h3{
background:white;	
text-align:center;
margin:auto;
margin-top:40px;
font:22px arial;
font-weight:bold;
}
</style>
</head>
<body>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<h3>Insufficient balance</h3>
<h3>Please Deposit Sufficient Amount into your Account</h3> 
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>