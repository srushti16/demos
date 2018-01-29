package com.revature.launcher;

import com.revature.objects.CoolObject;

/**
 * 
 * @author USER
 * 
 *         Used to demonstrate both scopes, constructors, access modifiers, and
 *         methods
 *
 */
public class ObjectsLauncher {
	public static void main(String[] args) {
		System.out.println("there are this number of cool objects: " + CoolObject.numCoolObjects);
		
		CoolObject c = new CoolObject("flames", 25);
		System.out.println(c.getCoolStuff());

		CoolObject c2 = new CoolObject("bunnies", 7);
		System.out.println(c2.random);
		c2.random = true;
		System.out.println(c2.random);

		System.out.println("cool object 2 has " + c2.getCoolStuff());
		System.out.println("cool object original still has" + c.getCoolStuff());
	
		System.out.println("there are this number of cool objects: " + CoolObject.numCoolObjects);
	}
}
