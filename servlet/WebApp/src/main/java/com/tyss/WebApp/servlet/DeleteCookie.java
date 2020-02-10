package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete-cookie")
public class DeleteCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("Heroine")) {
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1>Cookie Deleted</h1>");
		out.println("</body></html>");
	}

}
