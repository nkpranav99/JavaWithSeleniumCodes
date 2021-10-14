package com.java.Day8.Strings;

public class CounctChars {

	public static void main(String[] args) {
		String s1 = "Welcome";
		int count = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("Count of the letter 'e' is: " +count);
		
		//Enhanced for loop
		//for(value:values)
		count = 0;
		
		for(char ch: s1.toCharArray()) {
			if(ch == 'e') {
				count++;
			}
		}
		System.out.println("Count of the letter 'e' is: " +count);
	}

}
