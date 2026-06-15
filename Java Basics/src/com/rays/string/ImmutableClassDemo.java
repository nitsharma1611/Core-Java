package com.rays.string;

public final class ImmutableClassDemo {

	private final String name;
	private final String surname;
	
	public ImmutableClassDemo(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	
}
