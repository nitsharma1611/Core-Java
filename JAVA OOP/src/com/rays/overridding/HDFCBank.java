package com.rays.overridding;

public class HDFCBank extends Bank{

	@Override
	public String getName() {
		
		return "HDFC";
	}

	@Override
	public double getInterestRate() {
		
		return 11.11;
	}

}
