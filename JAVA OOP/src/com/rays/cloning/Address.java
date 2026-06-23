package com.rays.cloning;

public class Address implements Cloneable{
public String address;

public Address(String address) {
	super();
	this.address = address;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}

@Override
public String toString() {
	
	return super.toString();
}

}
