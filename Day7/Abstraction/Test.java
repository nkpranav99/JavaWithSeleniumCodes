package com.java.Day7.Abstraction;

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	
	@Override
	void draw(){
		System.out.println("Drawing a circle.");
	}
}
class Rectangle extends Shape{
	@Override
	void draw(){
		System.out.println("Drawing a rectangle.");
	}
}

abstract class Triangle extends Shape{
//	void draw() {
//		System.out.println("Drawing a triangle.");
//	}
}

class UpperTriangle extends Triangle{

	@Override
	void draw() {
		System.out.println("Drawing Upper Triangle");
		
	}
	
}

class LowerTriangle extends Triangle{

	@Override
	void draw() {
		System.out.println("Drawing Lower Triangle");
		
	}
	
}

public class Test {

	public static void main(String[] args) {
//		Shape s = new Shape; // cannot instantiate an abstract class
		Shape s; // can create a reference of the class
		s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
//		s = new Triangle(); // not allowed

		UpperTriangle u = new UpperTriangle();
		u.draw();
		
		LowerTriangle l = new LowerTriangle();
		l.draw();
		
	}

}
