package com.rays.cloning;

public class TestEmployee {
public static void main(String[] args) throws CloneNotSupportedException {
	Employee e=new Employee(1, "Ram");
	Employee e1=(Employee) e.clone();
	e1.id=2;
	e1.name="Shyam";
	System.out.println("Employee(e)  id:"+e.id+"  "+"Name: "+e.name);
	System.out.println("Employee(e1)  id:"+e1.id+"  "+"Name: "+e1.name);
}

}
