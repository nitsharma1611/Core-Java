package com.rays.polymorphism;

public class TestShapeByMethodArgument {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		System.out.println("length of shape array: " + shape.length);
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[2] = new Triangle();
		Circle c = (Circle) shape[0];
		c.setRadius(5);

		Rectangle r = (Rectangle) shape[1];
		r.setLength(4);
		r.setWidth(7);

		Triangle t = (Triangle) shape[2];
		t.setBase(6);
		t.setHeight(4);

		double totalArea = calArea(shape);
		System.out.println("Total Area is: "+totalArea);
	}

	private static double calArea(Shape[] shape) {
		double totalArea = 0.0;
		for (int i = 0; i < shape.length; i++) {
			System.out.println("Area: " + shape[i].area());
			totalArea = totalArea + shape[i].area();

		}
		return totalArea;
	}
}
