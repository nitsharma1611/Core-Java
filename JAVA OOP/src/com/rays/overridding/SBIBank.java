package com.rays.overridding;

public class SBIBank extends Bank{

	@Override
	public String getName() {
		
		return "SBI";
	}

	@Override
	public double getInterestRate() {
		
		return 9;
	}

}
