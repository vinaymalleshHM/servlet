package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/first");
//		dispatcher.include(req, resp);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>"+"<body>"+"<h1>This is IncludeServlet</h1>"+"</body>"+"</html>");
		
		dispatcher.include(req, resp); //it will come at last
	}

}
