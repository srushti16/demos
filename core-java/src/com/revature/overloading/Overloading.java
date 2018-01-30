package com.revature.overloading;

/**
 * 
 * @author USER
 *
 *         To overload a method we must either vary the number of parameters or
 *         the types of the paremeters
 */
public class Overloading {

	public static void main(String... args) {
		Overloading ol = new Overloading();
		Integer j = 7;

		ol.overloaded(4,5);
	}

	public void overloaded(Long l) {
		System.out.println("Long");
	}

	public void overloaded(long l) {
		System.out.println("long");
	}

	public void overloaded(Integer i) {
		System.out.println("Integer");
	}

	public void overloaded(int i) {
		System.out.println("int");
	}

	public void overloaded(int i, int j) {
		System.out.println("two parameters");
	}

	// we can have 1 var args and it has to be the last parameter, denoted by ...
	public void overloaded(int i, int... params) {
		for(int p: params) {
			System.out.println(p);
		}
	}

}
