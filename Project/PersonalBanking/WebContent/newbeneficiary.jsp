<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
/* function validateForm() {
	var re = /^[A-z]+$/;

    // validation fails if the input doesn't match our regular expression
    /* if(!re.test(document.getElementById("BENEFNAME"))) {
      alert("Name can contain only Alphabets");
      form.inputfield.focus();
      return false;
    } 
    if(!re.test(document.getElementById("BENEFbname"))) {
        alert("Bank Name can contain only Alphabets");
        form.inputfield.focus();
        return false;
      }
    return true;
} */
</script>
</head>
<body>
<%@page import="java.util.*" %>
<%@page import="com.model.pojo.*" %>
<%-- <%List<Branch> br = (List<Branch>) request.getAttribute("branches"); %> --%>
<div id="wrapper">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="usernavigation.jsp"></jsp:include>
<div id="displaycenter">
<Form action="http://172.17.111.142:8085/PersonalBanking/beneficiarycontroller.jsp" method="post">
	<h1 align=center> ADD BENEFICIARY </h1><br>
	
	BENEFICIARY NAME : <INPUT TYPE="text" class="input" NAME="BENEFNAME" id="BENEFNAME" pattern="[A-Za-z]*" required title="Enter only Alphabets"><BR><BR><BR>
	 BENEFICIARY ACCOUNT NUMBER : <INPUT TYPE="text" class="input"  id="BENEFACNO" NAME="BENEFACNO" maxlength="12" pattern = "\d{12}" autocomplete=off required title="Enter 12 digit Account Number"><BR><BR><BR> 
	<!-- BENEFICIARY ACCOUNT NUMBER : <INPUT TYPE="number" class="input"  id="BENEFACNO" NAME="BENEFACNO"  min=100000000000 max=999999999999 autocomplete=off required><BR><BR><BR> -->
	BENEFICIARY BANK NAME  :  <INPUT TYPE="text" class="input"  id="BENEFbname" pattern="[A-Za-z]*" NAME="BENEFbname" autocomplete=off required><BR><BR><BR>
	BANK IFSC CODE		:	<INPUT TYPE="text" class="input" id="BANKIFSC" maxlength="4" NAME="BANKIFSC" autocomplete=off pattern="\d{4}" required><BR><BR><BR>
	<INPUT TYPE="submit" id="submit" onclick="return validateForm()" VALUE="ADD"/><BR><BR>
</Form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>