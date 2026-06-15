package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
public static void main(String[] args) {
	LocalDate now=LocalDate.now();
	LocalDate now1=LocalDate.of(1987, 9, 10);
	Period p=Period.between(now1, now);
	System.out.println("Year: "+p.getYears()+" "+"Month: "+p.getMonths()+" "+"Days:"+p.getDays());
}
}
