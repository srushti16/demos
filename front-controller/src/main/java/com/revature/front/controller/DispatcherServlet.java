package com.revature.front.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.revature.controllers.FlashcardController;
import com.revature.controllers.SwordController;

public class DispatcherServlet extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	private SwordController sc = new SwordController();
	private FlashcardController fc = new FlashcardController();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String url = request.getPathInfo();
		log.trace("Get request made with path " + url);
		if (url.startsWith("/static/")) {
			super.doGet(request, response);
			return;
		} else {
			if (url.startsWith("/swords")) {
				sc.doGet(request, response);
			} else if (url.startsWith("/flashcards")) {
				fc.doGet(request, response);
			}
		}
	}
}
