package com;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int ans = i+j;
		
//		PrintWriter ou = res.getWriter();
		
//		ou.println("ans is "+ans);
		
		//requestdispatcher
//		req.setAttribute("k", ans);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		//redirect
//		res.sendRedirect("sq?k="+ans);
		
		//Session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", ans);
		
//		cookies
		Cookie cookie = new Cookie("k",ans+"");
		res.addCookie(cookie);
		//redirect
		res.sendRedirect("sq");
		
	}
}