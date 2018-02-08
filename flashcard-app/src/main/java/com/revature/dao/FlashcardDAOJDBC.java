package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.beans.Flashcard;

public class FlashcardDAOJDBC implements FlashcardDAO {
	private Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		Flashcard fc = new Flashcard(0, "What is jdbc", "Java Database Connectivity");
		FlashcardDAO flashDao = new FlashcardDAOJDBC();
		flashDao.save(fc);
	
	}

	@Override
	public int save(Flashcard fc) {
		log.trace("method called to insert new flashcard");
		log.trace("Attempting to get connection to db");
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "flashcard",
				"p4ssw0rd")) {
			log.trace("connection established with db, creating prepared statement");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO flashcard (question, answer) VALUES (?,?)");
			ps.setString(1, fc.getQuestion());
			ps.setString(2, fc.getAnswer());
			
			int rowsInserted = ps.executeUpdate();
			log.debug("query inserted " + rowsInserted + " rows into the db");
			

		} catch (SQLException e) {
			log.warn("failed to insert new flashcard");
		}

		return 0;
	}

	@Override
	public void update(Flashcard fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Flashcard fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public Flashcard get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flashcard> findBySetId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
