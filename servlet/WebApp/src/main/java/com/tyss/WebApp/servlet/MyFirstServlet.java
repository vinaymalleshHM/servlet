package com.tyss.WebApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		resp.setContentType("text/html");
//		System.out.println("hjhhjjjh"+resp);
//		System.out.println("hjhhjjjh"+resp.getWriter());
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
//		int a =1/0; // exception will occurs bcz before giving the response servlet throws exception was occr  
		out.println(date);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
//		int a =1/0; //exception will not  occurs bcz after giving the response exception was occr
//		throw new RuntimeException("Hi Exception");
		
	}
}
