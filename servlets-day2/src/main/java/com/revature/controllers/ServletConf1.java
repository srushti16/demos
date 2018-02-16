package com.revature.controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class ServletConf1 extends DefaultServlet {
	Logger log = Logger.getRootLogger();

	@Override
	public void init(ServletConfig config) throws ServletException {
		log.info("ServletConf1 param has a value of " + config.getInitParameter("param"));
		ServletContext context = config.getServletContext();
		log.info("ServletConf1 conext param has a value of" + context.getInitParameter("param"));
		super.init(config);
	}

}
