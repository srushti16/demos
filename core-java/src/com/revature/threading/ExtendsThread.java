package com.revature.threading;

public class ExtendsThread extends Thread {

	private int id;

	public ExtendsThread(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("I am runnable and my id is: " + id);
		}
	}

}
