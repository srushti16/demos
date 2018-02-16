package com.revature.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Sword;

public class SwordController extends DefaultServlet {
	private List<Sword> swords;

	@Override
	public void init() throws ServletException {
		super.init();
		swords = new Vector<>();
		swords.add(new Sword(1, "Excalibur", 9, 30d, 1000));
		swords.add(new Sword(2, "Plain Object", 1, 1, 0));
		swords.add(new Sword(3, "chainsaw", 6, 12, 9001));
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// convert object to json
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(swords);

		// actually write the json to the body of the request
		response.setContentType("application/json");
		response.getWriter().println(json);
	}

}
