package com.rays.exceptionhanding;

import javax.naming.InsufficientResourcesException;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void widthdraw(double amount) {
		if (amount > this.balance) {
			throw new InsufficientFundException();
		} else {
			this.balance = this.balance - amount;
		}
	}

}
