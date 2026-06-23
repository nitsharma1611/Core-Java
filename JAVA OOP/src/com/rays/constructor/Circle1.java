package com.rays.constructor;

public class Circle1 extends Shape1{
private int radius;

public Circle1(int radius) {
	super();
	this.radius = radius;
	System.out.println("Circle Radius: "+radius);
}
public Circle1(String color,int borderWidth,int radius) {
	super(color,borderWidth);
	this.radius=radius;
	System.out.println("circle Radius: "+radius+"Color: "+color);
	
}
}
