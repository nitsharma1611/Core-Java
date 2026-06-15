package com.rays.inheritance;

import com.rays.encapsulation.Person;

public class Doctor extends Person {

	private String registrationNo;
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo=registrationNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	
	
}