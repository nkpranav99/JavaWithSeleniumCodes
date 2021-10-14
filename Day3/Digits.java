package com.java.Day3;

public class Digits {

	public static void main(String[] args) {
		int CarCost = 4_50_000;
		System.out.println(CarCost);
		
		String num = "450000";
		
		int n = Integer.parseInt(num); //Integer is a wrapper class
		//every primitive datatype has a wrapper class associated with it.
		System.out.println("Car cost: " +n);
	}

}
