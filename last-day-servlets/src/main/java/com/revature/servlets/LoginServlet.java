package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.revature.beans.User;
import com.revature.services.UserService;

public class LoginServlet extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	private UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/static/login.html").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.trace("post request made to login servlet");
		log.trace("username = " + request.getParameter("username"));
		log.trace("password = " + request.getParameter("password"));
		User u = userService.login(request.getParameter("username"), request.getParameter("password"));
		if(u != null) {
			HttpSession sess = request.getSession();
			sess.setAttribute("user", u);
			response.sendRedirect(request.getContextPath() + "/home");
		} else {
			request.getRequestDispatcher("/static/login.html").forward(request, response);
		}
		
		
	}
}
