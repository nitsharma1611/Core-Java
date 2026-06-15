package com.rays.constructor;

public class TestAccount {
public static void main(String[] args) {
	Account acc=new Account("7548926254", "Saving Account",5000);

System.out.println(acc.getNumber());
System.out.println(acc.getAccountType());
System.out.println(acc.getBalance());


}
}
