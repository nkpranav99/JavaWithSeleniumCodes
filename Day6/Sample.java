package com.java.Day6;

class Parent{
	void show() {
		System.out.println("Show method of the parent.");
	}
	
	final void display() {
		System.out.println("Parent class' display method canno be overridden.");
	}
}

public class Sample extends Parent{ //parent class if marked final, cannot be extended.
	final int f;
	
	Sample(){
		f = 80;
	}
	
	void show() {
		System.out.println("Show method of the child class.");
	}
	
//	void display() {	// cant override the parent's display method
//		System.out.println("Display method of the child class.");
//	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();

	}

}
