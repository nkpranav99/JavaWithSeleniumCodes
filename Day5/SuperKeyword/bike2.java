package com.java.Day5.SuperKeyword;

class Vehicle2{
	void show() {
		System.out.println("Vehicle is running.");
	}
}

public class bike2 extends Vehicle2{
	void show() {
		System.out.println("Bike is running.");
	}
	
	void display() {
		show();
		super.show();
	}
	public static void main(String[] args) {
		bike2 b = new bike2();
		b.display();
	}

}
