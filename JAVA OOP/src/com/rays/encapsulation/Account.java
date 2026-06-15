package com.rays.encapsulation;

public class Account {
	private String bankName;
	private String accountNumber;
	private String accountType;
	private double balance;

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amount) {
		if (amount > balance || balance - amount < 1000 ) {
			System.out.println("Insuffient balance in account Minimum balance require 1000");
		} else {
			balance = balance - amount;
		}
	}

}
