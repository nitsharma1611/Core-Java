package com.rays.inheritance;

import com.rays.encapsulation.Shape;

public class Triangle extends Shape {
private int base;
private int height;

public void setBase(int base) {
	this.base=base;
}
public void setHeight(int height) {
	this.height=height;
}

public int getBase() {
	return base;
}
public int getHeight() {
	return height;
}





public double area() {
	return (base*height)/2;
}
}
