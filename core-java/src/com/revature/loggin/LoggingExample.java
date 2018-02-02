package com.revature.loggin;

import org.apache.log4j.Logger;

public class LoggingExample {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		log.trace("this is a trace log, it is the most fine level of detail");
		log.debug("This is a debug log, it is still pretty detailed but can also be useful to non devs");
		log.info("This is an info log, it is general information about the application");
		log.warn(
				"This is a warn log, it means something abnormal occurred but the application should be able to recover");
		log.error("this is an error log, it means user functionality is probably suffering and needs intervention");
		log.fatal("This is a fatal log, it means the application is going to crash if it hasn't already");
	}
}
