package com.revature.threading;

import java.util.concurrent.BlockingQueue;

import com.revature.objects.CoolObject;

public class ProducerThread implements Runnable {

	private BlockingQueue<CoolObject> coolObjectsQueue;

	public ProducerThread(BlockingQueue<CoolObject> coolObjectsQueue) {
		super();
		this.coolObjectsQueue = coolObjectsQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10000; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("created cool object with id: " + i);
			coolObjectsQueue.add(new CoolObject(String.valueOf(i), 1));
		}
	}

}
