package com.java.Day5.Inheritence;

class Shape{
	void draw() {
		System.out.println("Drawing no shape.");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a Circle.");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectangle.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing a Triangle.");
	}
}
public class DrawShape {

	public static void main(String[] args) {
		

	}

}
