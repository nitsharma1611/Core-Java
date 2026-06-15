package com.rays.overridding;

public class ICICIBank extends Bank {

	@Override
	public String getName() {
	
		return "ICICI";
	}

	@Override
	public double getInterestRate() {
		
		return 12.0;
	}

}
