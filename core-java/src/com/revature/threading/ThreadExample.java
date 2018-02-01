package com.revature.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.revature.objects.CoolObject;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println("main threads name is " +
		// Thread.currentThread().getName());

		// create threads by extending the thread class
		// for (int i = 1; i <= 5; i++) {
		// Thread t = new ExtendsThread(i);
		// t.start();
		// }

		// to see the new and runnable states
		// Thread t = new Thread(new RunnableThread());
		// System.out.println("The state of the thread is " + t.getState());
		// t.start();
		// System.out.println("The state of the thread is now " + t.getState());

		// to see the timed waiting and terminated states
		// Thread sleepy = new Thread(new SleepyThread());
		// sleepy.start();
		// Thread.sleep(3000);
		// System.out.println("The state of the sleepy thread is " + sleepy.getState());
		// Thread.sleep(10000);
		// System.out.println("the state of the sleepy thread is now " +
		// sleepy.getState());

		// to see the waiting state
		// Thread sleepy = new Thread(new SleepyThread());
		// sleepy.start();
		// Thread joining = new Thread(new JoiningThread(sleepy));
		// joining.start();
		// Thread.sleep(2000);
		// System.out.println("joining thread is " + joining.getState());

		// to see the blocked state
		// BlockingObject bo = new BlockingObject();
		// Thread blocker = new Thread(new BlockingThread(bo));
		// blocker.start();
		// Thread blocked = new Thread(new BlockingThread(bo));
		// blocked.start();
		// Thread.sleep(1000);
		// System.out.println("blocked is in the state of " + blocked.getState());

		// producer consumer problem
		BlockingQueue<CoolObject> queue = new LinkedBlockingQueue<>(25);
		Thread producer = new Thread(new ProducerThread(queue));
		producer.start();
		Thread consumer = new Thread(new ConsumerThread(queue));
		consumer.start();

	}
}
