package com.revature.beans;

public class Tiger extends Mammal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1549868622466463340L;
	private int clawSharpness;

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String hairColor) {
		super(hairColor);
		// TODO Auto-generated constructor stub
	}

	public Tiger(int clawSharpness, String hairColor) {
		super(hairColor);
		this.clawSharpness = clawSharpness;
	}

	public int getClawSharpness() {
		return clawSharpness;
	}

	public void setClawSharpness(int clawSharpness) {
		this.clawSharpness = clawSharpness;
	}

	@Override
	public String toString() {
		return "Tiger [clawSharpness=" + clawSharpness + ", hairColor=" + hairColor + ", bloodType=" + bloodType
				+ ", canLactate=" + canLactate + "]";
	}

	@Override
	public void sleep(int minutes) {
		System.out.println("Sleeps with one eye open");

	}

}
