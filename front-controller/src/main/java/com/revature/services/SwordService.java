package com.revature.services;

import java.util.List;
import java.util.Vector;

import com.revature.beans.Sword;

public class SwordService {
	private List<Sword> swords;

	{
		swords = new Vector<>();
		swords.add(new Sword(1, "Excalibur", 9, 30d, 1000));
		swords.add(new Sword(2, "Plain Object", 1, 1, 0));
		swords.add(new Sword(3, "chainsaw", 6, 12, 9001));
	}

	public List<Sword> findAll() {
		return swords;
	}

	public Sword findById(int id) {
		for (Sword sw : swords) {
			if (sw.getId() == id) {
				return sw;
			}
		}
		return null;
	}
}
