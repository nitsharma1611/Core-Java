package com.rays.constructor;

public class Shape1 {
private String color;
private int borderWidth;





public Shape1() {
	System.out.println("this is default constructor");
}





public Shape1(String color) {
	super();
	this.color = color;
	System.out.println("Color: "+this.color);
}





public Shape1(String color, int borderWidth) {
	this(color);
	this.borderWidth = borderWidth;
	System.out.println(" Color: "+this.color+"  "+"BorderWidth: "+this.borderWidth);
}

}
