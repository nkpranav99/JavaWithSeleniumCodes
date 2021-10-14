package com.java.Day4;

public class MethodOverloadingExample {
	void printArea(float r) {
		System.out.println("Area of the circle: " +(3.14*r*r));
	}
	
	void printArea(float length, float breadth) {
		System.out.println("Area of the circle: " +String.format("%.2f", length*breadth));
	}
	
	void printArea(float pt, float base, float height) {
		System.out.println("Area of the circle: " +pt*base*height);
	}
	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		
		obj.printArea(9f);
		obj.printArea(12f, 23f);
		obj.printArea(0.5f, 4f, 3f);

	}

}
