package com.rays.exceptionhanding;

public class InsufficientFundException extends RuntimeException {

	public InsufficientFundException() {
		super("insufficient Fund transfer");
		
	}

}
