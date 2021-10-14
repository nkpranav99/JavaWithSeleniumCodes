package com.java.Day4;

public class MethodOverloadingTypes {
	void sum(int a, int b) {
		System.out.println("Sum of integers: " +(a+b));
	}
	
	void sum(float a, float b) {
		System.out.println("Sum of floats: " +String.format("%.2f", a+b));
	}
	public static void main(String[] args) {
		MethodOverloadingTypes obj = new MethodOverloadingTypes();
		
		obj.sum(12f, 23f);
		obj.sum(2.14f, 3.7f);

	}

}
