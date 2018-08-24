<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="login_wrapper">
		<div id="content">
			<form action="http://172.17.111.142:8085/PersonalBanking/loginController.jsp" method="post">
				<label for="username" id="unl">Username</label>
				<input type="text" id="username" name="username" required><br><br>
				<label for="password" id="pwdl">Password</label>
				<input type="password" id="password" name="password" required><br><br>
				<a href=""><input type="submit" id="login" value="Login" name="login"></a>
				<p></p>
			</form>
		</div>	
	</div>
</body>
</html>