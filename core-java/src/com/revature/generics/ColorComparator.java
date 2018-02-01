package com.revature.generics;

import com.revature.beans.Car;

public class ColorComparator implements Comparator<Car> {

	@Override
	public int compare(Car one, Car two) {
		return one.getColor().compareTo(two.getColor());
	}

}
