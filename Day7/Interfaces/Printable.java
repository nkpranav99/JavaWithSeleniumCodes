package com.java.Day7.Interfaces;

public interface Printable {
	int data = 80; // by default it is public, static and final
	void print(); // abstract method must be overridden
	
	default void m1() { // may of may not be overridden
		// by default all methods are abstract; for concrete implementation, default or static can be used
		// default can be overridden, static cannot be
		System.out.println("default method m1 from Printable.");
	}
	
	static void m2() { // cannot be overridden
		System.out.println("Static method m2 from Printable.");
	}
	
}
