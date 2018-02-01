package com.revature.beans;

public class Car implements Comparable<Car> {

	public static int i = 5;

	static {
		// executed whent he class is loaded
		System.out.println("hello from the static block");
	}

	{
		// executes anytime an instance of this class is created
		System.out.println("hello");
	}

	private int vin;
	private int horsePower;
	private String make;
	private String model;
	private String color;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int vin, int horsePower, String make, String model, String color) {
		super();
		this.vin = vin;
		this.horsePower = horsePower;
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + horsePower;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + vin;
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (horsePower != other.horsePower)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (vin != other.vin)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", horsePower=" + horsePower + ", make=" + make + ", model=" + model + ", color="
				+ color + "]";
	}

	@Override
	public int compareTo(Car other) {
		return getHorsePower() - other.getHorsePower();
	}

}
