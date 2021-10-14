package com.java.Day7.Abstraction;

public class B extends TestB{
	
	B(){
		System.out.println("Constructor of B.");
	}
	
	@Override
	void m2() {
		System.out.println("m2 method of class Test B.");
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		m3();

	}

}
