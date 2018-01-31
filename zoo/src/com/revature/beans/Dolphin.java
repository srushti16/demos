package com.revature.beans;

public class Dolphin extends Mammal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1668596245680536241L;
	private boolean canEchoLocate;

	public boolean isCanEchoLocate() {
		return canEchoLocate;
	}

	public void setCanEchoLocate(boolean canEchoLocate) {
		this.canEchoLocate = canEchoLocate;
	}

	public Dolphin(boolean canEchoLocate, String hairColor) {
		super(hairColor);
		this.canEchoLocate = canEchoLocate;
	}

	public Dolphin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dolphin(String hairColor) {
		super(hairColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dolphin [canEchoLocate=" + canEchoLocate + ", hairColor=" + hairColor + ", bloodType=" + bloodType
				+ ", canLactate=" + canLactate + "]";
	}

	@Override
	public void sleep(int minutes) {
		System.out.println("one brain hemisphere at a time");
	}

}
