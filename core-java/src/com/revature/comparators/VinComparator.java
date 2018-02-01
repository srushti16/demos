package com.revature.comparators;

import java.util.Comparator;

import com.revature.beans.Car;

public class VinComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getVin() - o2.getVin();
	}

}
