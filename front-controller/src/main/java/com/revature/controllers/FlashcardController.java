package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.revature.beans.Flashcard;
import com.revature.services.FlashcardService;
import com.revature.util.ResponseUtil;

public class FlashcardController implements HttpController {
	private static final String BY_ID_URL = "/flashcards/id/";
	private static final String BY_SET_ID_URL = "/flashcards/set/";
	private FlashcardService fs = new FlashcardService();
	private ResponseUtil respUtil = new ResponseUtil();
	private Logger log = Logger.getRootLogger();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String url = req.getPathInfo();
		log.trace("get request delegated to flashcard controller");
		if (url.startsWith(BY_SET_ID_URL)) {
			int id = Integer.parseInt(url.substring(BY_SET_ID_URL.length()));
			log.trace("request made to find flashcards in the set with id " + id);
			List<Flashcard> cards = fs.findBySetId(id);
			respUtil.writeObjectToResponse(cards, resp);
		} else if (url.startsWith(BY_ID_URL)) {
			// int id = Integer.parseInt(url.substring(BY_ID_URL.length()));
			// Sword sw = ss.findById(id);
			// ru.writeObjectToResponse(sw, resp);
		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

}
