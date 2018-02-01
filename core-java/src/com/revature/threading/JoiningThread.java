package com.revature.threading;

public class JoiningThread implements Runnable {

	private Thread toJoin;

	public JoiningThread(Thread toJoin) {
		super();
		this.toJoin = toJoin;
	}

	@Override
	public void run() {
		System.out.println("joining thread about to wait for the other thread to die and my name is "
				+ Thread.currentThread().getName());
		try {
			toJoin.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("joining thread has resumed and is now going to be done");

	}

}
