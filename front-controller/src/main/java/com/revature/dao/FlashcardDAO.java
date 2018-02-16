package com.revature.dao;

import java.util.List;

import com.revature.beans.Flashcard;

public interface FlashcardDAO {
	// C
	int save(Flashcard fc);

	void save(Flashcard fc, int setId);

	// U
	void update(Flashcard fc);

	// D
	void delete(Flashcard fc);

	// R
	Flashcard get(int id);

	List<Flashcard> findBySetId(int id);

}
