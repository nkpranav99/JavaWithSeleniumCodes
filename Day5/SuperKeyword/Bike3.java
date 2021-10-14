package com.java.Day5.SuperKeyword;

class Vehicle3{
	Vehicle3(){
		System.out.println("Parent Constructor.");
	}
	Vehicle3(int s){
		System.out.println("Vehicle is running with a speed of: " +s);
	}
}

public class Bike3 extends Vehicle3{
	Bike3(){
//		super();
		super(80); // if parent class doesn't have a default constructor and 
		//only has a parameterized constructor then the super needs to be explicitly defined as a parameterized constructor.
		
		System.out.println("Child Constructor.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike3 b = new Bike3();

	}

}
