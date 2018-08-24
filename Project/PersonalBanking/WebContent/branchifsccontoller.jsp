<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%try{ %>
<%@page import="com.model.Dao.*" %>
<%@page import="com.model.DaoImpl.*" %>
<%@page import="com.model.pojo.*" %>
<%@page import="com.model.users.*" %>
<%@page import="java.util.*" %>

<%
BranchDaoImpl bd = new BranchDaoImpl();
System.out.println("making list");
List<Branch> branches = bd.getAllBranches();
System.out.println("list made");
request.setAttribute("branches",branches);
for(Branch x:branches){
	System.out.println(x.getIfscCode());
}

%>
<%}
catch(Exception e){
	%><jsp:forward page="siteerror.jsp"></jsp:forward> <%
}
%>
<%-- <jsp:forward page="newbeneficiary.jsp"></jsp:forward> --%>
</body>
</html>