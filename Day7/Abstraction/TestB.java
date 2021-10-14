package com.java.Day7.Abstraction;

// Abstract classes need not have only abstract methods but can have concrete methods, static, constructors as well
//

public abstract class TestB {
	TestB(){
		System.out.println("Test B Class Constructor.");
	}
	void m1() { // non static, non abstract method; may or may not be overridden
		System.out.println("m1 from Test B.");
	}
	
	abstract void m2();
	
//	static void m3(); // static methods should be concrete
	
	static void m3() { // since static, cannot be overridden
		System.out.println("Static method from Test B.");
	}
	
	public static void main(String[] args) {
		//only m3() can be called from the main method directly
		
		

	}

}
