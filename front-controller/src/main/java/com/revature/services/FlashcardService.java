package com.revature.services;

import java.util.List;

import com.revature.beans.Flashcard;
import com.revature.dao.FlashcardDAO;
import com.revature.dao.FlashcardDAOJDBC;

public class FlashcardService {
	private FlashcardDAO cardDao = new FlashcardDAOJDBC();

	public List<Flashcard> findBySetId(int id) {
		return cardDao.findBySetId(id);
	}

}
