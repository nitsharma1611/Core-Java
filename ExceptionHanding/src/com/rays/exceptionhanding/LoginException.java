package com.rays.exceptionhanding;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("user not found");
		
	}

}
