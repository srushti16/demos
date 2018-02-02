package com.revature.singleton;

public class SingletonLauncher {
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();
		
		System.out.println(s.getIsSingleton());
	}
}
