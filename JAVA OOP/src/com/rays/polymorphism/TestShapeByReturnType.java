package com.rays.polymorphism;

public class TestShapeByReturnType {
public static void main(String[] args) {
	Shape[] shape=new Shape[3];
	shape[0] =Shape.getShape(1);
	shape[1] =Shape.getShape(2);
	shape[2] =Shape.getShape(3);
	Circle c = (Circle) shape[0];
	c.setRadius(5);

	Rectangle r = (Rectangle) shape[1];
	r.setLength(4);
	r.setWidth(7);

	Triangle t = (Triangle) shape[2];
	t.setBase(6);
	t.setHeight(4);

	for(int i=0;i<shape.length;i++) {
		System.out.println(shape[i].area());
	}
}
}
