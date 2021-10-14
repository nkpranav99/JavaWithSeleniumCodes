package com.java.Day8.Strings;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1 = "Hello, How are you?";
		String s2 = "Welcome";
		String s3 = "Bad-luck";
		String s4 = "Hello";
		String s5 = "Good";
		
		System.out.println(s1.charAt(0)); // H
		System.out.println(s2.length()); // 7
		System.out.println(s1.substring(7)); // How are you?
		System.out.println(s1.substring(7,14)); // How are
		System.out.println(s2.indexOf('e')); // for first occurence only
		System.out.println(s2.indexOf('e',2));
		System.out.println(s4.toUpperCase());
		System.out.println(s3.replace("Bad", "Good"));
		System.out.println(s5.equals("Good")); //true
		System.out.println(s5.equals("good")); //false
		System.out.println(s1.contains("are")); //true
		
		System.out.println(s1.endsWith("you?"));
		
		System.out.println(s5.equalsIgnoreCase("good"));
		System.out.println(s3.trim());

	}

}
