package com.java.Day9.Package1;

//import com.java.Day9.Packages.A;
//import com.java.Day9.Packages.B;

import com.java.Day9.Packages.*; // only imports classes but not sub packages

public class C {

	public static void main(String[] args) {
		//A a = new A(); // not accessible since package is different
		// hence we can either import or we use fully qualified name
		
		com.java.Day9.Packages.A a = new com.java.Day9.Packages.A(); // fully qualified name
		A a1 = new A();
		B b1 = new B();
		
		a1.m1();
		b1.m2();
		
//		a1.print(); // static method can be accessed but we get a warning
		A.print(); // workaround
	}

}
