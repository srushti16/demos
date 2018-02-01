package com.revature.threading;

public class BlockingThread implements Runnable {
	private BlockingObject bo;

	public BlockingThread(BlockingObject bo) {
		super();
		this.bo = bo;
	}

	@Override
	public void run() {
		bo.block();
	}

}
