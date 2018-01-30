package com.revature.beans;

public class Trash extends Object {

	private int id;

	public Trash() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trash(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Trash other = (Trash) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trash [id=" + id + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Cleaning up trash with id: " + id);
	}

}
