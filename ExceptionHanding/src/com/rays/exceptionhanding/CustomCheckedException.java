package com.rays.exceptionhanding;

public class CustomCheckedException {
public static void main(String[] args)  {
	dad();
}
public static void dad()   {
	try {
		mom();	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}


public static void mom() throws MistakeException {
	son();
}

public static void son() throws MistakeException{
	MistakeException e=new MistakeException();
	throw e;
}



}
