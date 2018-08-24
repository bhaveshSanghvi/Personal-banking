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
color:red;
}
td {
padding:10px;
}
#submit {
float:left;
}
</style>
</head>
<body>
<div id="wrapper">
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="homenavigation.jsp"></jsp:include>
	<form action="http://172.17.111.142:8085/PersonalBanking/applicationcontroller.jsp" method="post">
<div id="displaycenter">
<table width="500" border="0"> <!-- cellspacing="30" cellpadding="0" -->
<tr>
<td><b>Enter Name<span>*</span>		</b></td>
<td><input type="text" Name="name" autocomplete="off" class="input" pattern="[A-Za-z]*" required title="please enter your name using Alphabets"></td>
</tr>
<tr>
<td><b>Enter Gender<span>*</span></b> </td>
<td><label for="male">Male </label><input type="radio" id="male" name="gender" value="male" required><label for="female"> Female </label><input type="radio" id="female" name="gender" value="female" required></td>
</tr>
<br>
<tr><td></td></tr>
<tr>
<td><b>Enter Address<span>*</span></b></td>
</tr>
<tr>
<td>Flat_No			</td>
<td> <input type="text" Name="flat" class="input" autocomplete="off"  pattern="\d{1,4}" required title="please enter 4 digit Flat Number"></td>
</tr>
<tr>
<td>Street	</td> 
<td><input type="text" Name="street" class="input" autocomplete="off"  required title="Enter your street name"></td>
</tr>
<tr>
<td>City	</td> 
<td><input type="text" Name="city" class="input"  autocomplete="off"  pattern="[A-Za-z]*" required title="Please enter your City using Alphabets"></td> 
</tr>
<tr>
<td>State		</td> 
<td> <input type="text" Name="state" class="input" autocomplete="off"  pattern="[A-Za-z]*" required title="Please enter your State using Alphabets"></td>
</tr>
<tr>
<td>Pin			</td>
 <td> <input type="text" Name="pin" class="input" autocomplete="off"  pattern="\d{6}" required title="Please enter your 6 digit PIN CODE"></td> 
 </tr>
<tr>
<td><b>Enter Age<span>*</span>		</b></td>
 <td> <input type="text" Name="age" class="input" autocomplete="off"  pattern="\d{1,2}" required title="Please enter your age"></td> 
 </tr>
<tr>
<td><b>Enter Email<span>*</span>			</b></td>
 <td> <input type="text" Name="email" class="input" autocomplete="off"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required title="Please Enter valid E-mail ID">	</td>
  </tr>
<tr><td><b>Enter Mobile No<span>*</span>		</b></td> <td> <input type="text" Name="mob" autocomplete="off"  class="input" required pattern="\d{10}" title="Please enter All 10 Digits of mobile number" maxlength="10"></td> </tr>
<tr><td><b>Enter PAN No<span>*</span>			</b></td> <td> <input type="text" Name="pan"  autocomplete="off"  class="input" required pattern="\d{10}" title="Please enter All 10 characters of PAN card" maxlength="10"></td></tr> 
<tr><td><b>Enter AADHAR No<span>*</span> 		</b></td> <td> <input type="text" Name="aadhar" autocomplete="off"  class="input" required pattern="\d{10}" title="Please enter All 12 characters of Aadhar" maxlength="10"></td> </tr>

</table>
<% System.out.println("going to controller"); %>
<input type="submit" Name="submit" value="submit" id="submit">
</div>
<% System.out.println("forwarding"); %>
	<jsp:include page="footer.jsp"></jsp:include>

</div>
</body>
</html>