package com.revature.strings;

import java.util.Arrays;

public class StringsExample {
	public static void main(String[] args) {
//		String one = "he";
//		String two = "hello";
//		String three = two.substring(0, 2);
//		three = three.intern(); // intern takes a string from outside the string pool and puts it in the string pool
//		System.out.println(three == "he");
//		
//		String[] split = two.split("");
//		
////		String joined = Arrays.stream(split).reduce( (acc, cur) -> acc+cur).get();
////		System.out.println("joing = " + joined);
//		
//		System.out.println(Arrays.toString(split));
//		
//		System.out.println("           hello              ".trim());
//		
//		System.out.println("hello".charAt(4));
//		
//		System.out.println("hello".codePointAt(1));
//		
//		System.out.println("he".concat("llo"));
		
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world");
		
		sb.setLength(3);
		
		
		System.out.println(sb);
		
		
	}

}
