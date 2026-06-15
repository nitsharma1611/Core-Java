package com.rays.overridding;

public class TestShape {
public static void main(String[] args) {
	Circle c=new Circle(5);
	System.out.println(c.getRadius());
	
	System.out.println(c.area());
	System.out.println("=========================");
	Rectangle r=new Rectangle(8,5);
	System.out.println(r.area());
	System.out.println("=========================");

	
	Triangle t=new Triangle(8,6);
	System.out.println(t.area());
	System.out.println("=========================");
	
}
}
