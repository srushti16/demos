package com.revature.mutiplier;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {

	/**
	 * Multiplies all elements in a list returning the newly created list without
	 * affecting the original list passed int
	 * 
	 * @param i
	 *            int to multiply all elements by
	 * @return a newly created list of integers that contains the original elements
	 *         multiplied by the value passed in
	 */
	public List<Integer> multiplyAllElementsBy(int i, List<Integer> ints) {
		List<Integer> newList = new ArrayList<Integer>(ints);
		for (int j = 0; j < newList.size(); j++) {
			newList.set(j, i * newList.get(j));
		}
		return newList;
	}

	public void throwException() throws Exception {
		throw new Exception();
	}
}
