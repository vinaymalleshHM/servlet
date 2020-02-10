package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create-cookie")
public class CreatecookieServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
//		Cookie cook = new Cookie("name", "Noorafetihi");//don't give space 
//		resp.addCookie(cook);
		Cookie cookie1 = new Cookie("Heroine", "Noorafetihi");//don't give space
		cookie1.setMaxAge(60*60*24*7);
//		cookie1.setMaxAge(100);//to delete
//		cookie1.setMaxAge(0);
//		cookie1.setMaxAge(-1); // to store co0kie in number format
		resp.addCookie(cookie1);
		Cookie cookie2 = new Cookie("Hero", "AlluArjun");//don't give space 
		resp.addCookie(cookie2);
		out.println("<html>"+"<body>"+"<h1>Cookie Created</h1>"+"</body>"+"</html>");
	}

}
