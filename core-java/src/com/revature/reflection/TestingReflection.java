package com.revature.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.revature.beans.Cereal;

public class TestingReflection {
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<Cereal> cerealClass = Cereal.class;

		System.out.println(cerealClass.getName());
		System.out.println("\tMethods");
		Method[] methods = cerealClass.getMethods();
		for (Method m : methods) {
			System.out.println("\t\t" + m);
		}

		System.out.println("\tFields");
		Field[] fields = cerealClass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("\t\t" + f);
		}

		System.out.println("\tConstructors");
		Constructor<Cereal>[] constructors = (Constructor<Cereal>[]) cerealClass.getConstructors();
		for (Constructor c : constructors) {
			System.out.println("\t\t" + c);
		}

		Cereal c = new Cereal("cardboard box", 7, true, "cinnamon toast crunch");
		System.out.println("cereals name is " + c.getName());
		Field nameField = cerealClass.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(c, "trix");
		System.out.println("now cereals name is " + c.getName());
	}
}
