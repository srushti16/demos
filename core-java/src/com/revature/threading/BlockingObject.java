package com.revature.threading;

public class BlockingObject {

	/**
	 * Whatever thread calls this will wait 5 seconds blocking all other thread for
	 * that time
	 * 
	 */
	public synchronized void block() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
