package com.rays.date;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate local = LocalDate.now();
		System.out.println("Current Date: " + local);
		System.out.println("Current Year: " + local.getYear());
		System.out.println("Day of year:" + local.getDayOfYear());
		System.out.println("Current Month: " + local.getMonth());
		System.out.println("Day of month: " + local.getDayOfMonth());
		System.out.println("Day of Week: " + local.getDayOfWeek());
		
		System.out.println("==================================");
		
		LocalDate old = LocalDate.of(2000, 11, 20);
		System.out.println("Current Date: " + old);
		System.out.println("Current Year: " + old.getYear());
		System.out.println("Day of year:" + old.getDayOfYear());
		System.out.println("Current Month: " + old.getMonth());
		System.out.println("Day of month: " + old.getDayOfMonth());
		System.out.println("Day of Week: " + old.getDayOfWeek());
System.out.println("Age of :"+(local.getYear()-old.getYear()));
	}
}
