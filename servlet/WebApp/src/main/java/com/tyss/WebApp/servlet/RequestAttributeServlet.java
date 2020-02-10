package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-attr")
public class RequestAttributeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("attr1", new Object());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/get-attr");
		dispatcher.forward(req, resp);
		
//		PrintWriter out = resp.getWriter(); //here object was created in this req and 
											//resp is once is over its removes the object
//		out.println("<html><body><h1>");
//		out.println("Req Attribute Addede");
//		out.println("</h1></body></html>");
	}

}
