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
<jsp:include page="block.jsp"></jsp:include>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="adminnavigation.jsp"></jsp:include>
<br>
<%@page import="com.model.pojo.*;" %>
<%Application a = (Application)request.getAttribute("application"); %>

<h2 align=center>Application</h2>
<br>
<table id="customers">
<tbody>
<tr>
<td>Name :</td>
<td><%=a.getApplicantName() %></td>
</tr>
<tr>
<td>Gender</td>
<td><%=a.getApplicantGender() %></td>
</tr>
<tr>
<td>Date Of Birth</td>
<td><%=a.getApplicantDOB() %></td>
</tr>
<tr>
<td>Email.id</td>
<td><%=a.getEmailId() %></td>
</tr>
<tr>
<td>Mobile No</td>
<td><%=a.getMobileNo() %></td>
</tr>
<tr>
<td>PAN No</td>
<td><%=a.getPanCardNo() %></td>
</tr>
<tr><td colspan="2">Address</td></tr>
<tr>
<td>FlatNo</td>
<td><%=a.getFlatNo() %></td>
</tr>
<tr>
<td>Street</td>
<td><%=a.getStreet() %></td>
</tr>
<tr>
<td>City</td>
<td><%=a.getCity() %></td>
</tr>
<tr>
<td>State</td>
<td><%=a.getState() %></td>
</tr>
<tr>
<td>Pin</td>
<td><%=a.getPin() %></td>
</tr>
</tbody>
</table>
<jsp:include page="footer.jsp"></jsp:include>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}	
%>
</body>
</html>