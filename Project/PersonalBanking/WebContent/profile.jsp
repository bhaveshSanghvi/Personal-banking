<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style>
span {
font-weight:bold;
text-decoration:underline;
}

#displaycenter {
font-weight:bold;
}
</style>
</head>
<body>
<%try{ %><jsp:include page="block.jsp"></jsp:include>
<div id="wrapper">
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="usernavigation.jsp"></jsp:include>
	<%@page import="java.util.*" %>
	<%@page import="com.model.pojo.*" %>
	<%
	session = request.getSession(true);
	List<Customer> customers = (List<Customer>) session.getAttribute("customers");
	%><div id="displaycenter"><%
	for(Customer c:customers) {%>
			<br><br>
			Name: <%=c.getCustomerName() %><br>
			DOB: <%=c.getDateOfBirth() %><br>
			Gender: <%=c.getGender() %><br>
			EmailID: <%=c.getEmailId() %><br>
			Aadhar ID: <%=c.getAadharCardNo() %><br>
			PAN ID: <%=c.getPanCardNo() %><br>
			Mobile No: <%=c.getMobileNo() %><br><br>
	<%}
	List<Address> addresses = (List<Address>)session.getAttribute("addresses");
	int i=1;
	%>
	<%	for(Address x:  addresses) {%>
		<span>Address <%=i %><br></span>
		Flat No: <%=x.getFlatNo()%><br>
		Street: <%=x.getStreet()%><br>
		City: <%=x.getCity()%><br>
		State: <%=x.getState()%><br>
		Pin :  <%=x.getPin() %>
		<br><br>
	<%i++;}%>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}
%>
</body>
</html>