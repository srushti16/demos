package com.revature.exceptions;

public class ExceptionsExample {
	public static void main(String[] args) {
		// canThrowException();
		try {
			mayThrowException();
			System.out.println("arr");
			int[] arr = new int[4];
			arr[4] = 5;
		} catch (RuntimeException e) {
			System.out.println("runtime exception occured");
		} catch (Exception e) {
			System.out.println("recovered from the exception thrown by the method");
		} finally {
			System.out.println("I always execute regardless of if an exception was thrown or not");
		}
		System.out.println("done");
	}

	private static void mayThrowException() throws Exception {
		throw new Exception();
	}

	private static void canThrowException() {
		try {
			System.out.println("About to throw an exception");
			// throw new Exception();

		} catch (Exception e) {
			System.out.println("exeption thrown and we recovered to keep going");
		}

		System.out.println("method finishing");
	}

}
