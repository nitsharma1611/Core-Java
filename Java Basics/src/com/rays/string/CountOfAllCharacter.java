package com.rays.string;

public class CountOfAllCharacter {
public static void main(String[] args) {
	String name="Vijay Dinanath Chauhan";
	int count=0;
	for(char i='a';i<='z';i++) {
		for(int x=0;x<name.length();x++) {
			if(i==name.charAt(x)) {
			count++;
			}
		}
	}
	System.out.println("Character's "+count);
}
}
