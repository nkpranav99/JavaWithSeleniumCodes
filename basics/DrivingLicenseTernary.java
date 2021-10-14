package com.java.basics;

import java.util.*;
public class DrivingLicenseTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age = sc.nextInt();
		boolean eligible = (age >= 18) ? true : false;
		if(eligible) {
			System.out.println("You are eligible for a driving license!");
		}
		else {
			System.out.println("Please try once you are 18 years old.");
		}

	}

}
