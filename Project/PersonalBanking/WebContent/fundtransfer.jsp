<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel=stylesheet href="style.css">
<style>
#fundtransferheader{
margin-bottom:10px;
}
</style>
</head>
<body>
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<h1 id="fundtransferheader">Fund Transfer</h1><br>


<ul id="fundtransfer">
  <li><a href="intrafundtransfercontroller.jsp">Intra Fund Transfer</a></li>
  <li><a href="interfundtransfercontroller.jsp">Inter Fund Transfer</a></li>
  <li><a href="neftfundtransfercontroller.jsp">NEFT Fund Transfer</a></li>
  <li><a href="rtgsfundtransfercontroller.jsp">RTGS Fund Transfer</a></li>
 <!--  <li><a href="impsfundtransfercontroller.jsp">IMPS Fund Transfer</a></li> -->
    <li><a href="newbeneficiary.jsp">Add New Beneficiary</a></li>
</ul>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>