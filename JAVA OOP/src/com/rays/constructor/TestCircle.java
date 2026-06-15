package com.rays.constructor;

public class TestCircle {
public static void main(String[] args) {
	Circle c=new Circle(7, "Red", 2);
	
	System.out.println("BorderWidth is: "+c.getBorderWidth());
System.out.println("Circle Color: "+c.getColor());
System.out.println("Circle radius: "+c.getRadius());

}
}
