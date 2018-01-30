package com.revature.arrays;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {

		int[] arr = { 10, 2, 4, 5 };
		String[] arr2 = new String[5];
		arr2[1] = "hello";

		arr[0] = 20;

		System.out.println(Arrays.toString(arr2));

		// for(int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }
		//
		// for(int i: arr) {
		// System.out.println(i);
		// }
		//
	}
}
