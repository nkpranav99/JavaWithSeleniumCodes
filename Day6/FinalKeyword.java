package com.java.Day6;

public class FinalKeyword {
	final int f = 10; // final members must be initialised either while declaring it or in the constructor
	final int e;
	
	FinalKeyword() {
		e = 10;
	}
	
	void show() {
		System.out.println(f);
	}
	public static void main(String[] args) {
		FinalKeyword f1 = new FinalKeyword();
		f1.show();
		
//		f1.f = 21; // cannot be assigned since f is a final data member
	}
}
