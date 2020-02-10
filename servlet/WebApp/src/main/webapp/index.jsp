<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@include file="/index.html" %><!--file name,JSP,HTML not a Servlet   -->
<%-- <%@page extends="java.lang.Object" %><!-- extend only servlet class  --> --%>
<%@ page errorPage="error.jsp"  %> <!-- fallback UI  -->
<%@page isThreadSafe="false" %><!-- check in metadata file in s/m  -->
 <%@ page session="false" %><!--it avoids the session creation object implicit check in metadata file in s/m   -->

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 Date date = new Date();

%>

<h1 style="color:lime"><%=date%></h1>

<h1 style="color:blue"><%=i/0%></h1>

<h1 style="color:pink"><%=name%></h1>

<% printName(); %>

</body>
</html>
<%! private int i = 10 ;
    private String name = "prince";
    
    public void printName(){
    	System.out.println(name);
    }
  %>
  
  
  
  <%! 
  public void jspInit(){
	  System.out.println("Init Method");
  }
  %>
  
  <%! 
  public void jspDestroy(){
	  System.out.println("Init Method");
  }
  %>
  
  
  
  
  
  
  
  
  
  
  
  
  
  