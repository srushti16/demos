package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.revature.util.ConnectionUtil;

public class SetDAOJDBC implements SetDAO {
	private Logger log = Logger.getRootLogger();
	private ConnectionUtil connUtil = ConnectionUtil.getConnectionUtil();

	public static void main(String[] args) {
		SetDAO sd = new SetDAOJDBC();
		sd.delete(1);
	}

	@Override
	public void delete(int setId) {
		log.trace("method called to delete set with id" + setId);
		try (Connection conn = connUtil.getConnection()) {
			CallableStatement cs = conn.prepareCall("call delete_set(?)");
			cs.setInt(1, setId);
			cs.execute();
			log.debug("deleted set with id" + setId);
		} catch (SQLException e) {
			log.debug("failed to delete set with id" + setId);
			e.printStackTrace();
		}
	}

}
