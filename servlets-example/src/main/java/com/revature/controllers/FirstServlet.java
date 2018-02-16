package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class FirstServlet extends DefaultServlet {
	private Logger log = Logger.getRootLogger();

	@Override
	public void init() throws ServletException {
		log.info("servlet initialzed");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.trace("method = " + req.getMethod());
		log.info("request serviced");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.info("get request made");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.info("post request made");
		
		// get reader for the request body
		BufferedReader reader = request.getReader();
		reader.lines().forEach((line) -> { // read each line and print it
			log.trace(line);
		});
	}

	@Override
	public void destroy() {
		log.info("servlet destroyed");
	}
}
