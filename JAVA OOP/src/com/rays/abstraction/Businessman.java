package com.rays.abstraction;

public class Businessman extends Person implements SocialWorker,Richman{

	@Override
	public void earnMoney() {
		System.out.println("earnMoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}

	@Override
	public void helpToOthers() {
		System.out.println("Help To Others");
		
	}

}
