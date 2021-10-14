package com.java.Day5.SuperKeyword;

//super keyword is applicable in inheritance only
//refers only to the immediate parent class' 
class Vehicle{
	int speed = 80;
	
	void show() {
		System.out.println("Speed of the vehicle is: " +speed);
	}
}

public class Bike extends Vehicle{
	int speed = 60; // local to the bike class
	void show() { // method overridden
		System.out.println("Speed of the vehicle is: " +this.speed);
		System.out.println("SPeed of the vehicle is: " +super.speed);
	}
	
	public static void main(String[] args) {
		
		Bike b1 = new Bike();
//		b1.show();
		
		//factory methods
		
		Vehicle v;
		v = new Bike();
		v.show(); //output will be 60 and 80
		
		v = new Vehicle();
		v.show(); //output will be 80

	}

}
