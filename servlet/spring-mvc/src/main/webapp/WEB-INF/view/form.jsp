<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From</title>
</head>
<body>
	<form action="./form" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></input></td>
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
				<td>Mobile No :</td>
				<td><input type="text" name="mobNo"></input></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>