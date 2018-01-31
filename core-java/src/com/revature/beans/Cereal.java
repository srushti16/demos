package com.revature.beans;

import java.io.Serializable;

/**
 * 
 * @author USER
 *
 *         Serializable is a marker interface - which means that it contains no
 *         methods it is just used to mark something, cloneable is another
 *         marker interface
 *
 */
public class Cereal implements Serializable {
	/**
	 * The serialVersionUID does not need to be here, it will create one if we don't provide it but different computers may 
	 * generate it differently if we do not provide it.
	 */
	private static final long serialVersionUID = -1925069075397645631L;
	
	private String container;
	private int sugar;
	private boolean hasMilk;
	private String name;

	public Cereal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cereal(String container, int sugar, boolean hasMilk, String name) {
		super();
		this.container = container;
		this.sugar = sugar;
		this.hasMilk = hasMilk;
		this.name = name;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public boolean isHasMilk() {
		return hasMilk;
	}

	public void setHasMilk(boolean hasMilk) {
		this.hasMilk = hasMilk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((container == null) ? 0 : container.hashCode());
		result = prime * result + (hasMilk ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sugar;
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
		Cereal other = (Cereal) obj;
		if (container == null) {
			if (other.container != null)
				return false;
		} else if (!container.equals(other.container))
			return false;
		if (hasMilk != other.hasMilk)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sugar != other.sugar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cereal [container=" + container + ", sugar=" + sugar + ", hasMilk=" + hasMilk + ", name=" + name + "]";
	}

}
