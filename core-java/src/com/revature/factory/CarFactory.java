package com.revature.factory;

import org.apache.log4j.Logger;

import com.revature.beans.Car;
import com.revature.exceptions.ModelNotFoundException;

public class CarFactory {
	private Logger log = Logger.getRootLogger();

	private static CarFactory cf = new CarFactory();
	private int nextVin = 1;

	private CarFactory() {
		super();
	}

	public static CarFactory getCarFactory() {
		return cf;
	}

	public Car createCar(int modelNumber) throws ModelNotFoundException {
		log.trace("Attempting to create a car with model number" + modelNumber);
		switch (modelNumber) {
		case 1:
			// ++nextVin would increment then use as opposed to use then increment
			return new Car(nextVin++, 2, "Toyota", "Corolla", "pink");
		case 2:
			return new Car(nextVin++, 7, "Horse", "Mustang", "red");
		}
		throw new ModelNotFoundException();
	}
}
