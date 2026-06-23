package com.rays.cloning;

public class TestEmployee1 {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee1 e=new Employee1(1, "Ram");
Employee1 e1=(Employee1) e.clone();
e1.id=2;
e1.name="Shyam";
e1.address=new Address("Bhopal"); 
System.out.println(e);
System.out.println(e1);
}
}
