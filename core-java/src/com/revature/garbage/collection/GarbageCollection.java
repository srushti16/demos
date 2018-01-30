package com.revature.garbage.collection;

import com.revature.beans.Trash;

public class GarbageCollection {

	public static void main(String[] args) throws InterruptedException {

		Trash t1 = new Trash(1);
		Trash t2 = new Trash(2);

		for (int i = 1; i < 100; i++) {
			new Trash(i);
		}

		t1 = null;
		t2 = null;

		System.gc(); // although you should really never have this line of code anywhere in your
						// application

		// for(int i = 1; i < 100000000; i++) {
		// new Trash(i);
		// }

	}
}
