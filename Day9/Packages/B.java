package com.java.Day9.Packages;

public class B {
	A a = new A();
	
	public void m2() {
		System.out.println("m2 from B");
//		System.out.println(a.i); // i is not accessible because the variable is private in the class A
		System.out.println(a.p);
	}
}
