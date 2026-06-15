package com.rays.inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setColor("green");
		System.out.println("Dog Color: " + d.getColor());
		d.bark();
		d.eat();
System.out.println("===============================");
Puppy p=new Puppy();
p.setColor("Pink");
System.out.println(p.getColor());
p.bark();
p.weep();
p.eat();
	}
}
