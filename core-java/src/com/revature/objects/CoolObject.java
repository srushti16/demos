package com.revature.objects;

public class CoolObject {
	String coolStuff;
	private int quantity;
	public boolean random;
	
	public static int numCoolObjects = 0; // this is a static field meaning it is stored on the class level

	public CoolObject() {
		super();
		numCoolObjects++;
	}

	public CoolObject(String coolStuff, int quantity) {
		this();
		this.coolStuff = coolStuff;
		this.quantity = quantity;
	}

	public String getCoolStuff() {
		return coolStuff;
	}

	public void setCoolStuff(String coolStuff) {
		this.coolStuff = coolStuff;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
