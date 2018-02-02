package com.revature.factory;

import org.apache.log4j.Logger;

import com.revature.exceptions.ModelNotFoundException;

public class FactoryLauncher {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		CarFactory cf = CarFactory.getCarFactory();
		try {
			log.info("acquired car " + cf.createCar(1));
			log.info("acquired car " + cf.createCar(1));
			log.info("acquired car " + cf.createCar(2));
			log.info("acquired car " + cf.createCar(4));
		} catch (ModelNotFoundException e) {
			log.warn("The model of car requested did not exist in the car factory");
		}

	}
}
