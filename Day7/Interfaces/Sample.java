package com.java.Day7.Interfaces;

public class Sample implements Printable{

	public static void main(String[] args) {
		Sample s = new Sample();
		s.print();
		System.out.println(data);
		s.print();
		Printable.m2();
	}

	@Override
	public void print() {
		System.out.println("Print method from Sample.");
		
	}
	@Override
	public void m1() {
		System.out.println("m1 method from Sample.");
	}

}
