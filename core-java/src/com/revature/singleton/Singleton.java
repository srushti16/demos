package com.revature.singleton;

public class Singleton {
	private static Singleton s = new Singleton();

	private boolean isSingleton = true;

	private Singleton() {
		super();
	}

	public static Singleton getSingleton() {
		return s;
	}

	public boolean getIsSingleton() {
		return this.isSingleton;
	}

}
