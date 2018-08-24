<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="table.css">
</head>
<body>
<%try{ %>
<%@page import="java.util.*" %>
<%@page import="com.model.pojo.*" %>
<%
List<Application> a =(List<Application>) request.getAttribute("a");
%>
<jsp:include page="checkSession.jsp"></jsp:include>
<jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="adminnavigation.jsp"></jsp:include>
<br>
<form action="http://172.17.111.142:8085/PersonalBanking/adminapplicationcontroller2.jsp" method="post">
<table  id="customers">
  <tr>
  	<th>Select</th>
    <th>Application_id</th>
    <th>Applicant Name</th>
    <th> View </th>
   <!--  <th> Accept </th>
    <th> Reject </th> -->
  </tr>
  <%for(Application x: a) {%>
  <tr>
  	<td><input type="radio" value="<%=x.getApplicantID() %>" name="radio"></td>
    <td><%=x.getApplicantID() %> </td>
    <td><%=x.getApplicantName() %></td>
    
    <td><input type="submit" value="View" name="submit" id="button"></td>
   <!--  <td><input type="submit" value="Accept" name="submit" id="button"></td>
    <td><input type="submit" value="Reject" name="submit" id="button"></td> -->
  </tr>
  <%} %>
  
</table>
</form>
<br>
<jsp:include page="footer.jsp"></jsp:include>
</div>
<%}
catch(Exception e){
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
</body>
</html>