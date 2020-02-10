<%@page import="java.util.List"%>
<%@page import="com.tyss.empspringmvc.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		if (bean.getRole().equals("ADMIN")) {
	%>
	<a href="./register" style="text-decoration: none">Add Employee</a>
	<%
		}
	%>
	<a href="./change-password" style="text-decoration: none">Change Password</a>
	<a href="./logout" style="float: right;text-decoration: none">Logout</a>
	<h1>
		Welcome
		<%=bean.getName()%></h1>

	<form action="./search">
		<input type="text" name="name" placeholder="Enter the name"> <input
			type="submit" value="serach">
	</form>

	<%
		List<EmployeeInfoBean> beans = (List<EmployeeInfoBean>) request.getAttribute("bean");
	%>
	<%if(beans!=null){
		if (beans.isEmpty()) {
	%>

	<h3>Data Not Found for the Name</h3>
	<%
		} else {
	%>
	<table border="2px" style="margin-top: 10%">
		<tr>
			<td>Name</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>Role</td>
		</tr>
		<%for(EmployeeInfoBean infoBean : beans){ %>
		<tr>
			<td><%=infoBean.getName() %></td>
			<td><%=infoBean.getEmail() %></td>
			<td><%=infoBean.getEmail() %></td>
			<td><%=infoBean.getRole() %></td>
		</tr>
		<%} %>
	</table>


	<%
		}
		}
	%>
</body>
</html>