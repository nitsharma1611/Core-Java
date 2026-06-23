package com.rays.cloning;

public class Employee1 implements Cloneable {
	public int id;
	public String name;
	public Address address;

	
	
	
	
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.address=new Address("Indore");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
Employee1 e1=(Employee1)super.clone();
e1.address=(Address) address.clone();
		return e1;
	}

	@Override
	public String toString() {

		return "id: "+id+"   "+" name: "+ name;
	}

}
