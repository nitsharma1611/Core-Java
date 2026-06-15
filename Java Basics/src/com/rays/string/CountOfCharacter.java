package com.rays.string;



public class CountOfCharacter {
public static void main(String[] args) {
	
	String name="Vijay Dinanath chauhan";
	
	int count=0;
	char c='a';
for(int i=0;i<name.length();i++) {
	
	if(c==name.charAt(i)) {
		count++;
	}
	
}System.out.println("Count of Character "+count);
	
}
}
