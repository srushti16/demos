package com.revature.purely;

import com.revature.objects.CoolObject;

public class PassByValue {
	
	public static void main(String[] args) {
//		int i = 5;
//		passByValuePrimitive(i);
//		System.out.println(i);
		
		CoolObject c = new CoolObject("21", 21);
		passByValueObject(c);
		System.out.println(c.getCoolStuff());
	}

	private static void passByValuePrimitive(int i) {
		i++;
	}

	private static void passByValueObject(CoolObject c) {
//		c.setCoolStuff("31");
		c = new CoolObject("31", 31);
	}
}
