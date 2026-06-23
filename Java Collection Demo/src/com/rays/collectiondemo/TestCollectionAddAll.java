package com.rays.collectiondemo;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAddAll {
public static void main(String[] args) {
	Collection c = new ArrayList();

	c.add(45);
	c.add("Ram");
	c.add('a');
	c.add(4.2);
	c.add(true);
	System.out.println(c);
	System.out.println("size of c: " + c.size());
	System.out.println("------------------------");
	Collection c1 = new ArrayList();
	c1.add(74);
	c1.add("raj");
	c1.add('J');
	//c.addAll(c1);
	//System.out.println(c);
	c1.addAll(c);
	
	System.out.println(c1);
	
	System.out.println("size of c: " + c1.size());
	System.out.println("Contains raj:"+c1.containsAll(c));
	
	System.out.println("RetainAll "+c1.retainAll(c));
	System.out.println(c1);
	
	System.out.println("RemoveAll "+c1.removeAll(c));
	System.out.println(c1);
}
}
