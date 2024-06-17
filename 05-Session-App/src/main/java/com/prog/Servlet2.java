package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		PrintWriter out=resp.getWriter();
		
		Cookie[]ck=req.getCookies();
		
		
		
		resp.setContentType("text/html");
		out.print("Welcome to Servlet2 name= "+ck[0].getValue()+"<h1>");
		
		
	}
	

}
