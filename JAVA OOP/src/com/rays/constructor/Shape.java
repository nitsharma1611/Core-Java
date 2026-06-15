package com.rays.constructor;

public class Shape {
	private String color;
	private int borderWidth;

	public Shape() {
		System.out.println("this is default constructor");
	};

	public Shape(String color) {

		this.color = color;

		System.out.println("this is parameterized constructor");
	}

	public Shape(String color, int borderWidth) {
		this.borderWidth = borderWidth;
		this.color = color;
		System.out.println("this is parameterized constructor");
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public String getColor() {
		return color;
	}

}
