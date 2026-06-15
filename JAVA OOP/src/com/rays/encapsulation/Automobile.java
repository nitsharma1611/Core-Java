package com.rays.encapsulation;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_Gears = 5;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void breake() {

		if (speed == 0) {

			System.out.println("Car is already Stop");
		} else {
			speed = speed - 10;
		}

	}

	public void acclerator() {

		if (speed >= 200) {
			System.out.println("Appling Break");
		} else {
			speed = speed + 10;
		}

	}

	public void changeGear(int speed) {
		if (speed > 0 && speed < 20) {
			System.out.println("Shift gear first");
		} else if (speed > 20 && speed < 40) {
			System.out.println("Shift gear first to second");
		} else if (speed > 40 && speed < 60) {
			System.out.println("Shift gear Second to third");
		} else if (speed > 60 && speed < 80) {
			System.out.println("Shift gear third to fourth");
		} else  {
			System.out.println("Shift gear Fourth to fifth");
		}

	}
}
