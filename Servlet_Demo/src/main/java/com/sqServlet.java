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

@WebServlet("/sq")
public class sqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
//		PrintWriter ou = res.getWriter();
//		int k  = (int) req.getAttribute("k");
//		k = k*k;
//		ou.println("Answer is "+k);
		
		//redirect
//		int k = Integer.parseInt(req.getParameter("k"));
		//usingsession
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		//cookies
		int k =0;
		Cookie cookie[] = req.getCookies();
		
		for (Cookie c : cookie) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k*k;
		PrintWriter ou = res.getWriter();
		ou.println("Answer is "+k);
	}

}
