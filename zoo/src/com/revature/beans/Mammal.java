package com.revature.beans;

import java.io.Serializable;

public abstract class Mammal implements Serializable {
	protected String hairColor;
	protected final String bloodType = "warm";
	protected final boolean canLactate = true;

	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mammal(String hairColor) {
		super();
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getBloodType() {
		return bloodType;
	}

	public boolean isCanLactate() {
		return canLactate;
	}

	public abstract void sleep(int minutes);

}
