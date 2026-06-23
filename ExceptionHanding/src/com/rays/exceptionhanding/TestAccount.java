package com.rays.exceptionhanding;

public abstract class TestAccount {
	public static void main(String[] args) {

		Account ac = new Account();
		ac.setBalance(1500);
		System.out.println(ac.getBalance());
		ac.widthdraw(2200);
		System.out.println(ac.getBalance());

	}
}
