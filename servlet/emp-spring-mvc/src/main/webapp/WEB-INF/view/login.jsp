<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="./login" method="post">
		<table style="padding-left: 40%; padding-top: 20%">
			<tr>
				<td>${msg }</td>
			</tr>
			<tr>
				<td>email :</td>
				<td><input type="email" name="email"></input></td>
			</tr>
			<tr>
				<td>password :</td>
				<td><input type="password" name="password"></input></td>
			</tr>
			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>

</body>
</html>