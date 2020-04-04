<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red">Register with Username, Password and Role</h3>
	<form action="./register" method="POST">
		<table>
			<tbody>
				<tr>
					<td>User:</td>
					<td><input type="text" name="username" required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td>Role</td>
					<td>Admin:<input type="radio" name="role" value="ROLE_ADMIN"></td>
				</tr>
				<tr>
					<td></td>
					<td>User:<input type="radio" name="role" value="ROLE_USER"></td>
				</tr>
				<tr>
					<td colspan="2"><input name="submit" type="submit"
						value="Register"></td>
				</tr>
				
				<!-- <input name="_csrf" type="hidden"
					value="53d6557f-bbfc-473d-9c89-bd1415704f17"> -->
			</tbody>
		</table>
	</form>
</body>
</html>