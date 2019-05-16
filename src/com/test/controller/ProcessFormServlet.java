package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessFormServlet extends HttpServlet{


//	
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	  super.service(request, response);
	    response.setContentType("text/html");
	    String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
//		String address = request.getParameter("address");
		System.out.println("dfgdgf");
		PrintWriter out = response.getWriter();
		out.println(uname+"<br>");
		out.println(pwd+"<br>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/html/view.html");		
		dispatcher.forward( request, response );
		
	
		
//		out.println(address+"<br>");
	
}
		
}
