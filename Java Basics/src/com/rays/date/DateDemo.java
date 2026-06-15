package com.rays.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) throws ParseException {
	Date d= new Date();

	System.out.println(d);
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sdf.format(d));
	
	SimpleDateFormat sdf1=new SimpleDateFormat("MMMM,dd,yyyy");
	System.out.println(sdf1.format(d));
	
	
	Date pDate = sdf.parse("25/09/2025");
	
	System.out.println(pDate);
	
	
}
}
