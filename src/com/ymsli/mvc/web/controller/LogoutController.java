package com.ymsli.mvc.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession httpSession=request.getSession(false);
		
		if(httpSession!=null) {
			httpSession.invalidate();
		}
		response.sendRedirect("login.jsp?status=logout successfully");
	}
}
