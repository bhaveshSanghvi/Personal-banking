<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
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
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="homenavigation.jsp"></jsp:include>
<h3>PLEASE ENTER ALL THE FIELDS</h3>
<jsp:include page="loginExp.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>
