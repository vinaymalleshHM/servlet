package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session!= null) {
			PrintWriter out = resp.getWriter();
			out.println("<html><body>"+"<h1>This is Home Page</h1>"+"<a href='./logout'>Logout</a>"+"</body></html>");
		}else {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.forward(req, resp);
		}

	}

}
