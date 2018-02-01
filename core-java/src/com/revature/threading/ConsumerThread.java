package com.revature.threading;

import java.util.concurrent.BlockingQueue;

import com.revature.objects.CoolObject;

public class ConsumerThread implements Runnable {

	private BlockingQueue<CoolObject> coolObjectsQueue;

	public ConsumerThread(BlockingQueue<CoolObject> coolObjectsQueue) {
		super();
		this.coolObjectsQueue = coolObjectsQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("took object with id" + coolObjectsQueue.take().getCoolStuff());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
