package com.java.Day4;

public class OverloadingMain {
	
	public static void main(int i) {
		System.out.println("Main with int " +i);
	}
	public static void main(float f) {
		System.out.println("Main with float: " +f);
	}

	public static void main(String[] args) {
		
		System.out.println("Main with string array.");
		main(89);
		main(23.54f);

	}

}
