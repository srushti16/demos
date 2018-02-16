package com.revature.beans;

public class Sword {
	private int id;

	private String name;

	// on scale from 1 to 10
	private int sharpness;

	// length in inches
	private double length;

	private int killCount;

	public Sword() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sword(int id, String name, int sharpness, double length, int killCount) {
		super();
		this.id = id;
		this.name = name;
		this.sharpness = sharpness;
		this.length = length;
		this.killCount = killCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSharpness() {
		return sharpness;
	}

	public void setSharpness(int sharpness) {
		this.sharpness = sharpness;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getKillCount() {
		return killCount;
	}

	public void setKillCount(int killCount) {
		this.killCount = killCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + killCount;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sharpness;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sword other = (Sword) obj;
		if (id != other.id)
			return false;
		if (killCount != other.killCount)
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sharpness != other.sharpness)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sword [id=" + id + ", name=" + name + ", sharpness=" + sharpness + ", length=" + length + ", killCount="
				+ killCount + "]";
	}

}
